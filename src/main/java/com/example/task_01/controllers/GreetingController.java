package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/greeting")
public class GreetingController {

//    Task 1 - returning a string

//    @GetMapping
//    public String greet(){
//        return "Good afternoon, Java!";
//        http://localhost:8080/greeting
//    }
//    Task 2 - return POJO
//    @GetMapping
//    public Greeting greet(){
//        return new Greeting("Java","afternoon");
//    }
                //    result:
                    //{
                    //    "name": "Java",
                    //        "timeOfDay": "afternoon"
                    //}

//    Extension task 1 - adding timeOfDay as a @RequestParam
//@GetMapping
//    public Greeting greet(@RequestParam String timeOfDay){
//    return new Greeting("Java",timeOfDay);
//}
//    http://localhost:8080/greeting?timeOfDay=morning
            //result:
            //    {
            //        "name": "Java",
            //            "timeOfDay": "morning"
            //    }
//    Extension task 2 - Celebration DTO
@GetMapping(value = "/christmas")
public Celebration festiveGreeting(){
    return new Celebration("Merry Christmas, Java!");
}
}