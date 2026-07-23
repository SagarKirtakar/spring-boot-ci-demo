package com.sagar.Hello_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 Hello from Automated Deployment with GitHub Actions Pipeline!";
    }

    @GetMapping("/status")
    public String status() {
        return "✅ Spring Boot Application is Successfully Deployed via GitHub Actions CI/CD Pipeline.";
    }
}