package com.xk.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWroldController {
    @RequestMapping("/hello")
    public String index() {
        return "HelloWrold";
    }
//    @RequestMapping("/error")
//    public String error() {
//        return "HelloWrold error";
//    }
}



