package cn.asiainfo.serviceimpl;

import cn.asiainfo.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitServiceI {
    //打印日志
    private final Logger logger = LoggerFactory.getLogger(RabbitServiceI.class);

    @RabbitListener(queues = {"atguigu.news"})
    public void receive(User user) {
        logger.info("接收到消息, " + user);
    }
}
