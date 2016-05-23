package com.springtest.framework.service.impl;

import com.springtest.framework.model.User;
import com.springtest.framework.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/23 10:56.
 */
@Service
public class UserServiceImpl implements UserService,InitializingBean {
    @Override
    public List<User> queryUsersByCondition(User user) {
        List<User> users = new ArrayList<>();
        users.add(new User().setId(1l).setName("one").setPwd("onepwd"));
        users.add(new User().setId(2l).setName("two").setPwd("twopwd"));
        users.add(new User().setId(3l).setName("three").setPwd("threepwd"));
        new Throwable("asdf");
        return users;
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("asaaaaaaaaaaaaaaaaaaaa");
    }
}
