package com.springtest.framework.model;

import java.util.Objects;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/23 10:54.
 */
public class User extends  BaseModel{
    private Long id;
    private String name;
    private String pwd;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return  this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return  this;
    }

    public String getPwd() {
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return  this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(pwd, user.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }

}
