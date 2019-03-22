package com.tgram.fegin.client;

import com.tgram.fegin.callback.CommonFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client-service", fallback = CommonFallback.class)
public interface FeginClient {

    @RequestMapping(value = "/hi")
    String sayHiClient();

}
