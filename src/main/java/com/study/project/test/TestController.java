package com.study.project.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("/test")
    public String hello(){
        return "Hello dael Spring boot";
    }

}
