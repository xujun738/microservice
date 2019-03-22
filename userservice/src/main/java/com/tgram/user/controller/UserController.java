package com.tgram.user.controller;

import com.tgram.common.entity.User;
import com.tgram.common.entity.UserExample;
import com.tgram.common.respone.Message;
import com.tgram.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2018</p>
 * <p>Company : tgram </p>
 *
 * @author eric
 * @version 1.0
 * @Date 2019/3/21 上午10:58
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/login")
    public Message login(@RequestParam("userName") String userName, @RequestParam("password") String password) {

        Message message = new Message();
        //测试hystrix超时
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if ("admin".equals(userName) && "admin".equals(password)) {
            message.setMsg("登录成功");
        } else {
            message.setMsg("登录失败");
        }
        return message;
    }

    @RequestMapping(value = "/login1")
    @Transactional(rollbackFor = Exception.class)
    public Message login2(@RequestBody User user) throws InterruptedException {

        Message message = new Message();

//        Thread.sleep(7000);
        userMapper.insert(user);
        message.setMsg("插入成功");
        return message;
    }
}
