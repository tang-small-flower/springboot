package com.nowcoder.community.communiry;

import com.nowcoder.community.communiry.dao.DiscussPostMapper;
import com.nowcoder.community.communiry.dao.UserMapper;
import com.nowcoder.community.communiry.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommuniryApplication.class)
public class TestMapper {
    @Autowired
    private UserMapper usermapper;

    @Test
    public void test_usermapper()
    {
        System.out.println(usermapper.selectById(22));
        System.out.println(usermapper.selectByName("nowcoder23"));
        System.out.println(usermapper.selectByEmail("nowcoder25@sina.com"));
        System.out.println(usermapper.updateStatus(22,0));
        User user=new User();
        user.setCreate_time(new Date());
        user.setEmail("nowcoder988@163.com");
        user.setPassword("123456");
        user.setStatus(1);
        user.setType(1);
        user.setUsername("小花");
        user.setSalt("abc");
        user.setHeader_url("http://static.nowcoder.com/images/head/notify.png");
        System.out.println(usermapper.insertUser(user));
    }
    @Autowired
    private DiscussPostMapper discusspostmapper;
    @Test
    public void test_post()
    {
        System.out.println(discusspostmapper.selectDiscussPostRows(0));
        System.out.println( discusspostmapper.selectDiscussPost(0,0,10));
    }

}
