package com.tgram.fegin.callback;

import com.tgram.fegin.client.FeginClient;
import org.springframework.stereotype.Component;

/**
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2018</p>
 * <p>Company : tgram </p>
 *
 * @author eric
 * @version 1.0
 * @Date 2019/3/21 下午5:58
 */
@Component
public class CommonFallback implements FeginClient {
    @Override
    public String sayHiClient() {
        return "测试服务调用失败";
    }
}
