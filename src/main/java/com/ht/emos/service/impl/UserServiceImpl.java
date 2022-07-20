package com.ht.emos.service.impl;

import com.ht.emos.common.util.PageUtils;
import com.ht.emos.mapper.TbUserDao;
import com.ht.emos.proj.TbUser;
import com.ht.emos.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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

    @Override
    public PageUtils queryByPage(HashMap hashMap) {
        //查询符合条件的用户数据
        List<HashMap> mapList = userDao.queryUserByPage(hashMap);
        //查询总记录数
        Integer totalCount = userDao.queryPageCount(hashMap);
        PageUtils pageUtils = new PageUtils(mapList,totalCount,(Integer) hashMap.get("page"),(Integer)hashMap.get("length"));
        return pageUtils;
    }


}
