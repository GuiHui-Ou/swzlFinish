package com.ou.swzl.controller;


import com.ou.swzl.entity.request.UserRequest;
import com.ou.swzl.service.IUserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@ApiModel(value = "用户信息")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiModelProperty(value = "用户信息-验证登录")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Boolean userLogin(@RequestBody UserRequest request){
        Boolean res = userService.userLogin(request.getUserPhoneNumber(),request.getUserPassword());
        if (res == true){
            return true;
        }
        return false;
    }

    @ApiModelProperty(value = "用户登录-注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public int userRegister(@RequestBody UserRequest request){
        int res = userService.userRegister(request);
        if (res == 1 ){
            return 1;
        }
        return 0;
    }
}
