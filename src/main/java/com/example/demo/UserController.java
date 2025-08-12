package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String demo(){
        return "Deploying Application using ECS with EC2 launch type and ECR";
    }
    
}
