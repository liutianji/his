package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.RemDrugEntity;
import com.neuedu.his.jpa.pojo.RemDrugEntityExample;
import com.neuedu.his.jpa.pojo.WorkTableEntity;
import com.neuedu.his.jpa.pojo.WorkTableEntityExample;
import com.neuedu.his.mapper.RemDrugEntityMapper;
import com.neuedu.his.mapper.WorkTableEntityMapper;
import com.neuedu.his.util.BeanUtil;
import com.neuedu.his.vo.RemDrugVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RemDrugServiceImpl implements RemDrugService {

    @Autowired
    RemDrugEntityMapper remDrugEntityMapper;
    @Autowired
    WorkTableEntityMapper workTableEntityMapper;
    @Override
    public int findRemByRecipeNo(RemDrugVO rdVO) {
        int index = -1;
        //根据处方号 查询配药台信息
        String wtableNo = getWtableNo(rdVO.getRecipeNo());

        List<RemDrugVO> voEntities = findAllRems(wtableNo);
        //根据集合中位置  判断 是第几个
        for(int i=0;i<voEntities.size();i++){
            if(rdVO.getRecipeNo().equals(voEntities.get(i).getRecipeNo())){
                index = i+1;
            }
        }
        return index;
    }

    @Override
    public List<RemDrugVO> findAllRems(String wtableNo) {
        RemDrugEntityExample example = new RemDrugEntityExample();
        RemDrugEntityExample.Criteria criteria = example.createCriteria();
        criteria.andRemStatusEqualTo(0);//拿药状态为0  即未拿药
        criteria.andWtableNoEqualTo(wtableNo);
        criteria.andDrugedDateIsNotNull();//防止排序时可能为空  空占位第一个
        example.setOrderByClause("DRUGED_DATE ASC");//使用升序   早结算的用户早显示
        List<RemDrugEntity> entities =remDrugEntityMapper.selectByExample(example);
        //将查询到的所有信息 放入集合中   voEntities  存放了所有该拿药台中未发药的信息
        List<RemDrugVO> voEntities = BeanUtil.copyList(entities,RemDrugVO.class);
        //根据发药台容量，再次对集合进行处理  总共显示多少条
        //查询出药台的最大容纳量
        WorkTableEntityExample example1 = new WorkTableEntityExample();
        WorkTableEntityExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andWtableNameEqualTo(wtableNo);
        List<WorkTableEntity> workTableEntity =  workTableEntityMapper.selectByExample(example1);
        int max_num =  workTableEntity.get(0).getMaxNum();
        List<RemDrugVO> result = new ArrayList<RemDrugVO>();
        if(voEntities.size()<max_num){
            result.addAll(voEntities.subList(0,voEntities.size()));
        }else{
            result.addAll(voEntities.subList(0,max_num));
        }
        result.forEach(System.out::println);
        return result;
    }

    @Override
    public String getWtableNo(String recipeNo) {
        RemDrugEntityExample example = new RemDrugEntityExample();
        RemDrugEntityExample.Criteria criteria = example.createCriteria();
        criteria.andRecipeNoEqualTo(recipeNo);
        String wtableNo = remDrugEntityMapper.selectByExample(example).get(0).getWtableNo();
        return wtableNo;
    }
}
