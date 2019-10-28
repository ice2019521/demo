package cn;

import cn.asiainfo.Application;
import cn.asiainfo.bean.User;
import cn.asiainfo.dao.PermissionMapper;
import cn.asiainfo.dao.UserMapper;
import cn.asiainfo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<String, User> userRedisTemplate;
    @Autowired
    JavaMailSenderImpl mailSender;
    @Autowired
    RabbitTemplate rabbitTemplate;

    /***
     * 测试rabbitmq发送消息
     * 使用json序列化
     */
    @Test
    public void testRabbitTemplate() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("mesg", "你好");
        map.put("list", Arrays.asList("123456", "你好", true));
        rabbitTemplate.convertAndSend("exchange.direct", "atguigu.news", map);
    }

    /***
     * 接收消息，其实还有一个监听注解可以使用@RabbitListener 见serviceimpl
     */
    @Test
    public void test() {
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o.getClass());
        System.out.println(o);
    }

    @Test
    public void testss() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        rabbitTemplate.convertAndSend("exchange.direct", "atguigu", user);
    }

    @Test
    public void testSimpleMail() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //邮件主题
        mailMessage.setSubject("通知-今晚开会");
        //邮件内容
        mailMessage.setText("今晚7:30开会");

        mailMessage.setTo("3254491475@qq.com");
        mailMessage.setFrom("18848826686@163.com");
        mailSender.send(mailMessage);
    }

    @Test
    public void testMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //设置为true可以发送附件
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //邮件主题
        helper.setSubject("测试");
        //邮件内容,设置为true时为发送html
        helper.setText("<h1 style='color: cornsilk'>你好</h1>", true);

        helper.setTo("3254491475@qq.com");
        helper.setFrom("18848826686@163.com");

        //上传文件
        helper.addAttachment("1.jpg", new File("E:\\images\\yu.jpg"));

        mailSender.send(mimeMessage);
    }


    @Test
    public void testRedis() {
        stringRedisTemplate.opsForValue().append("kk", "vv");
        System.out.println(stringRedisTemplate.opsForValue().get("kk"));
//        List<User> users = new ArrayList<User>();
//        User user1 = new User();
//        user1.setName("1111");
//        user1.setAge(11);
//        user1.setSex("男");
//        user1.setCreateTime(new Date());
//        user1.setUpdateTime(new Date());
//        User user2 = new User();
//        user2.setName("222");
//        user2.setAge(22);
//        user2.setSex("男");
//        user2.setCreateTime(new Date());
//        user2.setUpdateTime(new Date());
//
//        users.add(user1);
//        users.add(user2);
//
    }

    @Test
    public void testResults() {
        userService.selectUsePage(1, 10);
    }

    @Test
    public void testUser() {
        List<User> users = userMapper.selectUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
