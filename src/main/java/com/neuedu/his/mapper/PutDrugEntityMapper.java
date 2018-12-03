package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.PutDrugEntity;
import com.neuedu.his.jpa.pojo.PutDrugEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PutDrugEntityMapper {
    int countByExample(PutDrugEntityExample example);

    int deleteByExample(PutDrugEntityExample example);

    int deleteByPrimaryKey(String putDrugNo);

    int insert(PutDrugEntity record);

    int insertSelective(PutDrugEntity record);

    List<PutDrugEntity> selectByExample(PutDrugEntityExample example);

    PutDrugEntity selectByPrimaryKey(String putDrugNo);

    int updateByExampleSelective(@Param("record") PutDrugEntity record, @Param("example") PutDrugEntityExample example);

    int updateByExample(@Param("record") PutDrugEntity record, @Param("example") PutDrugEntityExample example);

    int updateByPrimaryKeySelective(PutDrugEntity record);

    int updateByPrimaryKey(PutDrugEntity record);
}