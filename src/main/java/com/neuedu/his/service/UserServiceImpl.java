package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import com.neuedu.his.jpa.pojo.PhaStoRecipeEntityExample;
import com.neuedu.his.jpa.pojo.UserEntity;
import com.neuedu.his.jpa.pojo.UserEntityExample;
import com.neuedu.his.mapper.PhaStoRecipeEntityMapper;
import com.neuedu.his.mapper.UserEntityMapper;
import com.neuedu.his.util.BeanUtil;
import com.neuedu.his.vo.LayUiODVO;
import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.PhaStoRecipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserEntityMapper userEntityMapper;
    @Autowired
    PhaStoRecipeEntityMapper phaStoRecipeEntityMapper;
    @Override
    public String userLogin(String uname, String upwd) {
        UserEntityExample example = new UserEntityExample();
        example.or().andUidEqualTo(uname);
        example.or().andUnameEqualTo(uname);
        //根据用户名或者用户编号，查询用户信息
        List<UserEntity> list = userEntityMapper.selectByExample(example);
        if(list.size()>0){
            if(upwd.equals(list.get(0).getUpwd())){
                return "ok";
            }else{
                return "upwdErr";
            }
        }else{
            return "unameErr";
        }
    }


    @Override
    public LayuiReplay userLogin2(String uname, String upwd) {
        LayuiReplay dataVO = new LayuiReplay();
        UserEntityExample example = new UserEntityExample();
        example.or().andUidEqualTo(uname);
        example.or().andUnameEqualTo(uname);
        //根据用户名或者用户编号，查询用户信息
        List<UserEntity> list = userEntityMapper.selectByExample(example);
        if(list.size()>0){
            if(upwd.equals(list.get(0).getUpwd())){
                //登录成功后，查询出目前  自己拥有的有效的处方号  及必要信息
                dataVO.setMsg("ok");
                //根据用户名  查询  处方信息
                PhaStoRecipeVO phaStoRecipeVO = findRecipeNoByUname(list.get(0).getUname());
                List<PhaStoRecipeVO> voList = new ArrayList<PhaStoRecipeVO>();
                voList.add(phaStoRecipeVO);
                dataVO.setData(voList);
            }else{
                dataVO.setMsg("upwdErr");
            }
        }else{
            dataVO.setMsg("unameErr");
        }


        return dataVO;
    }

    @Override
    public PhaStoRecipeVO findRecipeNoByUname(String uname) {
        PhaStoRecipeEntityExample example = new PhaStoRecipeEntityExample();
        PhaStoRecipeEntityExample.Criteria criteria = example.createCriteria();
        criteria.andPatientNameEqualTo(uname);
        //验证状态为0  认为该用户的 处方为有效处方   以后再做处理
        criteria.andValidStateEqualTo("0");
        //这里  简化逻辑   一个用户只有一个当前可用处方号
        List<PhaStoRecipeEntity> list = phaStoRecipeEntityMapper.selectByExample(example);

        PhaStoRecipeVO phaStoRecipeVO = new PhaStoRecipeVO();
        //如果查出记录 必然只有1个  简单处理
        if(list.size()>0){
            phaStoRecipeVO = BeanUtil.copy(list.get(0),PhaStoRecipeVO.class);
        }
        return phaStoRecipeVO;
    }
}
