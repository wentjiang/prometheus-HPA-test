package com.wentjiang.prometheusTest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
class TestController() {

    @Resource
    lateinit var prometheusCustomMonitor: PrometheusCustomMonitor

    @GetMapping("/test")
    fun test(): String {
        return "ok"
    }

    @PostMapping("/change/{num}")
    fun changeNum(@PathVariable("num") num: Int): Int {
        prometheusCustomMonitor.atomicValue.set(num)
        return num
    }

    @GetMapping("/get")
    fun getNum(): Int {
        return prometheusCustomMonitor.atomicValue.get()
    }
}