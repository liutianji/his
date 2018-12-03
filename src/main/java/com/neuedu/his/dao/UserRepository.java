package com.neuedu.his.dao;

import com.neuedu.his.jpa.pojo.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TestUserEntity,Long> {
}
