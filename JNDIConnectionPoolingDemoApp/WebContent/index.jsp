<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<
<sql:query var="listUsers" dataSource="jdbc/mydb1">
    select DISTINCT deptname from users;
    </sql:query>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="list">

		<select name="deptname">
			<c:forEach items="${listUsers.rows}" var="deptname">
				<option value="${user.deptname}"></option>

			</c:forEach>
		</select> <br />
		<br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>