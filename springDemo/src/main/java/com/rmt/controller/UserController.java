package com.rmt.controller;

import com.rmt.model.entity.User;
import com.rmt.service.intf.UserService;
import com.rmt.utils.ResultVo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public ResultVo<User> getUser(){
        User user = new User();
        user.setUser_id(1L);
        user.setUser_account("12345678");
        user.setUser_password("12345678");
        user.setUser_email("12345678@qq.com");
        return new ResultVo<>(user);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user/*,BindingResult bindingResult*/){

        /**
        System.out.println(user.toString());
        for(ObjectError error : bindingResult.getAllErrors()){
            return error.getDefaultMessage();
        }*/

        return "Success";
    }

}
