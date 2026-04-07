package com.yusufjon_akhmedov.springboot.demo.mybackendapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

    // expose a new endpoint for "yusujon learning spring boot"

    @GetMapping("/learning")
    public String getLearningProcess() {
        return "Yusufjon is learning spring boot for java backend development";
    }
}
