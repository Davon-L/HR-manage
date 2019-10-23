package com.davon.entity;

/**
 * @Author: Davon.L
 * @Date: Created in 2019/10/22 0022 15:08
 * @description：
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer sex;
    private Integer age;

    public User() {
    }

    public User(Integer id, String userName, String password, Integer sex, Integer age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
