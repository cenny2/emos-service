package com.ht.emos.controller.form;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName PasswordForm
 * @Description TODO:
 * @Author Wuc
 * @Date 2022/7/18 21:53
 */
@Data
public class PasswordForm {
    @NotBlank(message = "请输入原始密码")
    private String password;
    
    @NotBlank(message = "密码不能为空")
    private String newPassword;

}
