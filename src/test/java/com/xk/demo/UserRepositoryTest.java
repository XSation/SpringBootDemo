package com.xk.demo;

import com.xk.demo.domain.User;
import com.xk.demo.domain.UserRespository;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserRepositoryTest {
    @Autowired
    private UserRespository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userRepository.save(new User("xuekai","xk3440395"));
        userRepository.save(new User("liuqing","lq3440395"));

        Assert.assertEquals(2, userRepository.findAll().size());
        Assert.assertEquals("xk3440395", userRepository.findByUserName("xuekai").getPassWord());
        Assert.assertEquals("xk3440395", userRepository.findByUserNameOrId("xuekai", (long) 3).getPassWord());
    }


}
