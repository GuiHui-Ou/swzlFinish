package com.ou.swzl.service;

import com.ou.swzl.entity.po.User;
import com.ou.swzl.entity.request.UserRequest;

public interface IUserService {

    Boolean userLogin(String userPhoneNumber, String userPassword);

    int userRegister(UserRequest request);
}
