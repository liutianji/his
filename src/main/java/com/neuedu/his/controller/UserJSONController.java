package com.neuedu.his.controller;

import com.neuedu.his.jpa.pojo.UserEntity;
import com.neuedu.his.service.UserService;
import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uJSON")
public class UserJSONController {

    @Autowired
    UserService userService;
@RequestMapping("/login")
    public String login(String uname,String upwd)throws Exception{
    String msg = userService.userLogin(uname,upwd);
    return msg;
}
@RequestMapping("/login2")
    public LayuiReplay login2(String uname,String upwd)throws Exception{
    LayuiReplay layuiReplay = userService.userLogin2(uname,upwd);
    return layuiReplay;
}

}
