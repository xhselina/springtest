package com.spring.guides.task;

import com.spring.guides.resttemplate.Quote;
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
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        System.out.println("the time is now :" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "/n" + quote.toString());
    }
}
