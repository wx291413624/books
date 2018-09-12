package com.example.books.model;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户名字
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private String age;
    /**
     * 身份证
     */
    private String card;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 创建时间
     */
    private Date regDate;
    /**
     * 头像
     */
    private String img;


}