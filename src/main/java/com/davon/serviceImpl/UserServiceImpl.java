package com.davon.serviceImpl;


import com.davon.dao.IUserDao;
import com.davon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @Author: Davon.L
 * @Date: Created in 2019/10/22 0022 15:20
 * @description：
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao dao;
    public String getPassword(String loginName) {

        return  dao.selectPasswordByName(loginName);
    }

}
