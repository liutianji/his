package com.neuedu.his.service.jpa;


import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.pojo.TestUser;

import java.util.List;

public interface UserRepositoryService {
   public Object addUser(TestUserEntity entity);
   public List<TestUserEntity> findAllUser();
}
