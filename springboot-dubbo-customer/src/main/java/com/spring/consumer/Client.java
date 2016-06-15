package com.spring.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/6/15 9:46.
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan("com.spring.consumer")
@ImportResource("classpath:dubbo.xml")
public class Client implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(Client.class,args);
    }

    /**
     * Customize the specified {@link ConfigurableEmbeddedServletContainer}.
     *
     * @param container the container to customize
     */
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8088);
    }
}
