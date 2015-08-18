<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>Spring MVC: Index</title>
</head>
<body>
	<h3>Spring MVC Demo</h3>
	<p>本Demo用于研究Spring
		MVC，从最简单的无参请求，到带参请求。带参请求包括：GET请求，POST请求，请求自定义对象的参数等等。</p>
	<p>
		接下来从一个无参请求开始，进入本次主题的第一个Demo。<a href="<%=basePath%>simple/welcome"><%=basePath%>simple/welcome</a>
	</p>
</body>
</html>
