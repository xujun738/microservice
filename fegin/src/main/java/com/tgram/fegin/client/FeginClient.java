package com.tgram.fegin.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client-service")
public interface FeginClient {

    @RequestMapping(value = "/hi")
    String sayHiClient();

}
