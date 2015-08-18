<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>Spring MVC: Hello</title>
</head>
<body>
	<h3>Hello</h3>
	<p>接下来，你可以：</p>
	<ol>
		<li><a href="<%=basePath%>">返回首页</a></li>
		<li><a href="<%=basePath%>simple/welcome">返回Welcome</a></li>
	</ol>
</body>
</html>
