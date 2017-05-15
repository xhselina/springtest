package com.spring.springboot.service;

import com.spring.springboot.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/15.
 */
public interface UserService {
    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    User findByName(String userName);

}
