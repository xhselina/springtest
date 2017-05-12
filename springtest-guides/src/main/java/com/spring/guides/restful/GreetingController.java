package com.spring.guides.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/13 15:59.
 */
@RestController
public class GreetingController {
    private static final String template = "hello,%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = {"/greeting","/greeting123"})
    public @ResponseBody Greeting greeting(@RequestParam(value="name",defaultValue = "jeffrey") String name){
        return  new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
