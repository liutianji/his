package com.neuedu.his.service;

import com.neuedu.his.vo.RemDrugVO;

import java.util.List;

public interface RemDrugService {

    /*
        根据处方号，获取拿药信息
     */
    public int findRemByRecipeNo(RemDrugVO rdVO);

    /*
        查询出所有提醒订单，根据发药时间排序
     */
    public List<RemDrugVO> findAllRems(String wtableNo);
    /*
        根据处方号 查询发药台信息
     */
    public String getWtableNo(String recipeNo);

}
