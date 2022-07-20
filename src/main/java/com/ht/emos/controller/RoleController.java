package com.ht.emos.controller;

import com.ht.emos.common.util.ResultObject;
import com.ht.emos.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RoleController
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/20 22:23
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping("searchAllRole")
    public ResultObject searchAllRole(){
        return ResultObject.isOk().put("list",roleService.queryAllRole());
    }


}
