package com.spring.guides.restful;//package com.jeffrey.springtest.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/13 16:05.
 */
@SpringBootApplication
public class ClientRunMain {
    public static void main(String[] args) {
//        SpringApplication.run(ClientRunMain.class, args);
        Enumeration<NetworkInterface> e = null;
        try {
            e = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e1) {
            e1.printStackTrace();
        }
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
