package com.spring.springboot.controller;

import com.spring.springboot.domain.TUser;
import com.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

//    /**
//     * 根据用户名获取用户信息，包括从库的地址信息
//     *
//     * @param userName
//     * @return
//     */
//    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
//    public User findByName(@RequestParam(value = "userName", required = true) String userName) {
//        return userService.findByName(userName);
//    }
    @RequestMapping(value = "/api/saveUser",method = RequestMethod.GET)
    public String saveUser(@RequestParam(value = "userName",required = true,defaultValue = "caca") String userName){
        TUser tUser = new TUser();
        tUser.setId(1000l);
        tUser.setUsername(userName);
        tUser.setDescription("啊呀呦");
        userService.saveUser(tUser);
        return tUser.toString();
    }

}
