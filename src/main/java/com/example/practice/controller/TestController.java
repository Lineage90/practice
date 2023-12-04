package com.example.practice.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello CICD with DockerHub! need money + S3, CodeDeploy 사용입니다";
    }
}
