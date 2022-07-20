package com.ht.emos.service.impl;

import com.ht.emos.mapper.TbRoleDao;
import com.ht.emos.proj.TbRole;
import com.ht.emos.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RoleServiceImplk
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/20 22:25
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private TbRoleDao roleDao;

    @Override
    public List<TbRole> queryAllRole() {
        return roleDao.queryAllRole();
    }
}
