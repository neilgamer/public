<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix='fmt' %> 
<html>
<body>
<% request.getRequestDispatcher("/indexui").forward(request,response);%>
<h2>Hello World!</h2>
<h2><a href="loginui">进入个人登录</a></h2>
<h2><a href="registerui">进入注册</a></h2>
<h2><a href="personeditui">进入个人中心编辑</a></h2>
<h2><a href="personcenterui">进入个人中心显示</a></h2>
<h2><a href="adminloginui">进入管理员登录</a></h2>

 
<%
    Date now = new Date();
    pageContext.setAttribute("now",now);
%>
 
完整日期: <fmt:formatDate value="${now}" pattern="G yyyy年MM月dd日 E"/><br>
完整时间: <fmt:formatDate value="${now}" pattern="a HH:mm:ss.S z"/><br>
常见格式: <fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/>
</body>
</html>
