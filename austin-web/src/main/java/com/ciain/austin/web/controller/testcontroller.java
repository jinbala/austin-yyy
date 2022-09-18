package com.ciain.austin.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @RequestMapping("/test")
    public String test(){
        return "testdemo6666";
    }
}
