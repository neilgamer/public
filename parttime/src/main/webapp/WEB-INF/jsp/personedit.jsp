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
					<!-- <span class="city">广州</span>
					<a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/changeCity.html">[切换城市]</a> -->
				</div>
				<div class="channel_box">
					<a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/login" class="selected">企业用户入口>></a>
				</div>
			</nav>

		</header>
		<section class="container">

			<header class="w_main">
				<div class="logo_box clearfix">
					<a href="/" class="logo left"><img src="picture/wudi2.png" alt="兼职logo" height="50px"></a>
					<div class="search_wrap left">

						<!-- <input name="k" growing-track='true' type="text" placeholder="请输入搜索的内容" class="search" id="search" value=""><input type="button" value="搜索" class="submit" id="submit"> -->

					</div>

					<a href="http://www.jianzhimao.com/ctrlenprise/jobView" id="j-wrzbtn22" class="public right">个人中心</a>

				</div>
				<div class="banner_box" id="banner_box">
					<div class="banner_box_imgs" id="banner_box_imgs">
						<a href="https://www.jianzhimao.com/index/compdownload" target="_blank" class="selected"><img src="images/wudi.png" alt="banner loading"></a>
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
						<li class="selected"><i class="icon-edit"></i><a href="personcenterui">个人简历</a></li>
						<li><i class="icon-picture"></i><a href="personapplicationui">查看投递记录</a></li>
						<!-- <li><i class="icon-lock"></i><a>修改密码</a></li>
						<li><i class="icon-phone"></i><a>更改手机绑定</a></li> -->
					</ul>
				</aside>
				<div class="content_edit_box" id="content_edit_box">
					<div class="box" id="resume_box" style="display: block;">
						<div class="hd">
							修改简历资料<small class="orange">(注: 简历越完善，就越容易获得兼职信息哟)</small> 
						</div>
						<div class="cnt">
							<form action="personedit" method="post">
								<div class="row">
									<span class="txt_left">姓名:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="p_fullname" value="${person.p_fullname}">
										</label>
									</div>
								</div>
								
								<div class="row">
									<span class="txt_left">e-mail:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="p_email" value="${person.p_email}">
										</label>
									</div>
								</div>

								<div class="row">
									<span class="txt_left">联系电话:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="p_phone" value="${person.p_phone}">
										</label>
									</div>
								</div>

								
								<div class="row">
									<span class="txt_left">性别:</span>
									<div class="show_when_edit" style="display: block;">
									<c:choose>
										<c:when test="${person.p_sex}">
										<select class="select" name="p_sex">
											<option value="1" selected>男</option>
											<option value="0">女</option>
										</select>
										</c:when>
										<c:otherwise>
										<select class="select" name="p_sex">
											<option value="1">男</option>
											<option value="0" selected>女</option>
										</select>
										</c:otherwise>
										</c:choose>
									</div>
								</div>

								<div class="row">
									<span class="txt_left">出生日期:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<%-- <fmt:formatDate value="${person.p_birthday}" pattern="yyyy-MM-dd"/> --%>
										<input type="date" class="loginregisterdata"  name="p_birthday" value="<fmt:formatDate value="${person.p_birthday}" pattern="yyyy-MM-dd"/>">
										</label>
									</div>
								</div>
								
								<div class="row">
									<span class="txt_left">所在学校:</span>
									<div class="show_when_edit" style="display: block;">
										<label class="ipt_outer">
										<input type="text" class="loginregister"  name="p_school" value="${person.p_school}">
										</label>
									</div>
								</div>


								<div class="row">
									<span class="txt_left">是否毕业:</span>
									<div class="show_when_edit" style="display: block;">
										<c:choose>
										<c:when test="${person.p_graduate}">
										<label class="ipt_outer_radio">
										<input type="radio" name="p_graduate" value="1" checked="true"/> 是 
										<input type="radio" name="p_graduate" value="0" /> 否
										</label>
										</c:when>
										<c:otherwise>
										<label class="ipt_outer_radio">
										<input type="radio" name="p_graduate" value="1" /> 是 
										<input type="radio" name="p_graduate" value="0" checked="true"/> 否
										</label>
										</c:otherwise>
										</c:choose>
									</div>
								</div>
								

								<div class="row">
									<span class="txt_left">个人介绍:</span>
									<div class="show_when_save" style="display: none;">
										<span id="experience_saved">1</span>
									</div>
									<div class="show_when_edit" style="display: block;">
										<textarea class="textarea" name="p_introduction" rows="5">${person.p_introduction}</textarea>
									</div>
								</div>

								<div class="row">
									<span class="txt_left">证书技能:</span>
									<div class="show_when_save" style="display: none;">
										<span id="introduction_saved">1</span>
									</div>
									<div class="show_when_edit" style="display: block;">
										<textarea class="textarea" name="p_qualifications" rows="5">${person.p_qualifications}</textarea>
									</div>
								</div>
								<button  type="submit">保存</button>
								
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
