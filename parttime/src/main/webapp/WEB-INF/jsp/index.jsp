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
		<!--  font-awesome图标集  -->
		<link rel="stylesheet" href="css/font-awesome.min.css">
		
	</head>

	<body>
		<header class="header">
			<nav class="w_main navigation_box">
				<div class="city_wrap">
					<!-- <span class="city">广州</span>
					<a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/changeCity.html">[切换城市]</a> -->
				</div>
				<div class="channel_box">
					<a rel="nofollow" href="loginui" class="selected">企业用户入口>></a>
				</div>
			</nav>

		</header>
		<section class="container">

			<header class="w_main">
				<div class="logo_box clearfix">
					<a href="indexui" class="logo left"><img src="picture/wudi2.png" alt="兼职logo" height="50px"></a>
					<div class="search_wrap left">
						<form action="search" method="post">
						<input name="keyword" growing-track='true' type="text" placeholder="请输入搜索的内容" class="search" >
						<input type="submit" value="搜索" class="submit">
						</form>
					</div>

					<a href="personcenterui" id="j-wrzbtn22" class="public right">个人中心</a>

				</div>
				<div class="banner_box" id="banner_box">
					<div class="banner_box_imgs" id="banner_box_imgs">
						<a href="indexui" target="_blank" class="selected"><img src="images/wudi.png" alt="banner loading"></a>
					</div>
				</div>
				<div class="bread-crumb_box">

					<a rel="nofollow" href="#">南京兼职</a>
					<i class="icon-angle-right"></i>
					<span>南京兼职</span>
				</div>

			</header>
			<article class="w_main">
				<aside class="option_box">
					<div class="tabs clearfix">
						<a>最新兼职</a>
					</div>
					<div class="cnts">
						<ul class="box">

							<li><span>区&nbsp;&nbsp;域:</span>

								<a href="choosearea?area=all" rel="nofollow" class="tab">不限</a>
								<a href="choosearea?area=浦口" class="selected">浦口</a>
								<a href="choosearea?area=玄武" class="tab">玄武</a>
								<a href="choosearea?area=秦淮" class="tab">秦淮</a>
								<a href="choosearea?area=建邺" class="tab">建邺</a>
								<a href="choosearea?area=鼓楼" class="tab">鼓楼</a>
								<a href="choosearea?area=栖霞" class="tab">栖霞</a>
								<a href="choosearea?area=雨花台" class="tab">雨花台</a>
								<a href="choosearea?area=江宁" class="tab">江宁</a>
								<a href="choosearea?area=六合" class="tab">六合</a>
								<a href="choosearea?area=溧水" class="tab">溧水</a>
								<a href="choosearea?area=高淳" class="tab">高淳</a>
								<!-- <a href="/luogang_zbx_0/" class="tab">萝岗</a> -->
							</li>
						</ul>
					</div>
				</aside>
				<div class="order_box">
					<ul class="order_tab">

						<a href="indexui">
							<li class="">最新发布</li>
						</a>
						<a href="sort?sort=money">
							<li class="cur">最高薪资</li>
						</a>
						
					</ul>
				</div>
				<div class="content_box clearfix">
					<c:forEach items="${parttimelist}" var="ptl">
					<ul class="content_list_wrap" id="content_list_wrap">
						<li>
							<div class="left type_wrap">
								<i class="type lsg"></i>
							</div>
							<a href="indexdetail?pt_id=${ptl.pt_id}" target="_blank" title="" class="left title hot">${ptl.pt_name}</a>
							<div class="left area">
								<span title=""><i class="icon-map-marker"></i>&nbsp;${ptl.pt_area}</span>
							</div>
							<div class="left visited">
								<span title=""><i
										class="icon-user"></i>&nbsp;${ptl.pt_money}元/小时</span>
							</div>
							<div class="left date" title="刚刚">
								<i class="icon-time"></i> 刚刚</div>
						</li>
					</ul>
					</c:forEach>
					<div class="content_page_box">
						<ul class="content_page_wrap" id="content_page_wrap">
							<li>
								<a class="selected" rel="nofollow" href="indexui">1</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">2</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">3</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">4</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">5</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">6</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">7</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">8</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">9</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">10</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="#">11</a>
							</li>

							<li class="next">
								<a rel="nofollow" href="#">下一页</a>
							</li>
						</ul>
					</div>

			</article>
			<footer class="w_main container_footer">
			</footer>
		</section>
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/sea.js"></script>
		<script src="js/qrcode.min.js"></script>
		
	</body>

</html>