package com.neuedu.his.mapper;

import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import com.neuedu.his.jpa.pojo.PhaStoRecipeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhaStoRecipeEntityMapper {
    int countByExample(PhaStoRecipeEntityExample example);

    int deleteByExample(PhaStoRecipeEntityExample example);

    int deleteByPrimaryKey(String recipeNo);

    int insert(PhaStoRecipeEntity record);

    int insertSelective(PhaStoRecipeEntity record);

    List<PhaStoRecipeEntity> selectByExample(PhaStoRecipeEntityExample example);

    PhaStoRecipeEntity selectByPrimaryKey(String recipeNo);

    int updateByExampleSelective(@Param("record") PhaStoRecipeEntity record, @Param("example") PhaStoRecipeEntityExample example);

    int updateByExample(@Param("record") PhaStoRecipeEntity record, @Param("example") PhaStoRecipeEntityExample example);

    int updateByPrimaryKeySelective(PhaStoRecipeEntity record);

    int updateByPrimaryKey(PhaStoRecipeEntity record);
}