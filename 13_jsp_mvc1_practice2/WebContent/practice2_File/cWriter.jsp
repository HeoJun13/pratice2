<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cWriter</title>
</head>
<body>

	<h3>게시글 작성</h3>
	<form action="cWriterpro.jsp" method = "post">
		<table border="1">
				<tr>
					<th>작성자</th>
					<td><input type = "text" name ="writer" ></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type = "text" name = "subject"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type = "text" name = "email" ></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type = "password" name = "password"></td>
				</tr>
				<tr>
					<th>글내용</th>
					<td>
						<textarea rows="20" cols="50" name = "content"></textarea>
						<script></script>
					</td>
				</tr>
		</table>
		<p>
			<input type = "submit" value= "작성">
			<input type = "button" value= "목록보기">
		</p>
	</form>
</body>
</html>