package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.RefDrugDetailEntity;
import com.neuedu.his.jpa.pojo.RefDrugDetailEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefDrugDetailEntityMapper {
    int countByExample(RefDrugDetailEntityExample example);

    int deleteByExample(RefDrugDetailEntityExample example);

    int deleteByPrimaryKey(String refundDetailNo);

    int insert(RefDrugDetailEntity record);

    int insertSelective(RefDrugDetailEntity record);

    List<RefDrugDetailEntity> selectByExample(RefDrugDetailEntityExample example);

    RefDrugDetailEntity selectByPrimaryKey(String refundDetailNo);

    int updateByExampleSelective(@Param("record") RefDrugDetailEntity record, @Param("example") RefDrugDetailEntityExample example);

    int updateByExample(@Param("record") RefDrugDetailEntity record, @Param("example") RefDrugDetailEntityExample example);

    int updateByPrimaryKeySelective(RefDrugDetailEntity record);

    int updateByPrimaryKey(RefDrugDetailEntity record);
}