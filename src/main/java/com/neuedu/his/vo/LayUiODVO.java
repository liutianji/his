package com.neuedu.his.vo;


import java.util.List;

public class LayUiODVO {
    private int code;
    private String msg;
    private int count;
    private List<PhaComApplyoutVO> data;

    public LayUiODVO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<PhaComApplyoutVO> getData() {
        return data;
    }

    public void setData(List<PhaComApplyoutVO> data) {
        this.data = data;
    }
}
