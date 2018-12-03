package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.OpeUserEntity;
import com.neuedu.his.jpa.pojo.OpeUserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpeUserEntityMapper {
    int countByExample(OpeUserEntityExample example);

    int deleteByExample(OpeUserEntityExample example);

    int deleteByPrimaryKey(String userNo);

    int insert(OpeUserEntity record);

    int insertSelective(OpeUserEntity record);

    List<OpeUserEntity> selectByExample(OpeUserEntityExample example);

    OpeUserEntity selectByPrimaryKey(String userNo);

    int updateByExampleSelective(@Param("record") OpeUserEntity record, @Param("example") OpeUserEntityExample example);

    int updateByExample(@Param("record") OpeUserEntity record, @Param("example") OpeUserEntityExample example);

    int updateByPrimaryKeySelective(OpeUserEntity record);

    int updateByPrimaryKey(OpeUserEntity record);
}