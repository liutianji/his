package com.neuedu.his.mapper;

import com.neuedu.his.pojo.TestUser;
import org.apache.ibatis.annotations.Select;

public interface TestUserMapper {

    @Select("SELECT * FROM test_user WHERE uid = #{uid}")
    TestUser selectUser(String uid);
}
