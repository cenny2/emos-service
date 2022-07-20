package com.ht.emos.service;

import com.ht.emos.common.util.PageUtils;
import com.ht.emos.proj.TbUser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName UserService
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/16 20:23
 */

public interface UserService {
    public TbUser queryFormByUsername(String username);

    public TbUser checkPasswordByUserName(String username,String password );

    public TbUser checkPasswordById(Integer id,String password );

    Set<String> searchUserPermissions(Integer id);


    Map<String, String> queryUserInfo(Integer userId);

    int updatePassword(String md5Password, Integer salt,Integer userId);

    PageUtils queryByPage(HashMap hashMap);

}
