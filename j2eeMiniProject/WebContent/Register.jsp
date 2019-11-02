<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:9090/j2eeMiniProject/RegisterController" method="post">
ENTER YOUR ID:<input type="text" name="cid">
<br><br>

ENTER YOUR NAME:<input type="text" name="cname">
<br><br>
ENTER YOUR QUALIFICATION:<input type="text" name="qualification">
<br><br>
ENTER YOUR STATE:<input type="text" name="state">
<br><br>

ENTER YOUR PARTY:<input type="text" name="party">
<br><br>
<input type="submit" name="submit" value="submit">
</form>


</body>
</html>