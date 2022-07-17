package com.ht.emos.service.impl;

import com.ht.emos.controller.LoginForm;
import com.ht.emos.mapper.TbUserDao;
import com.ht.emos.proj.TbUser;
import com.ht.emos.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @ClassName UserServiceImpl
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/16 20:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private TbUserDao userDao;


    @Override
    public TbUser queryFormByUsername(String username) {
        return userDao.searchByUsername(username);
    }

    @Override
    public TbUser checkPassword(String username,String password) {
        return userDao.checkPassword(username,password);
    }

    @Override
    public Set<String> searchUserPermissions(Integer id) {
        return userDao.searchUserPermissions(id);
    }
}
