package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.RefDrugEntity;
import com.neuedu.his.jpa.pojo.RefDrugEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefDrugEntityMapper {
    int countByExample(RefDrugEntityExample example);

    int deleteByExample(RefDrugEntityExample example);

    int deleteByPrimaryKey(String refundNo);

    int insert(RefDrugEntity record);

    int insertSelective(RefDrugEntity record);

    List<RefDrugEntity> selectByExample(RefDrugEntityExample example);

    RefDrugEntity selectByPrimaryKey(String refundNo);

    int updateByExampleSelective(@Param("record") RefDrugEntity record, @Param("example") RefDrugEntityExample example);

    int updateByExample(@Param("record") RefDrugEntity record, @Param("example") RefDrugEntityExample example);

    int updateByPrimaryKeySelective(RefDrugEntity record);

    int updateByPrimaryKey(RefDrugEntity record);
}