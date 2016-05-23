package com.spring.guides.validatform;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/16 17:45.
 */
public class PersonForm {

    @Size(min = 2, max = 10,message = "名称必须在2-10个字符之间")
    private String name;

    @NotNull(message = "年龄不能为null")
    @Min(value = 18,message = "年龄的最小不能小于18岁")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
