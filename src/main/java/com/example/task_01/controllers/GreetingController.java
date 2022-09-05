package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping
    public String Greeting(@RequestParam(value="name")String name){
        return "Hello "+name;

//        http://localhost:8080/greeting?name=Username
    }
}