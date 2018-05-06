package com.zxh.job.mapper;

import com.zxh.job.pojo.Application;
import com.zxh.job.pojo.ApplicationExample;
import java.util.List;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    Application selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}