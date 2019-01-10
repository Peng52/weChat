package com.demo_1.demo_1.repository;

import com.demo_1.demo_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author peng
 * @description 用户
 * @create 2019-01-09 18:58
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
