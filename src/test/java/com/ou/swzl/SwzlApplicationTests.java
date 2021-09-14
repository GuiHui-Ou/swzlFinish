package com.ou.swzl;

import com.ou.swzl.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SwzlApplicationTests {

    @Autowired
    IUserService userService;

}
