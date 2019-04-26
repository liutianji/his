package com.neuedu.his.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class BeanUtil {

    /*
        复制单个对象
     */
    public static <T> T copy(Object poObj, final Class<T> voClass) {
        T voObj = null;
        try {
            voObj = voClass.newInstance();
            BeanUtils.copyProperties(poObj, voObj);
            return voObj;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
        复制List 对象
     */
    public static <T> List<T> copyList(List<? extends Object> poList, final Class<T> voClass) {
        List<T> voList = new ArrayList<T>();
        T voObj = null;
        for (Object poObj : poList) {
            try {
                voObj = voClass.newInstance();
                BeanUtils.copyProperties(poObj, voObj);
                voList.add(voObj);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(voObj);
        }
        return voList;
    }


}
