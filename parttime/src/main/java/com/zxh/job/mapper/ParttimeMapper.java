package com.zxh.job.mapper;

import com.zxh.job.pojo.Parttime;
import com.zxh.job.pojo.ParttimeExample;
import java.util.List;

public interface ParttimeMapper {
    int deleteByPrimaryKey(Integer pt_id);

    int insert(Parttime record);

    int insertSelective(Parttime record);

    List<Parttime> selectByExample(ParttimeExample example);

    Parttime selectByPrimaryKey(Integer pt_id);

    int updateByPrimaryKeySelective(Parttime record);

    int updateByPrimaryKey(Parttime record);
}