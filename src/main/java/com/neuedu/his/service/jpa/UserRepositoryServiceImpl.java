package com.neuedu.his.service.jpa;

import com.neuedu.his.dao.UserRepository;
import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Object addUser(TestUserEntity entity) {

        return userRepository.save(entity);
    }

    @Override
    public List<TestUserEntity> findAllUser() {
        return userRepository.findAll();
    }
}
