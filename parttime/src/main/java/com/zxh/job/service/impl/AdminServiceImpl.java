package com.zxh.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.job.mapper.AdminMapper;
import com.zxh.job.pojo.Admin;
import com.zxh.job.pojo.AdminExample;
import com.zxh.job.pojo.Person;
import com.zxh.job.pojo.PersonExample;
import com.zxh.job.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminmapper;
	
	@Override
	public List<Admin> list() {
		AdminExample example = new AdminExample();
		example.setOrderByClause("a_id desc");
		return adminmapper.selectByExample(example);
	}

	@Override
	public Admin get(String a_name, String a_password) {
		
		AdminExample example = new AdminExample();
		example.createCriteria().andA_nameEqualTo(a_name).andA_passwordEqualTo(a_password);
		List<Admin> result = adminmapper.selectByExample(example);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

}
