package com.tgram.fegin.client;

import com.tgram.common.entity.User;
import com.tgram.common.respone.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(value = "/user/login")
    Message login(@RequestParam("userName") String userName, @RequestParam("password") String passowrd);

    @RequestMapping("/user/login2")
    Message login2(@RequestBody User user);
}
