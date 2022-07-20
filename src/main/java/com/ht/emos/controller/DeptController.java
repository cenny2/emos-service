package com.ht.emos.controller;

import com.ht.emos.common.util.ResultObject;
import com.ht.emos.mapper.TbDeptDao;
import com.ht.emos.proj.TbDept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DeptController
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/20 22:08
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private TbDeptDao deptDao;

    @GetMapping("/searchAllDept")
    private ResultObject searchAllDept(){
        //查询所有部门数据
        List<TbDept> tbDept = deptDao.queryAllDept();

        return ResultObject.isOk().put("list",tbDept);
    }

}
