package com.zxh.job.mapper;

import com.zxh.job.pojo.Admin;
import com.zxh.job.pojo.AdminExample;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer a_id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer a_id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}