package com.ht.emos.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.ht.emos.common.dataenum.CommonEnum;
import com.ht.emos.common.util.MD5Utils;
import com.ht.emos.common.util.ResultObject;
import com.ht.emos.mapper.TbUserDao;
import com.ht.emos.proj.TbUser;
import com.ht.emos.service.UserService;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName UserController
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/16 20:07
 */
@RestController
@RequestMapping("/user")
@Schema(description = "用户Controller")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 校验流程：判断根据用户名查出盐值和openid，通过盐值+密码判断是否正确
     *
     * @param loginForm 用户传递的用户名和密码
     * @return
     */
    @PostMapping("/login")
    public ResultObject login(@RequestBody LoginForm loginForm) {
        TbUser userVo = userService.queryFormByUsername(loginForm.getUsername());
        if (Objects.isNull(userVo)) {
            return new ResultObject().put("result", false);
        }
        //如果用户名存在，校验密码是否正确
        //获取加盐后的密码
        String paswsword = MD5Utils.md5Digest(loginForm.getPassword(), userVo.getSalt());
        //密码校验
        TbUser tbUser = userService.checkPassword(loginForm.getUsername(), paswsword);
        if (Objects.isNull(tbUser)) {
            return new ResultObject().put("result", false);
        }
        //校验通过：设置cookie...
        StpUtil.login(tbUser.getId());
        //获取当前登录用户的权限
        Set<String> permissions = userService.searchUserPermissions(tbUser.getId());
        //权限结果返回前端
        ResultObject result = ResultObject.isOk().put("permissions", permissions);
        result.put("result", tbUser.getId());
        //生成token令牌
        String token = StpUtil.getTokenInfo().getTokenValue();
        result.put("token", token);
        return result;
    }



}
