package com.neuedu.his.service;

import com.neuedu.his.vo.LayuiReplay;

import java.util.List;

public interface WorkTableService {

    /*
        查询所有工作台信息（flag为1的为发药台）
     */
    public LayuiReplay findWtableByWtableFlag();
}
