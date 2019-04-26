package com.neuedu.his.controller;

import com.neuedu.his.service.RecipeService;
import com.neuedu.his.vo.LayUiODVO;
import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.OutpatientDispensingVO;
import com.neuedu.his.vo.PhaStoRecipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/odJSON")
public class OutpatientDispensingJSONController {

    @Autowired
    RecipeService recipeService;
    @RequestMapping("/recipes1")
    public List<PhaStoRecipeVO> recipes1(){
       return recipeService.findRecipesByINo("已打印");
    }
    @RequestMapping("/recipes2")
    public OutpatientDispensingVO recipes2(){
        return recipeService.findAllRecipes();
    }

    @RequestMapping("/recipes3/{recipeNo}")
    public LayuiReplay recipes3(@PathVariable String recipeNo){
        return recipeService.findRecipeDetailByRecipeNo_layui(recipeNo);
    }
    /*

     */
}
