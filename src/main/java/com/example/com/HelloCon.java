package com.example.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCon {
    @GetMapping("/aa")
    public String hello() {
        System.out.println("okaa");
        return "okaa";
    }
}
