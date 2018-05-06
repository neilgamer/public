package com.zxh.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.job.mapper.EnterpriseMapper;
import com.zxh.job.pojo.Enterprise;
import com.zxh.job.pojo.EnterpriseExample;
import com.zxh.job.pojo.Person;
import com.zxh.job.pojo.PersonExample;
import com.zxh.job.service.EnterpriseService;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	@Autowired
	EnterpriseMapper enterprisemapper;
	
	@Override
	public Enterprise get(String e_name, String e_password) {
		EnterpriseExample example = new EnterpriseExample();
		example.createCriteria().andE_nameEqualTo(e_name).andE_passwordEqualTo(e_password);
		List<Enterprise> result = enterprisemapper.selectByExample(example);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

	@Override
	public void add(Enterprise enterprise) {
		enterprisemapper.insert(enterprise);
		
	}

	@Override
	public void update(Enterprise enterprise) {
		enterprisemapper.updateByPrimaryKeySelective(enterprise);
	}

	@Override
	public Enterprise get(int e_id) {
		return enterprisemapper.selectByPrimaryKey(e_id);
	}

	@Override
	public List<Enterprise> list() {
		EnterpriseExample example = new EnterpriseExample();
		example.setOrderByClause("a_id desc");
		
		return enterprisemapper.selectByExample(example);
	}

}
