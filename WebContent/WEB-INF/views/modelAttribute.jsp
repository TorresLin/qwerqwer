<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" id="modelTest" value="test">
<input type="text" value="${pojo.userName }">
<input type="text" value="${pojo.sex }">
</body>
<script type="text/javascript">
$(function () {
$("#modelTest").on("click", function () {
window.location.href = "http://localhost:8080/qwerqwer/model/modelTest.do";
})
});
</script>
</html>