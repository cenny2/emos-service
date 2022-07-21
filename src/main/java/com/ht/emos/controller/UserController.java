package com.ht.emos.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.annotation.SaMode;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import com.ht.emos.common.exception.EmosException;
import com.ht.emos.common.util.MD5Utils;
import com.ht.emos.common.util.PageUtils;
import com.ht.emos.common.util.ResultObject;
import com.ht.emos.controller.form.LoginForm;
import com.ht.emos.controller.form.PasswordForm;
import com.ht.emos.controller.form.QueryUserByPageForm;
import com.ht.emos.proj.TbUser;
import com.ht.emos.service.UserService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName UserController
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/16 20:07
 */
@CrossOrigin("**")
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
        TbUser tbUser = userService.checkPasswordByUserName(loginForm.getUsername(), paswsword);
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

    @GetMapping("loadUserInfo")
    public ResultObject loadUserInfo(){
        System.out.println(StpUtil.isLogin());
        System.out.println(StpUtil.getLoginIdAsInt());

        Integer userId = StpUtil.getLoginIdAsInt();
        Map<String,String> userInfo = userService.queryUserInfo(userId);
        if (Objects.isNull(userInfo)){
            throw new EmosException("找不到员工信息");
        }
        return ResultObject.isOk().put("result",userInfo);
    }

    @PostMapping("logout")
    public ResultObject logout(){
        StpUtil.logout();
        return ResultObject.isOk();
    }

    /**
     * 用户修改密码
     * @SaCheckLogin:校验用户是否登录，登录才能修改密码
     * @return 返回数据
     */
    @SaCheckLogin
    @PostMapping("updatePassword")
    public ResultObject updatePassword(@RequestBody @Valid PasswordForm passwordForm){
        Integer userId = StpUtil.getLoginIdAsInt();
        //判断旧密码是否与数据库的密码匹配
        TbUser tbUser = userService.checkPasswordById(userId, passwordForm.getPassword());
        String oldPsw = MD5Utils.md5Digest(passwordForm.getPassword(), tbUser.getSalt());
        //输入的密码是否和数据库的密码一致
        if (!oldPsw.equals(tbUser.getPassword())){
            return new ResultObject().put("rows",0).put("msg","原始密码输入错误！");

        }else{
            Map<String, Object> map = MD5Utils.growthPassword(passwordForm.getNewPassword());
            Integer salt = (Integer) map.get("salt");
            String md5Password = map.get("password").toString();
            int rows = userService.updatePassword(md5Password,salt,userId);
            return ResultObject.isOk().put("rows",rows).put("msg","密码修改成功！");
        }
    }

    @PostMapping("/queryUserByPage")
    @SaCheckPermission(value = {"ROOT","USER:SELECT"}, mode = SaMode.OR)
    public ResultObject searchUserByPage(@RequestBody @Valid QueryUserByPageForm queryUserByPageForm){
        //每页多少条数据
        Integer length = queryUserByPageForm.getLength();
        //第几页
        Integer page = queryUserByPageForm.getPage();
        Integer start = (page - 1)*length;
        HashMap hashMap = JSONUtil.parse(queryUserByPageForm).toBean(HashMap.class);
        hashMap.put("start",start);
        PageUtils pageUtils = userService.queryByPage(hashMap);

        return ResultObject.isOk().put("page",pageUtils);

    }

}
