package com.neuedu.his.controller;

import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.pojo.TestUser;
import com.neuedu.his.service.TestUserService;
import com.neuedu.his.service.jpa.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration

public class TestController {
    @Autowired
    private TestUserService testUserService;
    @Autowired
    private UserRepositoryService userRepositoryService;

    @RequestMapping("/testIndex")
    public String testIndex(){
        return "his_index";
    }
    @RequestMapping("/toTestPeiYao")
    public String toTestPeiYao(){
        return "his_peiyao";
    }
    @RequestMapping("/test1")
    public String test1(Model model){
        TestUser user = testUserService.testFindUserById("1");
        TestUserEntity userEntity = testUserService.testFindUserById2("2");
        System.out.println(userEntity.toString());
        model.addAttribute("user",userEntity);
        //System.out.println(user.toString());
        return"index";
    }
    @RequestMapping("/testJPA1")
    public String testJPA1(Model model){
        //TestUserEntity user
        //userRepositoryService.addUser(user);
        List<TestUserEntity> users = userRepositoryService.findAllUser();
        System.out.println("查询到的数量:"+users.size());
        for(TestUserEntity userEntity:users){
            System.out.println(userEntity.toString());
        }
        model.addAttribute("users",users);
        return "ok";
    }

    /*
        使用redis缓存进行用户查询
     */
    @RequestMapping("/findUsers")
    public @ResponseBody List<TestUser> findUsers(){
        return testUserService.testFindAll();
    }

    /*
        test.html
     */
    @RequestMapping("/toTest")
    public String toTest(){
        return "test";
    }
}
