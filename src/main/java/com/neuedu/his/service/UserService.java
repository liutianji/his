package com.neuedu.his.service;

import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.PhaStoRecipeVO;

public interface UserService {
    /*
        根据用户名、密码进行登录(可以使用uid或者uname 进行登录)
     */
    public String userLogin(String uname,String upwd);
    /*
        根据用户名或者编号 查询对应处方号   逻辑上，1个用户只可能有一个当前的处方号
     */
    public LayuiReplay userLogin2(String uname,String upwd);
    /*
        根据用户名查询处方信息
     */
    public PhaStoRecipeVO findRecipeNoByUname(String uname);
}
