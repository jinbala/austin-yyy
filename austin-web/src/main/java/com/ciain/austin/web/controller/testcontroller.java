package com.ciain.austin.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @RequestMapping("/test")
    public String test(){
        System.out.println("woxinsuile66666 diaoyong 一次 打印一次");
        return "testdemo6666";
    }
}
