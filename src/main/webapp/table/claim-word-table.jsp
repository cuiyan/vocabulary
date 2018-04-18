<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>语法杂货铺</title>
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">

		<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
		
	</head>

	<body>
		<h2 class="text-center">我要认领</h2>
		<form id="claimForm">
		  <div class="form-group">
		    <label for="exampleInputName2">哲学家</label>
		    <input type="hidden" name="id" value="${userPhilosopher.id}">
		    <input type="text" class="form-control" id="exampleInputName2" name="philosopherName" placeholder="请输入哲学家名称（中文/英文）" value="${userPhilosopher.philosopherName }">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail2">认领者</label>
		    <input type="email" class="form-control" id="exampleInputEmail2"  name="userName" placeholder="请输入认领者昵称" value="${userPhilosopher.userName }">
		  </div>
		 	 <button type="submit" id="submit" class="btn btn-default ">确认认领</button>
		</form>
	</body>
	
	<script src="../bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../js/lib/jquery.min.js"></script>
	<script type="text/javascript">
		$("#submit").click(function(){
			var data = $("#claimForm").serialize();
			$.ajax({ 
				url: "addUserAndPhilosopher", 
				data: data, 
				success: function(){
					window.location.href = "claimPhilosopherList";
		      }});
		});
	</script>
</html>