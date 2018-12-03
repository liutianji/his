package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.DrugEntity;
import com.neuedu.his.jpa.pojo.DrugEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugEntityMapper {
    int countByExample(DrugEntityExample example);

    int deleteByExample(DrugEntityExample example);

    int deleteByPrimaryKey(String drugCode);

    int insert(DrugEntity record);

    int insertSelective(DrugEntity record);

    List<DrugEntity> selectByExample(DrugEntityExample example);

    DrugEntity selectByPrimaryKey(String drugCode);

    int updateByExampleSelective(@Param("record") DrugEntity record, @Param("example") DrugEntityExample example);

    int updateByExample(@Param("record") DrugEntity record, @Param("example") DrugEntityExample example);

    int updateByPrimaryKeySelective(DrugEntity record);

    int updateByPrimaryKey(DrugEntity record);
}