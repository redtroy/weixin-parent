<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>validate</title>
</head>
<body>
<%
String signature=request.getParameter("signature");
String timestamp=request.getParameter("timestamp");
String nonce=request.getParameter("nonce");
String echostr=request.getParameter("echostr");
System.out.println("signature="+signature);
System.out.println("timestamp="+timestamp);
System.out.println("nonce="+nonce);
System.out.println("echostr="+echostr);
%>
</body>
</html>