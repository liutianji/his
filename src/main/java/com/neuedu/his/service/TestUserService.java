package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.pojo.TestUser;

import java.util.List;

public interface TestUserService {
    public TestUser testFindUserById(String uid);
    public List<TestUser> testFindAll();
    public TestUserEntity  testFindUserById2(String uid);
}
