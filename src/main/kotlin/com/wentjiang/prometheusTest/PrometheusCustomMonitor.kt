package com.wentjiang.prometheusTest

import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.concurrent.atomic.AtomicInteger

@Component
class PrometheusCustomMonitor(@Autowired val registry: MeterRegistry) {

    lateinit var customValue: Gauge
    final val atomicValue = AtomicInteger()

    init {
        customValue = Gauge.builder("custom_value", atomicValue,
                { obj: AtomicInteger -> obj.get().toDouble() })
                .tag("custom_value", "gauge")
                .description("The request num which server does not have time to process")
                .register(registry)
    }
}