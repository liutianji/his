package com.neuedu.his.service;

import com.neuedu.his.jpa.pojo.WorkTableEntity;
import com.neuedu.his.jpa.pojo.WorkTableEntityExample;
import com.neuedu.his.mapper.WorkTableEntityMapper;
import com.neuedu.his.util.BeanUtil;
import com.neuedu.his.vo.LayUiODVO;
import com.neuedu.his.vo.LayuiReplay;
import com.neuedu.his.vo.WorkTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTableServiceImpl implements WorkTableService {
    @Autowired
    WorkTableEntityMapper workTableEntityMapper;
    @Override
    public LayuiReplay findWtableByWtableFlag() {
        WorkTableEntityExample example = new WorkTableEntityExample();
        WorkTableEntityExample.Criteria criteria = example.createCriteria();
        criteria.andWtableFlagEqualTo("1");//发药台flag 为1
        List<WorkTableEntity> list = workTableEntityMapper.selectByExample(example);
        List<WorkTableVO> vos = BeanUtil.copyList(list,WorkTableVO.class);
        LayuiReplay lrVO = new LayuiReplay();
        lrVO.setData(vos);
        lrVO.setCount(vos.size());
        return lrVO;
    }
}
