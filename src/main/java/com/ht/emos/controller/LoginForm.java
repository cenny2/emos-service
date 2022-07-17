package com.ht.emos.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @ClassName LoginForm
 * @Description TODO:用户登录表单，用于接受前端传递的数据，使用类封装可以对输入规则通过注解校验
 * @Author Wuc
 * @Date 2022/7/16 20:08
 */
@Data
@Schema(description = "用户登录表单类")
public class LoginForm {
//    @NotBlank(message = "用户名不能为空")
//    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message = "username内容不正确")
    @Schema(description = "用户名")
    private String username;

//    @NotBlank(message = "密码不能为空")
//    @Pattern( regexp = "^[a-zA-Z0-9]{6,20}$", message = "password内容不正确")
    @Schema(description = "密码")
    private String password;

    private String openId;



}
