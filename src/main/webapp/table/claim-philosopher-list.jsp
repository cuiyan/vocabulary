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
		<h2>哲学家认领</h2>
		<div class="table-responsive">
		  <table class="table">
		  	<thead>
		  		<tr>
		  			<td>编号</td><td>哲学家名称</td><td>认领人</td>
		  		</tr>
		  	</thead>
		    	<tbody>
		    		<c:forEach var="userPhilosopher" items="${userPhilosopherList}">
				   <tr>
				   		<td>${userPhilosopher.id}</td>
				   		<td>${userPhilosopher.philosopherName}</td>
				   		<td>${userPhilosopher.userName}</td>
				   </tr>
				</c:forEach>
		    	</tbody>
		    	<tfoot>
		    		<tr><td colspan="3"><a href="claimAPhilosopher"><button>我要认领</button></a></td></tr>
		    	</tfoot>
		  </table>
		</div>
	</body>
	
	<script src="../bootstrap/js/bootstrap.min.js"></script>
</html>