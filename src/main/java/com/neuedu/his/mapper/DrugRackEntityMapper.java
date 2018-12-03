package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.DrugRackEntity;
import com.neuedu.his.jpa.pojo.DrugRackEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugRackEntityMapper {
    int countByExample(DrugRackEntityExample example);

    int deleteByExample(DrugRackEntityExample example);

    int deleteByPrimaryKey(String rackNo);

    int insert(DrugRackEntity record);

    int insertSelective(DrugRackEntity record);

    List<DrugRackEntity> selectByExample(DrugRackEntityExample example);

    DrugRackEntity selectByPrimaryKey(String rackNo);

    int updateByExampleSelective(@Param("record") DrugRackEntity record, @Param("example") DrugRackEntityExample example);

    int updateByExample(@Param("record") DrugRackEntity record, @Param("example") DrugRackEntityExample example);

    int updateByPrimaryKeySelective(DrugRackEntity record);

    int updateByPrimaryKey(DrugRackEntity record);
}