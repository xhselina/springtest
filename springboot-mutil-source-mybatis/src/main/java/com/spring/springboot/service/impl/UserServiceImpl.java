package com.spring.springboot.service.impl;

import com.spring.springboot.dao.master.TUserMapper;
import com.spring.springboot.domain.TUser;
import com.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/15.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public void saveUser(TUser tUser) {
        tUserMapper.insert(tUser);
    }
}
