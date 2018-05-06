package com.zxh.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.job.mapper.PersonMapper;
import com.zxh.job.pojo.Person;
import com.zxh.job.pojo.PersonExample;
import com.zxh.job.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper personmapper;

	@Override
	public Person get(String p_name, String p_password) {
		PersonExample example = new PersonExample();
		example.createCriteria().andP_nameEqualTo(p_name).andP_passwordEqualTo(p_password);
		List<Person> result = personmapper.selectByExample(example);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

	@Override
	public void add(Person person) {
		personmapper.insert(person);
	}

	@Override
	public void update(Person person) {
		personmapper.updateByPrimaryKeySelective(person);
	}

	@Override
	public Person get(int p_id) {
		
		return personmapper.selectByPrimaryKey(p_id);
	}
	
	
}
