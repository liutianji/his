package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.RemDrugEntity;
import com.neuedu.his.jpa.pojo.RemDrugEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemDrugEntityMapper {
    int countByExample(RemDrugEntityExample example);

    int deleteByExample(RemDrugEntityExample example);

    int deleteByPrimaryKey(String remNo);

    int insert(RemDrugEntity record);

    int insertSelective(RemDrugEntity record);

    List<RemDrugEntity> selectByExample(RemDrugEntityExample example);

    RemDrugEntity selectByPrimaryKey(String remNo);

    int updateByExampleSelective(@Param("record") RemDrugEntity record, @Param("example") RemDrugEntityExample example);

    int updateByExample(@Param("record") RemDrugEntity record, @Param("example") RemDrugEntityExample example);

    int updateByPrimaryKeySelective(RemDrugEntity record);

    int updateByPrimaryKey(RemDrugEntity record);
}