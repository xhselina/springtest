package com.spring.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.springboot.service.HelloService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/6/14 17:37.
 */
// 这里的@Service是 dubbo提供的注解
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String showCurrentTime(String name) {
        return "Hello," + name + "，当前时间是：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
