package com.ou.swzl.service.impl;

import com.ou.swzl.entity.request.UserRequest;
import com.ou.swzl.mapper.UserMapper;
import com.ou.swzl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public Boolean userLogin(String userPhoneNumber, String userPassword) {

        Boolean aBoolean=userMapper.userLogin(userPhoneNumber,userPassword);
        if (aBoolean == true){
            return true;
        }
        return null;
    }


    @Override
    public int userRegister(UserRequest request) {
        Boolean aBoolean=userMapper.userLogin(request.getUserPhoneNumber(),request.getUserPassword());
        if (aBoolean == true){
            int res = userMapper.userRegister(request);
            if (res == 1){
                return 1;
            }
        }
        return 0;
    }

}
