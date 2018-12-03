package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.SendRecordEntity;
import com.neuedu.his.jpa.pojo.SendRecordEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendRecordEntityMapper {
    int countByExample(SendRecordEntityExample example);

    int deleteByExample(SendRecordEntityExample example);

    int deleteByPrimaryKey(String sendNo);

    int insert(SendRecordEntity record);

    int insertSelective(SendRecordEntity record);

    List<SendRecordEntity> selectByExample(SendRecordEntityExample example);

    SendRecordEntity selectByPrimaryKey(String sendNo);

    int updateByExampleSelective(@Param("record") SendRecordEntity record, @Param("example") SendRecordEntityExample example);

    int updateByExample(@Param("record") SendRecordEntity record, @Param("example") SendRecordEntityExample example);

    int updateByPrimaryKeySelective(SendRecordEntity record);

    int updateByPrimaryKey(SendRecordEntity record);
}