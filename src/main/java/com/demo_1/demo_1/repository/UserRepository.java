package com.demo_1.demo_1.repository;

import com.demo_1.demo_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author peng
 * @description 用户
 * @create 2019-01-09 18:58
 */
public interface UserRepository extends JpaRepository<User,Long> {
    //自定义的查询
    User findByName(String name);

    List<User> findByNameOrBirthday(String name, LocalDateTime birthday);

    List<User> findByNameLike(String name);

}
