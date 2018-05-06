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
		<link rel="stylesheet" href="css/2.css">
		<!--  font-awesome图标集  -->
		<link rel="stylesheet" href="css/font-awesome.min.css">
		<style>
			.zxhform .row{
				
			}
			.zxhform{
			}
		</style>
	</head>

	<body>
		<header class="header">
			<nav class="w_main navigation_box">
				<div class="city_wrap">
					<!-- <span class="city">广州</span>
					<a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/changeCity.html">[切换城市]</a> -->
				</div>
				<div class="channel_box">
					<!-- <a rel="nofollow" href="http://www.jianzhimao.com/ctrlcity/login" class="selected">企业用户入口>></a> -->
				</div>
			</nav>

		</header>
		<section class="container">

			<header class="w_main">
				<div class="logo_box clearfix">
					<a href="indexui" class="logo left"><img src="picture/wudi2.png" alt="兼职logo" height="50px"></a>
					<div class="search_wrap left">

						<!-- <input name="k" growing-track='true' type="text" placeholder="请输入搜索的内容" class="search" id="search" value=""><input type="button" value="搜索" class="submit" id="submit"> -->

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
				<!-- <aside class="option_box">
					<div class="tabs clearfix">
						<a>最新兼职</a>
					</div>
					<div class="cnts">
						<ul class="box">

							<li><span>区&nbsp;&nbsp;域:</span>

								<a href="/" rel="nofollow" class="selected">不限</a>
								<a href="/tianhe_zbx_0/" class="tab">天河</a>
								<a href="/liwan_zbx_0/" class="tab">荔湾</a>
								<a href="/yuexiu_zbx_0/" class="tab">越秀</a>
								<a href="/haizhu_zbx_0/" class="tab">海珠</a>
								<a href="/huadu_zbx_0/" class="tab">花都</a>
								<a href="/panyu_zbx_0/" class="tab">番禺</a>
								<a href="/conghua_zbx_0/" class="tab">从化</a>
								<a href="/zengcheng_zbx_0/" class="tab">增城</a>
								<a href="/huangpu_zbx_0/" class="tab">黄埔</a>
								<a href="/baiyun_zbx_0/" class="tab">白云</a>
								<a href="/nansha_zbx_0/" class="tab">南沙</a>
								<a href="/luogang_zbx_0/" class="tab">萝岗</a>
							</li>
						</ul>
					</div>
				</aside>
				<div class="order_box">
					<ul class="order_tab">

						<a href="/">
							<li class="cur">最新发布</li>
						</a>
						<a href="/dbx_zbx_0_salary/">
							<li class="">最高薪资</li>
						</a>
						<a href="/dbx_zbx_0_click/">
							<li class="">最多人看</li>
						</a>
					</ul>
				</div> -->
				<div class="content_box clearfix">
					<%-- <c:forEach items="${parttimelist}" var="ptl">
					<ul class="content_list_wrap" id="content_list_wrap">

						<li>
							<div class="left type_wrap">
								<i class="type lsg"></i>
							</div>
							<a href="#" target="_blank" title="" class="left title hot">${ptl.pt_name}</a>
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
					</c:forEach> --%>
					<!-- <div class="content_page_box">
						<ul class="content_page_wrap" id="content_page_wrap">
							<li>
								<a class="selected" rel="nofollow" href="/dbx_zbx_0/index1.html">1</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index2.html">2</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index3.html">3</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index4.html">4</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index5.html">5</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index6.html">6</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index7.html">7</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index8.html">8</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index9.html">9</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index10.html">10</a>
							</li>

							<li>
								<a class="" rel="nofollow" href="/dbx_zbx_0/index11.html">11</a>
							</li>

							<li class="next">
								<a rel="nofollow" href="/dbx_zbx_0/index2.html">下一页</a>
							</li>
						</ul>
					</div> -->
					<form class="zxhform clearfix">
								<div style="width:50%;float:left">
									<div class="row">
									<span class="txt_left1">职位名称:</span>
									<div class="show_when_edit11" style="display: block;">
										<label>
										<span>${pt.pt_name}</span>
										</label>
									</div>
									</div>
									<div class="row">
										<span class="txt_left1">薪水:</span>
										<div class="show_when_edit1 red" style="display: block;">
											<label>
											<span>${pt.pt_money}</span>
											</label>
										</div>
									</div>
									
									<div class="row">
										<span class="txt_left1">省:</span>
										<div class="show_when_edit1" style="display: block;">
											<label>
											<span>${pt.pt_province}</span>
											</label>
										</div>
									</div>
	
									<div class="row">
										<span class="txt_left1">市:</span>
										<div class="show_when_edit1" style="display: block;">
											<label>
											<span>${pt.pt_city}</span>
											</label>
										</div>
									</div>
	
									<div class="row">
										<span class="txt_left1">地区:</span>
										<div class="show_when_edit1" style="display: block;">
											<label>
											<span>${pt.pt_area}</span>
											</label>
										</div>
									</div>
									
									<div class="row">
										<span class="txt_left1">详细地址:</span>
										<div class="show_when_edit1" style="display: block;">
											<label>
											<span>${pt.pt_address}</span>
											</label>
										</div>
									</div>
									<div class="row">
										<span class="txt_left1">详细信息:</span>
										<div class="show_when_save" style="display: none;">
											<span id="experience_saved">1</span>
										</div>
										<div class="show_when_edit1" style="display: block;">
											<span>${pt.pt_detail}</span>
										</div>
									</div>
								</div>
								<div class="width: 50%;float:left">
									<div class="row">
									<span class="txt_left1">公司全称:</span>
									<div class="show_when_edit1" style="display: block;">
										<label>
										<span>${pt.enterprise.e_fullname}</span>
										</label>
									</div>
								</div>
								<div class="row">
									<span class="txt_left1">公司联系人:</span>
									<div class="show_when_edit1" style="display: block;">
										<label>
										<span>${pt.enterprise.e_linkman}</span>
										</label>
									</div>
								</div>
								<div class="row">
									<span class="txt_left1">email:</span>
									<div class="show_when_edit1" style="display: block;">
										<label>
										<span>${pt.enterprise.e_email}</span>
										</label>
									</div>
								</div>
								<div class="row">
									<span class="txt_left1">联系电话:</span>
									<div class="show_when_edit1" style="display: block;">
										<label>
										<span>${pt.enterprise.e_phone}</span>
										</label>
									</div>
								</div>
								<a class="submitButton" href="addapplication?pt_id=${pt.pt_id}">
				
									投简历
								
								</a>
								</div>
								
							</form>

			</article>
			<footer class="w_main container_footer">
			</footer>
		</section>
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/sea.js"></script>
		<script src="js/qrcode.min.js"></script>
		<script>
			//判断当前浏览类型  
			function checkBrowserType() {
				var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串  
				var isOpera = userAgent.indexOf("Opera") > -1; //判断是否Opera浏览器  
				var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera; //判断是否IE浏览器  
				var isEdge = userAgent.indexOf("Windows NT 6.1; Trident/7.0;") > -1 && !isIE; //判断是否IE的Edge浏览器  
				var isFF = userAgent.indexOf("Firefox") > -1; //判断是否Firefox浏览器  
				var isSafari = userAgent.indexOf("Safari") > -1 && userAgent.indexOf("Chrome") == -1; //判断是否Safari浏览器  
				var isChrome = userAgent.indexOf("Chrome") > -1 && userAgent.indexOf("Safari") > -1; //判断Chrome浏览器  

				if(isIE) {
					var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
					reIE.test(userAgent);
					var fIEVersion = parseFloat(RegExp["$1"]);
					if(fIEVersion == 7) { return "IE7"; } else if(fIEVersion == 8) { return "IE8"; } else if(fIEVersion == 9) { return "IE9"; } else if(fIEVersion == 10) { return "IE10"; } else if(fIEVersion == 11) { return "IE11"; } else { return "0" } //IE版本过低  
				} //isIE end  

				if(isFF) { return "FF"; }
				if(isOpera) { return "Opera"; }
				if(isSafari) { return "Safari"; }
				if(isChrome) { return "Chrome"; }
				if(isEdge) { return "Edge"; }
			} //myBrowser() end  
			var _t = checkBrowserType();
			if(_t == "IE7" || _t == "IE8" || _t == "0") {
				if(document.getElementById("borwserTips") == undefined) {
					var div = document.createElement("div");
					div.setAttribute("id", "borwserTips");
					var txt = document.createTextNode("抱歉，你所用的浏览器版本过低，导致部分内容无法正常使用，可考虑升级IE9及以上版本或更换谷歌，火狐等浏览器进行使用，体验更佳哟。");
					div.appendChild(txt);
					div.style.background = "#fef9e5";
					div.style.color = "#ff5202";
					div.style.fontSize = "14px";
					div.style.textAlign = "center";
					div.style.height = "30px";
					div.style.lineHeight = "30px";
					var firstChild = document.body;
					firstChild.insertBefore(div, firstChild.childNodes[0])
				}
			}
		</script>
	</body>

</html>