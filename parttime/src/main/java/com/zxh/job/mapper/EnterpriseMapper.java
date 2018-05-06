package com.zxh.job.mapper;

import com.zxh.job.pojo.Enterprise;
import com.zxh.job.pojo.EnterpriseExample;
import java.util.List;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer e_id);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseExample example);

    Enterprise selectByPrimaryKey(Integer e_id);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}