package com.demo_1.demo_1.mytest;

import com.demo_1.demo_1.Demo1ApplicationTests;
import com.demo_1.demo_1.entity.User;
import com.demo_1.demo_1.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
        user.setName("Kate");
        user.setBirthday(LocalDateTime.now());
        userRepository.save(user);
    }
    //Test
    @Test
    public void test2(){
        User user = userRepository.findById(1L).get();
        log.info("User :"+user);
    }
    //自定义的简单查询
    // 1.
    @Test
    public void test3(){
        User user = userRepository.findByName("Jack");
        log.info("通过Name查询" + user);
    }
    // name = "Jack";  Birthday = "2019-01-10 15:16:51" 满足条件的返回，所有放回可能有多个，使用List<User   >
    @Test
    public void test4(){
       List<User> users = userRepository.findByNameOrBirthday("Jack",LocalDateTime.parse("2019-01-10 15:16:51",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
       log.info("通过Name查询" + users);
    }
    //日期时间
    @Test
    public void test5(){
        LocalDateTime dateTime = LocalDateTime.now();
        User user = new User();
        user.setBirthday(dateTime);
        log.info("当前时间："+ dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
        LocalDateTime dateTime1 = LocalDateTime.parse("20181201 230000",formatter);
        log.info("指定格式时间："+dateTime1);
        //LocalDateTime dateTime2 = LocalDateTime.parse();
        /*User user = userRepository.findByName("Jack");
        log.info("通过Name查询" + user);*/
    }
    //模糊查询findByNameLike()
    //注意： Like需要自己 添加上百分号.
    @Test
    public void test6(){
        List<User> users = userRepository.findByNameLike("%Ja");
        log.info("Like模糊查询："+users);
    }
    //相等 field = value   findByXxxxIs()  findByXxxEqual()
    //findByxx
    @Test
    public void test(){


    }
    //jsdkfjklaj
    @Test
    public void test99(){

    }
    //
    @Test
    public void test(){
        $|$
    }
    //
    @Test
    public void test(){

    }




}
