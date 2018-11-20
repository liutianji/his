package com.neuedu.his.controller;

import com.neuedu.his.pojo.TestUser;
import com.neuedu.his.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration

public class TestController {
    @Autowired
    private TestUserService testUserService;

    @RequestMapping("/test1")
    public String test1(Model model){
        TestUser user = testUserService.testFindUserById("1");
        model.addAttribute("user",user);
        System.out.println(user.toString());
        return"index";
    }
}
