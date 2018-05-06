package com.zxh.job.mapper;

import com.zxh.job.pojo.Person;
import com.zxh.job.pojo.PersonExample;
import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer p_id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer p_id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}