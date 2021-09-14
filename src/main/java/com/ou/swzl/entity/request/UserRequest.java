package com.ou.swzl.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String userName;
    private String userPassword;
    private String userPhoneNumber;

}
