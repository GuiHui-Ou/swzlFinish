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


    /**
     * 数据库语句
     */
//    CREATE TABLE `user` (
//            `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
//            `user_name` varchar(225) NOT NULL DEFAULT '' COMMENT '用户名',
//            `user_password` varchar(200) NOT NULL COMMENT '用户密码',
//            `user_phone_number` char(13) NOT NULL DEFAULT '',
//    PRIMARY KEY (`user_id`)
//) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8
}
