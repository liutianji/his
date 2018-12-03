package com.neuedu.his.controller;

import com.neuedu.his.pojo.TestUser;
import com.neuedu.his.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/json")
public class CorsJsonDataController {

    @Autowired
    private TestUserService testUserService;
    /*
        使用redis缓存进行用户查询
     */
    @GetMapping("/users")
    public List<TestUser> findUsers(){
        return testUserService.testFindAll();
    }
}
