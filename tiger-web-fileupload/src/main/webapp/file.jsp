<%@ page language="java" pageEncoding="UTF-8"%>
<form action="<%=request.getContextPath()%>/file/upload" method="POST"
	enctype="multipart/form-data">
	yourfile: <input type="file" name="myfiles" /><br />
	yourfile: <input type="file" name="myfiles" /><br />
	yourfile: <input type="file" name="myfiles" /><br />
	<input type="submit" value="上传" />
</form>