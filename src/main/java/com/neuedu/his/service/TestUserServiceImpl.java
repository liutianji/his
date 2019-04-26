package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.mapper.TestUserMapper;
import com.neuedu.his.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserServiceImpl implements TestUserService{

    @Autowired
    TestUserMapper testUserMapper;

    @Override
    public TestUserEntity testFindUserById2(String uid) {
        return testUserMapper.selectUser2(uid);
    }

    @Override
    @Cacheable(value = "all#90#5", keyGenerator = "wiselyKeyGenerator")
    public List<TestUser> testFindAll() {
        List<TestUser> users = testUserMapper.selectUsers();
        System.out.println("执行了查询！");
        return users;
    }

    @Override

    public TestUser testFindUserById(String uid) {
        return testUserMapper.selectUser(uid);
    }
}
