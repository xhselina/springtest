package com.spring.springboot.consumer;

import com.spring.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/13 16:45.
 */
@Component
public class ScheduledTask {

    @Autowired
     private HelloService helloService;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        String time = helloService.showCurrentTime("jeffrey");
        System.out.println(time);
    }
}
