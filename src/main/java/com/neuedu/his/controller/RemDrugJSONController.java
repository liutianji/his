package com.neuedu.his.controller;

import com.neuedu.his.service.RemDrugService;
import com.neuedu.his.vo.RemDrugVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rdJSON")
public class RemDrugJSONController {

    @Autowired
    RemDrugService remDrugService;
    @RequestMapping("/rem")
    public String rem(RemDrugVO remDrugVO) throws Exception{

/*        String str = "";
        str = remDrugVO.getWtableNo();
        System.out.println("1:"+str);
       str = new String(remDrugVO.getWtableNo().getBytes("iso-8859-1"),"utf-8");
        System.out.println("2:"+str);
        str = new String(str.getBytes("gb2312"),"utf-8");
        System.out.println("3:"+str);*/

       /*
        remDrugVO.setWtableNo(new String(remDrugVO.getWtableNo().getBytes("gb2312"),"utf-8"));
*/

        System.out.println(remDrugVO.getWtableNo());
        //remDrugVO.setWtableNo("发药台2");
        int i = remDrugService.findRemByRecipeNo(remDrugVO);
        return i+"";
    }
    @RequestMapping("/remList")
    public List<RemDrugVO> remList(RemDrugVO remDrugVO)throws Exception{
        String wtableNo =remDrugService.getWtableNo(remDrugVO.getRecipeNo());
        List<RemDrugVO> list = remDrugService.findAllRems(wtableNo);
        return list;
    }
}
