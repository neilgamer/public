<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="utf-8">

		<title>管理员登录 - 兼兼</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		
		
		<link rel="stylesheet" href="assets/style/reset.css">
		<link rel="stylesheet" href="assets/style/header.css">
		<link rel="stylesheet" href="assets/style/container_header_logo_box.css">
		<link rel="stylesheet" href="assets/style/login.css">
		<link rel="stylesheet" href="assets/style/footer.css">
		<!--<link rel="stylesheet" href="assets/js/plugin/alt/style/reset.css">-->
		<link rel="stylesheet" href="css/1.css">
		<script>
    			<c:if test="${!empty msg}">
    			alert("${msg}")
    			</c:if>
		</script>
	</head>

	<body>

		<header class="header">
			<nav class="w_main navigation_box">
				<div class="city_wrap">
					<!-- <span class="city">深圳</span>
					<a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/changeCity.html">[切换城市]</a> -->
				</div>
			</nav>
		</header>

		<section class="container">
			<header class="w_main">
				<div class="logo_box clearfix">
					<a href="/" class="logo left"><img src="picture/wudi2.png" alt="兼职logo" height="50px"></a>
					<div class="title_wrap left">管理员登录</div>
				</div>
			</header>

			<div class="w_main content_box clearfix">
				<div class="login_box">
					<div class="user_type_tabs clearfix" id="user_type_tabs">
						<!-- <span class="selected" id="user_type-0">求职用户</span> <span  id="user_type-1">企业用户</span> -->
					</div>
					
					<form action="adminlogin" method="post">
					<div class="info_box" id="info_box1">
						<div>管理员账号</div>
						<label class="account_wrap"><i class="icon-user"></i> 
						<input type="text" class="loginregister"  name="a_name" tabindex="1">
						</label>
						<div class="forget_psw_wrap">
							密码
							<!-- <a href="/ctrlcommon/resetPassword" class="forget_psw">忘记密码？</a> -->
						</div>
						<label class="psw_wrap"><i class="icon-lock"></i> 
						<input type="password" class="loginregister"  name="a_password" tabindex="2"></label>

						<div class="login_btn" id="login_btn" >
							<button class="personloginsubmit" type="submit">登录</button> 
						</div>
						<div class="login_btn disabled" id="login_btn_disabled">
							<!-- <i class="icon-spinner icon-spin"></i> 正在登录 -->
						</div>
						<div class="register_wrap">
							<!-- 还没有兼兼账号？
							<a href="registerui">免费注册</a> -->
						</div>
					</div>
					</form>
					
					
				</div>
			</div>

			</div>
		</section>

		

		<footer class="footer">

		</footer>

		
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