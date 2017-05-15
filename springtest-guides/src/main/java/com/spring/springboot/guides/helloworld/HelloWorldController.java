package com.spring.springboot.guides.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junhuiji on 2017/5/11.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello(){
        return  "hello,world!";
    }
}
