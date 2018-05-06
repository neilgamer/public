package com.zxh.job.service;

import com.zxh.job.pojo.Person;


public interface PersonService {
	Person get(String p_name,String p_password);
	void add(Person person);
	void update(Person person);
	Person get(int p_id);
}
