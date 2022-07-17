package com.ht.emos.service;

import com.ht.emos.controller.LoginForm;
import com.ht.emos.proj.TbUser;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @ClassName UserService
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/16 20:23
 */

public interface UserService {
    public TbUser queryFormByUsername(String username);

    public TbUser checkPassword(String username,String password );

    Set<String> searchUserPermissions(Integer id);


}
