<%@ page language="java" pageEncoding="UTF-8"%>
<form action="<%=request.getContextPath()%>/jdbc/testConn" method="POST">
	<table border="1" style="width: 900px;">
		<tr>
			<td width="10%">driver:</td>
			<td width="90%"><input type="text" name="driver" size="100"
				value="oracle.jdbc.driver.OracleDriver" /></td>
		</tr>
		<tr>
			<td width="10%">url:</td>
			<td width="90%"><input type="text" name="url" size="100"
				value="jdbc:oracle:thin:@10.88.15.161:1521:me2test5" /></td>
		</tr>
		<tr>
			<td width="10%">user:</td>
			<td width="90%"><input type="text" name="user" size="100"
				value="meuser" /></td>
		</tr>
		<tr>
			<td width="10%">password:</td>
			<td width="90%"><input type="text" name="password" size="100"
				value="test5#me2" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Test Conn" /></td>
		</tr>
	</table>
</form>