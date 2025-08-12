package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String demo(){
        return "Finally Doing something now. We can Move for Next Process....";
    }
    
}
