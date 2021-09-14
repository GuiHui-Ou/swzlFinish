package com.ou.swzl.mapper;

import com.ou.swzl.entity.request.UserRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {


    @Select("select * from user where user_phone_number = #{userPhoneNumber} and user_password = #{userPassword}")
    Boolean userLogin(String userPhoneNumber, String userPassword);

    @Insert("insert into user (user_name,user_phone_number,user_password) values (#{userName},#{userPhoneNumber},#{userPassword})")
    int userRegister(UserRequest request);


}
