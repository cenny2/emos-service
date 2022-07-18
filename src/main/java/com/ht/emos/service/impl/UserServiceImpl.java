package com.ht.emos.service.impl;

import com.ht.emos.mapper.TbUserDao;
import com.ht.emos.proj.TbUser;
import com.ht.emos.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
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
    public TbUser checkPasswordByUserName(String username,String password) {
        return userDao.checkPassword(username,password);
    }

    @Override
    public TbUser checkPasswordById(Integer id, String password) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public Set<String> searchUserPermissions(Integer id) {
        return userDao.searchUserPermissions(id);
    }

    @Override
    public Map<String, String> queryUserInfo(Integer userId) {

        return userDao.queryUserInfo(userId);
    }

    @Override
    public int updatePassword(String password, Integer salt,Integer userId) {
        return userDao.updatePassword(password,salt,userId);
    }
}
