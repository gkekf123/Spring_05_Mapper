<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>파라미터값 받기 - req_ex02.jsp</h3>
	
	<form action="param1" method="post">
		name : <input type="text" name="name"><br/>
		age : <input type="number" name="age"><br/>
		
		<!-- [on,on] 으로 나오기 때문에 value를 붙여준다 -->
		<input type="checkbox" name="inter" value="java">자바
		<input type="checkbox" name="inter" value="spring">스프링
		<input type="checkbox" name="inter" value="DB">데이터 베이스<br/>
		
		<button>서브밋(버튼타입이 없으면 서브밋)</button>
	</form>
	
</body>
</html>