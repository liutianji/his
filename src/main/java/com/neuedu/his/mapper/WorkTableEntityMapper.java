package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.WorkTableEntity;
import com.neuedu.his.jpa.pojo.WorkTableEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTableEntityMapper {
    int countByExample(WorkTableEntityExample example);

    int deleteByExample(WorkTableEntityExample example);

    int deleteByPrimaryKey(String wtableNo);

    int insert(WorkTableEntity record);

    int insertSelective(WorkTableEntity record);

    List<WorkTableEntity> selectByExample(WorkTableEntityExample example);

    WorkTableEntity selectByPrimaryKey(String wtableNo);

    int updateByExampleSelective(@Param("record") WorkTableEntity record, @Param("example") WorkTableEntityExample example);

    int updateByExample(@Param("record") WorkTableEntity record, @Param("example") WorkTableEntityExample example);

    int updateByPrimaryKeySelective(WorkTableEntity record);

    int updateByPrimaryKey(WorkTableEntity record);
}