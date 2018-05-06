package com.zxh.job.controller;


import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zxh.job.pojo.Application;
import com.zxh.job.pojo.Enterprise;
import com.zxh.job.pojo.Parttime;
import com.zxh.job.pojo.Person;
import com.zxh.job.service.ApplicationService;
import com.zxh.job.service.EnterpriseService;
import com.zxh.job.service.ParttimeService;
import com.zxh.job.service.PersonService;

@Controller
@RequestMapping("")
public class ForeController {
	@Autowired
	PersonService personservice;
	@Autowired
	EnterpriseService enterpriseservice;
	@Autowired
	ParttimeService parttimeservice;
	@Autowired
	ApplicationService applicationservice;
	
	
	@RequestMapping("indexui")
	public String indexui(Model model){
		System.out.println("进入主页面");
		List<Parttime> list = parttimeservice.reviewtruelist();
		model.addAttribute("parttimelist",list);
		return "index";
	}
	
	@RequestMapping("indexdetail")
	public String indexdetail(int pt_id,Model model){
		System.out.println("兼职信息ID"+pt_id);
		Parttime parttime = parttimeservice.get(pt_id);
		Enterprise enterprise = enterpriseservice.get(parttime.getE_id());
		parttime.setEnterprise(enterprise);
		model.addAttribute("pt",parttime);
		return "indexdetail";
	}
	
	@RequestMapping("addapplication")
	public String addapplication(int pt_id,HttpSession session){
		int p_id = (int) session.getAttribute("personid");
		Application application = new Application();
		application.setP_id(p_id);
		application.setPt_id(pt_id);
		Date d = new Date();
		application.setCreatetime(d);
		applicationservice.add(application);
		return "redirect:indexui";
	}
	
	@RequestMapping("loginui")
	public String loginui(){
		System.out.println("进入个人用户登录页面");
		return "login";
	}
	
	@RequestMapping("personlogin")
	public String personlogin(@RequestParam("p_name") String p_name,@RequestParam("p_password") String p_password,Model model,HttpSession session){
		System.out.println("name:"+p_name+"--password:"+p_password);
		Person person = personservice.get(p_name, p_password);
		
		if(person == null){
			model.addAttribute("msg","个人账号或密码错误");
			System.out.println("账号或者密码错误");
			return "login";
		}
		
		session.setAttribute("personid", person.getP_id());
		return "redirect:indexui";
	}
	
	@RequestMapping("enterpriselogin")
	public String enterpriselogin(@RequestParam("e_name") String e_name,@RequestParam("e_password") String e_password,Model model,HttpSession session){
		System.out.println("name:"+e_name+"--password:"+e_password);
		Enterprise enterprise = enterpriseservice.get(e_name, e_password);
		
		if(enterprise == null){
			model.addAttribute("msg","公司账号或密码错误");
			System.out.println("账号或者密码错误");
			return "login";
		}
		session.setAttribute("enterpriseid", enterprise.getE_id());
		return "redirect:enterprisecenterui";
	}
	@RequestMapping("registerui")
	public String registerui(){
		System.out.println("进入注册页面");
		return "register";
	}
	
	
	@RequestMapping("personregister")
	public String personregister(Model model,Person person){
		System.out.println(person);
		personservice.add(person);
		model.addAttribute("msg","註冊成功");
		return "login";
	}
	
	@RequestMapping("enterpriseregister")
	public String enterpriseregister(Model model,Enterprise enterprise){
		System.out.println(enterprise);
		enterpriseservice.add(enterprise);
		model.addAttribute("msg","註冊成功");
		return "login";
	}
	
	//进入修改页面
	@RequestMapping("personeditui")
	public String personeditui(Model model,HttpSession session){
		int p_id = (int) session.getAttribute("personid");
		System.out.println("session获取的id为"+p_id);
		Person person=personservice.get(p_id);
		model.addAttribute("person",person);
		return "personedit";
	}
	
	//修改方法
	@RequestMapping("personedit")
	public String personedit(Model model,Person person,HttpSession session){
		System.out.println("很关键，日期传入的是什么"+person.getP_birthday());
		int p_id = (int) session.getAttribute("personid");
		person.setP_id(p_id);
		personservice.update(person);
		return "personcenter";
	}
	//进入展示页面
	@RequestMapping("personcenterui")
	public String personcenterui(Model model,HttpSession session){
		int p_id = (int) session.getAttribute("personid");
		System.out.println("session获取的id为"+p_id);
		Person person=personservice.get(p_id);
		model.addAttribute("person",person);
		return "personcenter";
	}
	
	//进入修改页面
		@RequestMapping("enterpriseeditui")
		public String enterpriseeditui(Model model,HttpSession session){
			int e_id = (int) session.getAttribute("enterpriseid");
			System.out.println("session获取的id为"+e_id);
			Enterprise enterprise=enterpriseservice.get(e_id);
			model.addAttribute("enterprise",enterprise);
			return "enterpriseedit";
		}
		
		//修改方法
		@RequestMapping("enterpriseedit")
		public String enterpriseedit(Model model,Enterprise enterprise,HttpSession session){
			System.out.println("很关键，日期传入的是什么");
			int e_id = (int) session.getAttribute("enterpriseid");
			enterprise.setE_id(e_id);
			enterpriseservice.update(enterprise);
			return "enterprisecenter";
		}
		//进入展示页面
		@RequestMapping("enterprisecenterui")
		public String enterprisecenterui(Model model,HttpSession session){
			int e_id = (int) session.getAttribute("enterpriseid");
			System.out.println("session获取的id为"+e_id);
			Enterprise enterprise=enterpriseservice.get(e_id);
			model.addAttribute("enterprise",enterprise);
			return "enterprisecenter";
		}
		
		@RequestMapping("showpartui")
		public String showpartui(HttpSession session,Model model){
			int e_id = (int) session.getAttribute("enterpriseid");
			List<Parttime> pas = parttimeservice.listByEnterprise(e_id);
			model.addAttribute("pas",pas);
			return "showpart";
		}
		
		@RequestMapping("editpartui2")
		public String editpartui2(){
			return "editpart";
		}
		@RequestMapping("editpartui")
		public String editpartui(Model model,int pt_id){
			Parttime pt=parttimeservice.get(pt_id);
			model.addAttribute("pt",pt);
			return "editpart";
		}
		
		@RequestMapping("editpart")
		public String editpart(Model model,Parttime parttime,HttpSession session){
			int e_id = (int) session.getAttribute("enterpriseid");
			parttime.setE_id(e_id);
			
			Date d = new Date();
			parttime.setPt_starttime(d);
			if(parttime.getPt_id()==null){
				System.out.println(parttime.getPt_id()+"*******null********");
				parttime.setPt_review(false);
			parttimeservice.add(parttime);
			}else{
				System.out.println(parttime.getPt_id()+"*******有值********");
			parttimeservice.update(parttime);
			}
			
			model.addAttribute("pt",parttime);
			return "redirect:showpartui";
		}
		@RequestMapping("deletepart")
		public String deletepart(int pt_id){
			List<Application> aps = applicationservice.listByParttime(pt_id);
			for(int i=0;i<aps.size();i++){
				applicationservice.delete(aps.get(i).getId());
			}
			
			parttimeservice.delete(pt_id);
			return "redirect:showpartui";
		}
		@RequestMapping("enterpriseapplication")
		public String enterpriseapplication(int pt_id,Model model){
			List<Application> aps = applicationservice.listByParttime(pt_id);
			Parttime parttime = parttimeservice.get(pt_id);
			model.addAttribute("aps",aps);
			model.addAttribute("pt",parttime);
			return "enterpriseapplication";
		}
		
		//开始最重要的申请表连接了
		@RequestMapping("personapplicationui")
		public String personapplicationui(Model model,HttpSession session){
			int p_id = (int) session.getAttribute("personid");
			List<Application> aps = applicationservice.listByPerson(p_id);
			model.addAttribute("aps",aps);
			return "personapplication";
		}
		@RequestMapping("deleteapplicationp")
		public String deleteapplicationp(int id){
			applicationservice.delete(id);
			return "redirect:personapplicationui";
		}
		
		//搜索
		@RequestMapping("search")
		public String search(Model model,String keyword){
			System.out.println("搜索框内容"+keyword);
			List<Parttime> list = parttimeservice.search(keyword);
			model.addAttribute("parttimelist",list);
			return "index";
		}
		
		@RequestMapping("sort")
		public String sort(Model model,String sort){
			if(sort.equals("money")){
			List<Parttime> list = parttimeservice.reviewtruelist();
			for(int i=0;i<=list.size()-1;i++){
				for(int j=0;j<list.size()-1-i;j++){
					if(list.get(j).getPt_money()<list.get(j+1).getPt_money()){
						Collections.swap(list,j,(j+1));
					}
				}
			}
			model.addAttribute("parttimelist",list);}
			return "index";
		}
		
		@RequestMapping("choosearea")
		public String choosearea(Model model,String area){
			try {
				area = new String(area.getBytes("ISO8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				System.out.println("转码失败");
				e.printStackTrace();
			}
			System.out.println("区域内容"+area);
			if(area.equals("all"))
				return "redirect:indexui";
			List<Parttime> list = parttimeservice.choosearea(area);
			model.addAttribute("parttimelist",list);
			return "index";
		}
		
		//管理员
		@RequestMapping("admin")
		public String adminloginui(){
			System.out.println("进入管理员登录页面");
			return "adminlogin";
		}
}
