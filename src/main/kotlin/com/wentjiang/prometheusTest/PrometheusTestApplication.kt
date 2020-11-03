package com.wentjiang.prometheusTest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrometheusTestApplication

fun main(args: Array<String>) {
	runApplication<PrometheusTestApplication>(*args)
}
