package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.PhaComApplyoutEntity;
import com.neuedu.his.jpa.pojo.PhaComApplyoutEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhaComApplyoutEntityMapper {
    int countByExample(PhaComApplyoutEntityExample example);

    int deleteByExample(PhaComApplyoutEntityExample example);

    int deleteByPrimaryKey(String outNo);

    int insert(PhaComApplyoutEntity record);

    int insertSelective(PhaComApplyoutEntity record);

    List<PhaComApplyoutEntity> selectByExample(PhaComApplyoutEntityExample example);

    PhaComApplyoutEntity selectByPrimaryKey(String outNo);

    int updateByExampleSelective(@Param("record") PhaComApplyoutEntity record, @Param("example") PhaComApplyoutEntityExample example);

    int updateByExample(@Param("record") PhaComApplyoutEntity record, @Param("example") PhaComApplyoutEntityExample example);

    int updateByPrimaryKeySelective(PhaComApplyoutEntity record);

    int updateByPrimaryKey(PhaComApplyoutEntity record);
}