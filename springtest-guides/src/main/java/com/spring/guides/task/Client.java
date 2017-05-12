package com.spring.guides.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/13 16:48.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@Configuration
//@EnableScheduling
public class Client {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Client.class);
//        app.set(false);
        app.run(args);
//        SpringApplication.run(Client.class,args);
    }
}
