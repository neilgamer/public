<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>兼兼</title>
		<!--移动端自适应-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
		<!--搜索关键字-->
		<meta name="keywords" content="兼兼，兼职">
		<!--描述-->
		<meta name="description" content="" />
		<!--IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame-->
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		
		
		<link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/header.css">
		<link rel="stylesheet" href="css/container_header.css">
		<link rel="stylesheet" href="css/index.css">
		<link rel="stylesheet" href="css/container_footer.css">
		<link rel="stylesheet" href="css/footer.css">
		<link rel="stylesheet" href="css/side_navigation_box.css">
		<link rel="stylesheet" href="css/content_ad_box.css">
		<link rel="stylesheet" href="css/alt.css">
		<link rel="stylesheet" href="assets/style/login.css">
		<link rel="stylesheet" href="css/2.css">
		
	</head>

	<body>
		<header class="header">
			<nav class="w_main navigation_box">
				<div class="city_wrap">
					<span class="city">企业中心</span>
					<!-- <a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/changeCity.html">[切换城市]</a> -->
				</div>
				<div class="channel_box">
					<a rel="nofollow" href="loginui" class="selected">个人用户入口>></a> 
				</div>
			</nav>

		</header>
		<section class="container">

			<header class="w_main">
				<div class="logo_box clearfix">
					<a href="enterprisecenterui" class="logo left"><img src="picture/wudi2.png" alt="兼职logo" height="50px"></a>
					<div class="search_wrap left">

						<!-- <input name="k" growing-track='true' type="text" placeholder="请输入搜索的内容" class="search" id="search" value=""><input type="button" value="搜索" class="submit" id="submit"> -->

					</div>

					<a href="enterprisecenterui" id="j-wrzbtn22" class="public right">企业中心</a>

				</div>
				<div class="banner_box" id="banner_box">
					<div class="banner_box_imgs" id="banner_box_imgs">
						<a href="enterprisecenterui" target="_blank" class="selected"><img src="images/wudi.png" alt="banner loading"></a>
					</div>
				</div>

			</header>
			<article class="w_main">
				<!-- <div class="zxhselect clearfix">
	<nav class="navbar">
		<a class="nav" href="#">分类管理</a>
		<a class="nav" href="#">用户管理</a>
		<a class="nav" href="#">订单管理</a>
	</nav>
</div>

				<table class="zxh1">
					<thead>
						<tr class="zxh2">
							<th>1</th>
							<th>1</th>
							<th>1</th>
							<th>1</th>
							<th>1</th>
							<th>1</th>
							<th>1</th>

						</tr>
					</thead>
					<tbody>

						<tr>
							<td>2</td>
							<td>2</td>
							<td>2</td>
							<td>2</td>
							<td>2</td>
							<td>2</td>
							<td>2</td>
						</tr>

					</tbody>
				</table> -->
				<article class="main_wrap clearfix">
				<aside class="content_side_bar">
					<div class="content_side_bar_header">
						<hr class="line">
						<span>账号设置</span>
					</div>
					<ul class="channels" id="channels">
						<li class="selected"><i class="icon-edit"></i><a href="enterprisecenterui">公司信息</a></li>
						<li><i class="icon-picture"></i><a href="showpartui">兼职信息</a></li>
						<!-- <li><i class="icon-lock"></i><a>修改密码</a></li>
						<li><i class="icon-phone"></i><a>更改手机绑定</a></li> -->
					</ul>
				</aside>
				<div class="content_edit_box" id="content_edit_box">
					<div class="box" id="resume_box" style="display: block;">
						<div class="hd">
							修改公司资料
							<!-- <a class="btn right cancel show_when_edit" style="display: inline;" href="enterpriseeditui">保存企业信息</a> -->
						</div>
						<div class="cnt">
							<form action="enterpriseedit" method="post">
								<div class="row">
									<span class="txt_left">公司全称:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_fullname" value="${enterprise.e_fullname}">
										</label>
									</div>
								</div>
								
								<div class="row">
									<span class="txt_left">联系人:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_linkman" value="${enterprise.e_linkman}">
										</label>
									</div>
								</div>
								
								<div class="row">
									<span class="txt_left">e-mail:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_email" value="${enterprise.e_email}">
										</label>
									</div>
								</div>
								
								<div class="row">
									<span class="txt_left">联系电话:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_phone" value="${enterprise.e_phone}">
										</label>
									</div>
								</div>
								<div class="row">
									<span class="txt_left">详细地址:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_address" value="${enterprise.e_address}">
										</label>
									</div>
								</div>
								<div class="row">
									<span class="txt_left">工商注册号:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="e_registration" value="${enterprise.e_registration}">
										</label>
									</div>
								</div>
								
								
								<button class="zxhbutton" type="submit">保存</button>
								
							</form>
						</div>
					</div>
					</article>
			</article>

			<footer class="w_main container_footer">
			</footer>
		</section>
		
		<script src="js/jquery-1.9.1.min.js"></script>
		
		<script>
				$("#user_type_tabs span").click(function() {
				if($(this).hasClass('selected')) { return; }
				$(".login_box .info_box").toggle();
				$("#user_type_tabs span").toggleClass("selected");
			});
		</script>
	</body>

</html>
