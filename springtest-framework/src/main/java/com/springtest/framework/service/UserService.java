package com.springtest.framework.service;

import com.springtest.framework.model.User;

import java.util.List;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/23 10:53.
 */
public interface UserService  {
    public List<User> queryUsersByCondition(User user);
}
