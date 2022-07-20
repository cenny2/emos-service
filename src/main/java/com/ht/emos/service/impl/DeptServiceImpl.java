package com.ht.emos.service.impl;

import com.ht.emos.mapper.TbDeptDao;
import com.ht.emos.proj.TbDept;
import com.ht.emos.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/20 22:13
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private TbDeptDao deptDao;
    @Override
    public List<TbDept> queryAllDept() {

        return deptDao.queryAllDept();
    }
}
