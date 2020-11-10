package com.wentjiang.prometheusTest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrometheusTestApplication

fun main(args: Array<String>) {
	addShutdownHook()
	runApplication<PrometheusTestApplication>(*args)
}

fun addShutdownHook() {
	Runtime.getRuntime().addShutdownHook(Thread(Runnable {
		print("get shut down message")
	}))
}
