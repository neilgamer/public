package com.zxh.job.service;

import java.util.List;

import com.zxh.job.pojo.Application;

public interface ApplicationService {
	void add(Application application);
	void delete(int id);
	List<Application> listByPerson(int p_id);
	List<Application> listByParttime(int pt_id);
}
