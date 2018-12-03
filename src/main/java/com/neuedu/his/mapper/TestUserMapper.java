package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.TestUserEntity;
import com.neuedu.his.pojo.TestUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestUserMapper {

    @Select("SELECT * FROM test_user WHERE uid = #{uid}")
    TestUser selectUser(String uid);

    @Select("SELECT * FROM test_user")
    List<TestUser> selectUsers();
    @Select("SELECT * FROM test_user WHERE uid = #{uid}")
    TestUserEntity selectUser2(String uid);
}
