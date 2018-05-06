package com.zxh.job.service;

import java.util.List;

import com.zxh.job.pojo.Parttime;


public interface ParttimeService {
	void add(Parttime parttime);
	void delete(int pt_id);
	void update(Parttime p);
	List<Parttime> list();
	List<Parttime> reviewlist();
	List<Parttime> reviewtruelist();
	Parttime get(int pt_id);
	List<Parttime> listByEnterprise(int e_id);
	
	List<Parttime> search(String keyword);
	List<Parttime> choosearea(String area);
	
}
