package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String handleDemo01(){
        //log.info("请求进来了");
        return  "Hello Demo Spring Boot!";
    }
}
