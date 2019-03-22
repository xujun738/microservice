package com.tgram.fegin.callback;

import com.tgram.common.entity.User;
import com.tgram.common.respone.Message;
import com.tgram.fegin.client.UserService;
import org.springframework.stereotype.Component;

/**
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2018</p>
 * <p>Company : tgram </p>
 *
 * @author eric
 * @version 1.0
 * @Date 2019/3/21 下午5:40
 */
@Component
public class FeignClientFallback implements UserService {

    @Override
    public Message login(String userName, String passowrd) {
        Message message = new Message();
        message.setErrMsg("服务不可用");
        return message;
    }

    @Override
    public Message login2(User user) {
        Message message = new Message();
        message.setErrMsg("插入用户失败");
        return message;
    }
}
