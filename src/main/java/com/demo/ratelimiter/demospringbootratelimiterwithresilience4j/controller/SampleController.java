package com.demo.ratelimiter.demospringbootratelimiterwithresilience4j.controller;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RateLimiter(name = "backendA")
    @GetMapping("/message/a")
    public String getMessageA() {
        System.out.println("getMessageA() is called!");
        return "Message from backend A";
    }

    @RateLimiter(name = "backendB")
    @GetMapping("/message/b")
    public String getMessageB() {
        System.out.println("getMessageB() is called!");
        return "Message from backend B";
    }

    @RateLimiter(name = "backendC")
    @GetMapping("/message/c")
    public String getMessageC() {
        System.out.println("getMessageC() is called!");
        return "Message from backend C which uses default RateLimiter configuration";
    }
}