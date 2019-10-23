package com.davon.controller;

import com.davon.dao.IUserDao;
import com.davon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Davon.L
 * @Date: Created in 2019/10/22 0022 15:51
 * @description：
 */
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping("/toLogin")
    public String toLogin(String name,String password){
        if (userService.getPassword(name)!=null){
            System.out.println("用户名不存在!!!");
            return "";
        }else {
            String pwd = userService.getPassword(name);
            if (pwd.equals(password)){
                System.out.println("登录成功!!!");
                return "";
            }else {
                System.out.println("账户密码错误!!!");
                return "";
            }
        }
    }

}
