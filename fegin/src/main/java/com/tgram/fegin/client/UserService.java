package com.tgram.fegin.client;

//import com.tgram.common.entity.User;

import com.tgram.common.entity.User;
import com.tgram.common.respone.Message;
import com.tgram.fegin.callback.FeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * userClient用来自定义超时设置
 */
@FeignClient( value = "user-service", fallback = FeignClientFallback.class)
public interface UserService {

    @RequestMapping(value = "/user/login")
    Message login(@RequestParam("userName") String userName, @RequestParam("password") String passowrd);

    @RequestMapping("/user/login1")
    Message login2(@RequestBody User user);
}
