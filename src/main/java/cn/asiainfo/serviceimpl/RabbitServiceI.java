package cn.asiainfo.serviceimpl;

import cn.asiainfo.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitServiceI {

    @RabbitListener(queues = {"atguigu.news"})
    public void receive(User user) {
        System.out.println("接收到消息, " + user);
    }
}
