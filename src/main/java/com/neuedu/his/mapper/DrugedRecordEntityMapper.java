package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.DrugedRecordEntity;
import com.neuedu.his.jpa.pojo.DrugedRecordEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugedRecordEntityMapper {
    int countByExample(DrugedRecordEntityExample example);

    int deleteByExample(DrugedRecordEntityExample example);

    int deleteByPrimaryKey(String drugedNo);

    int insert(DrugedRecordEntity record);

    int insertSelective(DrugedRecordEntity record);

    List<DrugedRecordEntity> selectByExample(DrugedRecordEntityExample example);

    DrugedRecordEntity selectByPrimaryKey(String drugedNo);

    int updateByExampleSelective(@Param("record") DrugedRecordEntity record, @Param("example") DrugedRecordEntityExample example);

    int updateByExample(@Param("record") DrugedRecordEntity record, @Param("example") DrugedRecordEntityExample example);

    int updateByPrimaryKeySelective(DrugedRecordEntity record);

    int updateByPrimaryKey(DrugedRecordEntity record);
}