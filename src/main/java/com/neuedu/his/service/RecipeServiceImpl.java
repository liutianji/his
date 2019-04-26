package com.neuedu.his.service;

import com.neuedu.his.dao.PhaComApplyoutRepository;
import com.neuedu.his.dao.PhaStoRecipeRepository;
import com.neuedu.his.jpa.pojo.*;
import com.neuedu.his.mapper.DrugEntityMapper;
import com.neuedu.his.mapper.PhaComApplyoutEntityMapper;
import com.neuedu.his.mapper.PhaStoRecipeEntityMapper;
import com.neuedu.his.util.BeanUtil;
import com.neuedu.his.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecipeServiceImpl implements RecipeService{
    @Autowired
    PhaStoRecipeRepository phaStoRecipeRepository;
    @Autowired
    PhaStoRecipeEntityMapper phaStoRecipeEntityMapper;
    @Autowired
    PhaComApplyoutEntityMapper phaComApplyoutEntityMapper;//mybatis
    @Autowired
    PhaComApplyoutRepository phaComApplyoutRepository;//jpa
    @Autowired
    DrugEntityMapper drugEntityMapper;// 药品查询相关
    @Override
    public List<PhaStoRecipeEntity> findRecipes() {
        return phaStoRecipeRepository.findAll();
    }

    @Override
    public List<PhaComApplyoutEntity> findRecipeDetail(String recipeNo) {
        PhaComApplyoutEntity phaComApplyoutEntity = new PhaComApplyoutEntity();
        phaComApplyoutEntity.setRecipeNo(recipeNo);
        Example<PhaComApplyoutEntity> example = Example.of(phaComApplyoutEntity);
        List<PhaComApplyoutEntity> list = phaComApplyoutRepository.findAll(example);
        System.out.println("获取到的条目数:"+list.size());
        return list;
    }

    @Override
    public List<PhaStoRecipeVO> findRecipesByINo(String invoiceNo) {
        PhaStoRecipeEntityExample example = new PhaStoRecipeEntityExample();
        PhaStoRecipeEntityExample.Criteria criteria = example.createCriteria();
        if("".equals(invoiceNo)||null==invoiceNo){
            criteria.andInvoiceNoIsNull();
        }else{
            criteria.andInvoiceNoIsNotNull();
        }
        //未拿药的打印
        criteria.andDrugedOperIsNull();
        example.setOrderByClause("FEE_DATE ASC");//使用升序   早结算的用户早显示
        List<PhaStoRecipeEntity> entityList =phaStoRecipeEntityMapper.selectByExample(example);
        System.out.println("数据量:"+entityList.size());
        List<PhaStoRecipeVO> voList = BeanUtil.copyList(entityList,PhaStoRecipeVO.class);
        voList.forEach(VOs -> VOs.setAge());//处理年龄
        //处理订单详情
        PhaComApplyoutEntityExample example1 = new PhaComApplyoutEntityExample();
        PhaComApplyoutEntityExample.Criteria criteria1 = example1.createCriteria();

        for(PhaStoRecipeVO vos:voList){
            criteria1.andRecipeNoEqualTo(vos.getRecipeNo());
            vos.setRecipeDetail(phaComApplyoutEntityMapper.selectByExample(example1));
        }



        return voList;
    }

    @Override
    public PhaStoRecipeVO findRecipeFirst(String status) {
        List<PhaStoRecipeVO> psrlist = findRecipesByINo(status);
        PhaStoRecipeVO psrVO = psrlist.get(0);
        return psrVO;
    }

    @Override
    public List<PhaStoRecipeVO> findRecipesVo() {
        List<PhaStoRecipeEntity> entityList = phaStoRecipeRepository.findAll();
        List<PhaStoRecipeVO> phaStoRecipeVOs = BeanUtil.copyList(entityList,PhaStoRecipeVO.class);
        phaStoRecipeVOs.forEach(VOs -> VOs.setAge());//处理年龄
//        phaStoRecipeVOs.forEach(System.out::println);

        return phaStoRecipeVOs;
    }

    @Override
    public PhaStoRecipeVO findRecipeByRecipeNo(String recipeNo) {
        PhaStoRecipeEntity psrEntity = phaStoRecipeEntityMapper.selectByPrimaryKey(recipeNo);
        PhaStoRecipeVO psrVO = BeanUtil.copy(psrEntity,PhaStoRecipeVO.class);
        psrVO.setAge();
        return psrVO;
    }

    @Override
    public OutpatientDispensingVO findAllRecipes() {
        OutpatientDispensingVO vo = new OutpatientDispensingVO();
        List<PhaStoRecipeVO> yesPrintListVO = findRecipesByINo("已打印");
        PhaStoRecipeVO yesPrintFirstVO = findRecipeFirst("打印");
        List<PhaStoRecipeVO> noPrintListVO = findRecipesByINo(null);
        PhaStoRecipeVO noPrintFirstVO = findRecipeFirst(null);
        vo.setYesPrintListVO(yesPrintListVO);
        vo.setYesPrintFirstVO(yesPrintFirstVO);
        vo.setNoPrintListVO(noPrintListVO);
        vo.setNoPrintFirstVO(noPrintFirstVO);

        return vo;
    }

    @Override
    public LayuiReplay findRecipeDetailByRecipeNo_layui(String recipeNo) {
        //LayUiODVO vo = new LayUiODVO();
        LayuiReplay lrVO = new LayuiReplay();
        //处理订单详情
        PhaComApplyoutEntityExample example1 = new PhaComApplyoutEntityExample();
        PhaComApplyoutEntityExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andRecipeNoEqualTo(recipeNo);
        List<PhaComApplyoutEntity> data = new ArrayList<PhaComApplyoutEntity>();
        data = phaComApplyoutEntityMapper.selectByExample(example1);
        List<PhaComApplyoutVO> pcaData = BeanUtil.copyList(data,PhaComApplyoutVO.class);
        //单个金额 处理
        for(PhaComApplyoutVO vo1:pcaData){
            if(null==vo1.getDrugCode()||"".equals(vo1.getDrugCode())){
                vo1.setUnitPrice(0.0);
            }else{
                DrugEntity entity = drugEntityMapper.selectByPrimaryKey(vo1.getDrugCode());//查询药品单价
                vo1.setUnitPrice(entity.getUnitPrice());
                vo1.setSumSale();
            }
        }
        pcaData.forEach(System.out::println);
        //循环处理  暂时不需要
        //pcaData.get(0).setCountSum(1);

        lrVO.setData(pcaData);
        //lrVO.setCode(0);
        //lrVO.setMsg("");
        lrVO.setCount(pcaData.size());
       /* vo.setData(pcaData);
        vo.setCode(0);
        vo.setMsg("");
        vo.setCount(data.size());*/
        return lrVO;
    }

    /*
     配药完成后，信息处理   发药台获得发药信息
        点击确定后,  处方单中  记录配药时间、配药人信息、配药台信息、发药台信息（只记录发药台编号或名称）
        配药记录表中  记录对应配药信息  （用于之后完成相关统计工作）
        拿药提醒表中  记录处方号、发药台编号、病人名、拿药状态为0（未拿） 拿药时间为空 、记录配药时间（用于提醒拿药）

     */
    @Override
    public boolean dealRecipe1(PhaStoRecipeVO phaStoRecipeVO) {
        //1.处方表处理

        //2.配药记录表处理

        //3.拿药提醒表处理
        return false;
    }
}
