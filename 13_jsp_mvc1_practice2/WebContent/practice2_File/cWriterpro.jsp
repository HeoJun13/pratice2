<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cWriterpro</title>
</head>
<body>

		<%
		request.setCharacterEncoding("utf-8");
		
		BoardDTO2 boardDTO2 = new BoardDTO2();
		
		boardDTO2.setWriter(request.getParameter("writer"));;
		boardDTO2.setSubject(request.getParameter("subject"));
		boardDTO2.setEmail(request.getParameter("email"));
		boardDTO2.setPassword(request.getParameter("password"));
		boardDTO2.setContent(request.getParameter("content"));
		
		%>	
</body>
</html>