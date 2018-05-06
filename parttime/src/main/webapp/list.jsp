<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                    <th>密码</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${al}" var="a">
                 
                <tr>
                    <td>${a.a_id}</td>
                    <td>${a.a_name}</td>
                    <td>${a.a_password}</td>
                    
                </tr>
                </c:forEach>
            </tbody>
        </table>


</body>
</html>