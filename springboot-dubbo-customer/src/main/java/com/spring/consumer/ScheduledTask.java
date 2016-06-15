package com.spring.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

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
