package com.zxh.job.service;

import java.util.List;

import com.zxh.job.pojo.Admin;

public interface AdminService {
	List<Admin> list();
	Admin get(String a_name,String a_password);
}
