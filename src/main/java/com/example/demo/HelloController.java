package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "AKS IS WORKING 🚀";
    }

    @GetMapping("/hello")
    public String hello() {
        return "HELLO FROM AKS";
    }

    @GetMapping("/test")
    public String test() {
        return "TEST ENDPOINT WORKING";
    }
}
