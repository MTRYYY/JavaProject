package com.rmt.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull(message = "用户id不能为空")
    private long user_id;

    @NotNull(message = "用户帐号不能为空")
    @Size(min = 6,max = 11,message = "账号必须是6-11个字符")
    private String user_account;

    @NotNull(message = "用户密码不能为空")
    private String user_password;

    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String user_email;
}
