package com.spring.springboot.guides.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by junhuiji on 2017/5/11.
 */
@Component
//@ConfigurationProperties(prefix = "user")
public class UserProperty {
    /**
     * 用户 ID
     */
    @Value("${user.id}")
    private Long id;

    /**
     * 年龄
     */
    @Value("${user.age}")
    private int age;

    /**
     * 用户名称
     */
    @Value("${user.desc}")
    private String desc;

    /**
     * 用户 UUID
     */
    @Value("${user.uuid}")
    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "UserProperty{" +
                "id=" + id +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
