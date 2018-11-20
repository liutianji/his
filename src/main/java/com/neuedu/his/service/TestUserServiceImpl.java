package com.neuedu.his.service;

import com.neuedu.his.mapper.TestUserMapper;
import com.neuedu.his.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestUserServiceImpl implements TestUserService{

    @Autowired
    TestUserMapper testUserMapper;
    @Override
    public TestUser testFindUserById(String uid) {
        return testUserMapper.selectUser(uid);
    }
}
