package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        int a=10;
        int b=30;
        int d=10;
        int e=10;
        int f=90;
        return "just testing  " +(a+b+d+e+f);
    }
}
