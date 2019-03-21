package com.tgram.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2018</p>
 * <p>Company : tgram </p>
 *
 * @author eric
 * @version 1.0
 * @Date 2019/3/20 下午6:13
 */
@RestController
public class MyController {

    @RequestMapping(value = "/hi")
    public String sayHi(HttpServletRequest request) {

        String x = "hi," + request.getRequestURL()+ ":" + request.getLocalPort();
        System.out.println();
        return x;
    }
}
