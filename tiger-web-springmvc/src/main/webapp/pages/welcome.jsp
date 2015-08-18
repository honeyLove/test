<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>Spring MVC: Welcome</title>
</head>
<body>
	<h3>Welcome</h3>
	<p>进入Welcome页面，表示无参请求成功。接下来，你可以：</p>
	<ol>
		<li><a href="<%=basePath%>">返回首页</a></li>
	</ol>
</body>
</html>
