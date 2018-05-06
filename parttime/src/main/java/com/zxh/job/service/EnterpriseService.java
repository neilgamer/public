package com.zxh.job.service;

import java.util.List;

import com.zxh.job.pojo.Enterprise;


public interface EnterpriseService {
	List<Enterprise> list();
	Enterprise get(String e_name,String e_password);
	void add(Enterprise enterprise);
	void update(Enterprise enterprise);
	Enterprise get(int e_id);
}
