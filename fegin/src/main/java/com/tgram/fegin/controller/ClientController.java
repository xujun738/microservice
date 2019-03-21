package com.tgram.fegin.controller;

import com.tgram.common.entity.User;
import com.tgram.common.respone.Message;
import com.tgram.fegin.client.FeginClient;
import com.tgram.fegin.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2018</p>
 * <p>Company : tgram </p>
 *
 * @author eric
 * @version 1.0
 * @Date 2019/3/21 上午10:35
 */
@RestController
public class ClientController {

    @Autowired
    private FeginClient feginClient;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi")
    public String sayHi() {
        return feginClient.sayHiClient();
    }

    @RequestMapping(value = "/login")
    public Message login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        return userService.login(userName, password);
    }

    @RequestMapping(value = "/insert")
    public Message insert(@RequestBody User user) {
        return userService.login2(user);
    }

}
