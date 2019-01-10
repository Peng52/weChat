package com.demo_1.demo_1.mytest;

import com.demo_1.demo_1.Demo1ApplicationTests;
import com.demo_1.demo_1.entity.User;
import com.demo_1.demo_1.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author : peng
 * @Description : Jpa 测试
 * @Date : 2019-01-09 18:59
 */
@Slf4j
public class JpaTest extends Demo1ApplicationTests {
    @Autowired
    private UserRepository userRepository;
    ///////
    @Test
    public void test1(){
        User user  = new User();
        user.setName("Jack");
        user.setBirthday(new Date());
        userRepository.save(user);
    }




}
