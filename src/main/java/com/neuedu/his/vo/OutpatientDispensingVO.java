package com.neuedu.his.vo;

import java.util.List;

/*
    用于存储配药页面显示信息的  json数据的实体类
 */
public class OutpatientDispensingVO {

    private PhaStoRecipeVO       yesPrintFirstVO;//已经打印的处方（用于存储第一条记录）
    private PhaStoRecipeVO       noPrintFirstVO;//未打印的处方（用于存储第一条记录）
    private List<PhaStoRecipeVO> yesPrintListVO;//已经打印的处方的List
    private List<PhaStoRecipeVO> noPrintListVO;//未打印的处方的List

    public OutpatientDispensingVO() {
    }

    public PhaStoRecipeVO getYesPrintFirstVO() {
        return yesPrintFirstVO;
    }

    public void setYesPrintFirstVO(PhaStoRecipeVO yesPrintFirstVO) {
        this.yesPrintFirstVO = yesPrintFirstVO;
    }

    public PhaStoRecipeVO getNoPrintFirstVO() {
        return noPrintFirstVO;
    }

    public void setNoPrintFirstVO(PhaStoRecipeVO noPrintFirstVO) {
        this.noPrintFirstVO = noPrintFirstVO;
    }

    public List<PhaStoRecipeVO> getYesPrintListVO() {
        return yesPrintListVO;
    }

    public void setYesPrintListVO(List<PhaStoRecipeVO> yesPrintListVO) {
        this.yesPrintListVO = yesPrintListVO;
    }

    public List<PhaStoRecipeVO> getNoPrintListVO() {
        return noPrintListVO;
    }

    public void setNoPrintListVO(List<PhaStoRecipeVO> noPrintListVO) {
        this.noPrintListVO = noPrintListVO;
    }
}
