package com.zxh.job.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zxh.job.pojo.Admin;
import com.zxh.job.pojo.Parttime;
import com.zxh.job.pojo.Person;
import com.zxh.job.service.AdminService;
import com.zxh.job.service.ParttimeService;

@Controller
@RequestMapping("")
public class AdminController {
	@Autowired
	AdminService adminservice;
	@Autowired
	ParttimeService parttimeservice;
	
	@RequestMapping("adminlist")
	public String list(Model model){
		List<Admin> list = adminservice.list();
		model.addAttribute("al",list);
		return "list";
		
	}
	/*@RequestMapping("personlogin")
	public String personlogin(@RequestParam("p_name") String p_name,@RequestParam("p_password") String p_password,Model model,HttpSession session){
		System.out.println("name:"+p_name+"--password"+p_password);
		Person person = personservice.get(p_name, p_password);
		
		if(person == null){
			//model.addAttribute("msg","账号或密码错误");
			System.out.println("账号或者密码错误");
			return "login";
		}
		
		session.setAttribute("personid", person.getP_id());
		return "redirect:indexui";
	}*/
	/*@RequestMapping("admin")
	public String admin(){
		return "adminlogin";
	}*/
	@RequestMapping("adminlogin")
	public String adminlogin(@RequestParam("a_name") String a_name,@RequestParam("a_password") String a_password,HttpSession session,Model model){
		Admin admin = adminservice.get(a_name, a_password);
		if(admin == null){
			model.addAttribute("msg","管理员账号或密码错误");
			System.out.println("账号或者密码错误");
			return "redirect:admin";
		}
		session.setAttribute("adminid", admin.getA_id());
		return "redirect:admincenterui";
		
	}
	
	@RequestMapping("admincenterui")
	public String admincenter(Model model){
		List<Parttime> list = parttimeservice.reviewlist();
		
		model.addAttribute("ptl",list);
		return "admincenter";
	}
	
	@RequestMapping("review")
	public String review(int pt_id){
		Parttime parttime=parttimeservice.get(pt_id);
		parttime.setPt_review(true);
		parttimeservice.update(parttime);
		return "redirect:admincenterui";
	}
}
