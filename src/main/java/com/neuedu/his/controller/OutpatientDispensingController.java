package com.neuedu.his.controller;

import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import com.neuedu.his.service.RecipeService;
import com.neuedu.his.vo.PhaStoRecipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 处方管理控制器
 * 1、显示处方
 * 2、处方状态变更
 * 3、配药、发药、还药 分别需要记录入表中   （配药统计表、发药统计表暂未设置）
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/od")
public class OutpatientDispensingController {

    @Autowired
    RecipeService recipeService;
    @GetMapping("/getAllRecipes")
    public String getAllRecipes(){
        System.out.println("获取到的数量:"+recipeService.findRecipesVo().size());
        return "success";
    }

    @GetMapping("/getRecipeDetails")
    public  String getRecipeDetails(){
        recipeService.findRecipeDetail("RN000001");
        return "success";
    }
    /*

     */
    @GetMapping("/getRecipesByInvoiceNo")
    public String getRecipesByInvoiceNo(){
        recipeService.findRecipesByINo("其他");
        return "success";
    }
    /*
        跳转到门诊配药页面
        默认情况下，显示已经打印（已交费）的订单号，并根据人的姓名进行信息罗列，默认显示第一个用户
     */
    @GetMapping("/toDruged")
    public  String toDruged(Model model,String status){
        /*List<PhaStoRecipeVO> yesPrintList = recipeService.findRecipesByINo("已打印");
        PhaStoRecipeVO yesPrintFirst = recipeService.findRecipeFirst("打印");
        List<PhaStoRecipeVO> noPrintList = recipeService.findRecipesByINo(null);
        PhaStoRecipeVO noPrintFirst = recipeService.findRecipeFirst(null);

        model.addAttribute("yesPrintFirst",yesPrintFirst);//单个信息
        model.addAttribute("yesPrintList",yesPrintList);//数组信息
        model.addAttribute("noPrintFirst",noPrintFirst);
        model.addAttribute("noPrintList",noPrintList);*/
        return "his_py";
    }
    @GetMapping("/toDruged/recipeNo/{recipeNo}")
    public String  toDrugedByRecipeNo(Model model,@PathVariable String recipeNo){
        //查询处方号，得到对应内容
        PhaStoRecipeVO psr = recipeService.findRecipeByRecipeNo(recipeNo);
        model.addAttribute("psr",psr);//单个信息

        List<PhaStoRecipeVO> list = recipeService.findRecipesByINo("其他");

        model.addAttribute("psrList",list);//数组信息
        return "his_py";
    }
    /*
        配药完成后，信息处理   发药台获得发药信息
        点击确定后,  处方单中  记录配药时间、配药人信息、配药台信息、发药台信息（只记录发药台编号或名称）
        配药记录表中  记录对应配药信息  （用于之后完成相关统计工作）
        拿药提醒表中  记录处方号、发药台编号、病人名、拿药状态为0（未拿） 拿药时间为空 、记录配药时间（用于提醒拿药）
        -------------------------------------------------------------------------------------------------
        拿药后，拿药表中拿药状态改为1（已拿）记录拿药时间
        发药记录表中 记录对应发药信息（用于之后完成相关统计工作）
        处方表中 记录发药人姓名、发药时间   valid_state暂时不处理
     */

    @PostMapping("/toDrugedSuccess")
    @ResponseBody
    public String toDrugedSuccess(@RequestBody PhaStoRecipeVO phaStoRecipeVO){
        System.out.println(phaStoRecipeVO.toString()+phaStoRecipeVO.getSendDept()+phaStoRecipeVO.getRecipeNo());
       //调取Service 方法  将发药台信息，录入到对应的处方号的sendDept 中
        return "{\"msg\":\"ok\"}";
    }
    /*
        配药台完成后，将已经配药完成的 药在发药台显示，并通过手机端提醒

    */
}
