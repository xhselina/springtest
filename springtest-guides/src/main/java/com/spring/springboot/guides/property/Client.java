package com.spring.springboot.guides.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 启动类
 * Created by junhuiji on 2017/5/11.
 */
@SpringBootApplication
@PropertySource("test")
public class Client implements CommandLineRunner {
    @Autowired
    private HomeProperty homeProperty;

    @Autowired
    private UserProperty userProperty;

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(homeProperty.toString());
        System.out.println(userProperty.toString());
    }
}
