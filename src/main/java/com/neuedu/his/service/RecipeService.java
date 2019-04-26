package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.PhaComApplyoutEntity;
import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import com.neuedu.his.vo.LayUiODVO;
import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.OutpatientDispensingVO;
import com.neuedu.his.vo.PhaStoRecipeVO;

import java.util.List;

public interface RecipeService {
    /*
        查询所有处方及处方（主表）
     */
    public List<PhaStoRecipeEntity> findRecipes();

    public List<PhaStoRecipeVO> findRecipesVo();
    /*
        根据处方号查询处方详情
     */
    public List<PhaComApplyoutEntity> findRecipeDetail(String recipeNo);
    /*
        根据收费票据号INVOICE_NO确定是否已经打印了该订单
        规则:
        1、票据号为空，未交费，未行打印
        2、票据号不为空，已经交费，默认显示为已打印
        备注:
        1、默认按照交费时间排序
     */
    public List<PhaStoRecipeVO> findRecipesByINo(String invoiceNo);
    /*
        默认查询第一个记录
     */
    public  PhaStoRecipeVO findRecipeFirst(String status);
    /*
        根据处方号  查询指定处方
     */
    public  PhaStoRecipeVO findRecipeByRecipeNo(String recipeNo);
    /*
        查询所有有关处方信息的方法，包含：
        1、已经打印的信息 2、未打印的信息 3、打印的信息的第一条 4、未打印信息的第一条 5、各信息相关的处方详情
     */
    public OutpatientDispensingVO findAllRecipes();

    /*
        LayUI 需要使用的单个 json 数据  根据处方号 查询处方详情
     */
    public LayuiReplay findRecipeDetailByRecipeNo_layui(String recipeNo);
    /*
    配药完成后，信息处理   发药台获得发药信息
        点击确定后,  处方单中  记录配药时间、配药人信息、配药台信息、发药台信息（只记录发药台编号或名称）
        配药记录表中  记录对应配药信息  （用于之后完成相关统计工作）
        拿药提醒表中  记录处方号、发药台编号、病人名、拿药状态为0（未拿） 拿药时间为空 、记录配药时间（用于提醒拿药）

     */
    public boolean dealRecipe1(PhaStoRecipeVO phaStoRecipeVO);
}
