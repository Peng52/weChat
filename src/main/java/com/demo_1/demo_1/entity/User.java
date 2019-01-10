package com.demo_1.demo_1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author : peng
 * @Description : 用户相关
 * @Date : 2019-01-09 18:52
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private BigDecimal salary;

    private LocalDateTime birthday;




}
