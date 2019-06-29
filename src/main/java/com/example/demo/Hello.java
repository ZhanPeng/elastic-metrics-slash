//package com.example.demo;
//
//import io.micrometer.core.instrument.Counter;
//import io.micrometer.core.instrument.MeterRegistry;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Hello {
//
//    private final Counter counter;
//
//    public Hello(MeterRegistry meterRegistry) {
//        this.counter = meterRegistry.counter("received.counter");
//    }
//
//    public void add() {
//        this.counter.increment();
//    }
//}
