package com.neuedu.his.controller;

import com.neuedu.his.service.WorkTableService;
import com.neuedu.his.vo.LayuiReplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wtJSON")
public class WorkTableJSONController {
    @Autowired
    WorkTableService workTableService;
    /*
        得到所有工作台中发药台信息
     */
    @RequestMapping("/wtableAll/fy")
    public LayuiReplay wtableAll(){

        return workTableService.findWtableByWtableFlag();
    }
}
