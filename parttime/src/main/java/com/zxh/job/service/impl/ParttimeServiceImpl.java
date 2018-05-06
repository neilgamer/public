package com.zxh.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.job.mapper.ParttimeMapper;
import com.zxh.job.pojo.AdminExample;
import com.zxh.job.pojo.Application;
import com.zxh.job.pojo.ApplicationExample;
import com.zxh.job.pojo.Enterprise;
import com.zxh.job.pojo.Parttime;
import com.zxh.job.pojo.ParttimeExample;
import com.zxh.job.pojo.Person;
import com.zxh.job.service.EnterpriseService;
import com.zxh.job.service.ParttimeService;

@Service
public class ParttimeServiceImpl implements ParttimeService {
	@Autowired
	ParttimeMapper parttimemapper;
	@Autowired
	EnterpriseService enterpriseservice;
	
	@Override
	public void add(Parttime parttime) {
		parttimemapper.insert(parttime);
	}
	
	@Override
	public void delete(int pt_id) {
		parttimemapper.deleteByPrimaryKey(pt_id);
	}

	@Override
	public List<Parttime> list() {
		/*AdminExample example = new AdminExample();
		example.setOrderByClause("a_id desc");
		return adminmapper.selectByExample(example);*/
		
		ParttimeExample example = new ParttimeExample();
		example.setOrderByClause("pt_id desc");
		
		return parttimemapper.selectByExample(example);
	}

	@Override
	public Parttime get(int pt_id) {
		return parttimemapper.selectByPrimaryKey(pt_id);
	}
	
	public void setEnterprise(List<Parttime> pas){
		for(Parttime pa:pas){
			setEnterprise(pa);
		}
	}
	public void setEnterprise(Parttime pa){
		Enterprise en = enterpriseservice.get(pa.getE_id());
		pa.setEnterprise(en);
	}
	@Override
	public List<Parttime> listByEnterprise(int e_id) {
		ParttimeExample example =new ParttimeExample();
		example.createCriteria().andE_idEqualTo(e_id);
		List<Parttime> result = parttimemapper.selectByExample(example);
		setEnterprise(result);
		return result;
	}

	@Override
	public void update(Parttime p) {
		parttimemapper.updateByPrimaryKeySelective(p);
	}

	//搜索
	@Override
	public List<Parttime> search(String keyword) {
		ParttimeExample example = new ParttimeExample();
		example.createCriteria().andPt_nameLike("%" + keyword + "%");
		example.setOrderByClause("pt_id desc");
		List result = parttimemapper.selectByExample(example);
		return result;
	}
	
	@Override
	public List<Parttime> choosearea(String area) {
		ParttimeExample example = new ParttimeExample();
		example.createCriteria().andPt_areaLike("%" + area + "%").andPt_reviewEqualTo(true);
		example.setOrderByClause("pt_id desc");
		List result = parttimemapper.selectByExample(example);
		return result;
	}

	@Override
	public List<Parttime> reviewlist() {
		ParttimeExample example = new ParttimeExample();
		example.createCriteria().andPt_reviewEqualTo(false);
		example.setOrderByClause("pt_id desc");
		List<Parttime> result = parttimemapper.selectByExample(example);
		return result;
	}

	@Override
	public List<Parttime> reviewtruelist() {
		ParttimeExample example = new ParttimeExample();
		example.createCriteria().andPt_reviewEqualTo(true);
		example.setOrderByClause("pt_id desc");
		List<Parttime> result = parttimemapper.selectByExample(example);
		return result;
	}


}
