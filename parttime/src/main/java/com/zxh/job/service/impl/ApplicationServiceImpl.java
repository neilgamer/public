package com.zxh.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.job.mapper.ApplicationMapper;
import com.zxh.job.pojo.Application;
import com.zxh.job.pojo.ApplicationExample;
import com.zxh.job.pojo.Parttime;
import com.zxh.job.pojo.Person;
import com.zxh.job.service.ApplicationService;
import com.zxh.job.service.ParttimeService;
import com.zxh.job.service.PersonService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	ApplicationMapper applicationmapper;
	@Autowired
	ParttimeService parttimeservice;
	@Autowired
	PersonService personservice;

	@Override
	public void add(Application application) {
		applicationmapper.insert(application);
	}
	@Override
	public void delete(int id) {
		applicationmapper.deleteByPrimaryKey(id);
	}

	//个人
	public void setParttime(List<Application> aps){
		for(Application ap: aps){
			setParttime(ap);
		}
	}
	
	public void setParttime(Application ap){
		Parttime parttime = parttimeservice.get(ap.getPt_id());
		ap.setParttime(parttime);
	}
	
	@Override
	public List<Application> listByPerson(int p_id) {
		ApplicationExample example = new ApplicationExample();
		example.createCriteria().andP_idEqualTo(p_id);
		List<Application> result = applicationmapper.selectByExample(example);
		setParttime(result);
		return result;
	}

	//企业
	public void setPerson(List<Application> aps){
		for(Application ap: aps){
			setPerson(ap);
		}
	}
	
	public void setPerson(Application ap){
		
		Person person = personservice.get(ap.getP_id());
		ap.setPerson(person);
	}
	@Override
	public List<Application> listByParttime(int pt_id) {
		ApplicationExample example = new ApplicationExample();
		example.createCriteria().andPt_idEqualTo(pt_id);
		List<Application> result = applicationmapper.selectByExample(example);
		setPerson(result);
		return result;
	}
	
	
	

}
