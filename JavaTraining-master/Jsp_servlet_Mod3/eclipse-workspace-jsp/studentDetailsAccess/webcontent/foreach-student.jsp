<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.jsp.student.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
List <Student> data = new ArrayList<>();
data.add(new Student("Swapnil","Limgude",true));
data.add(new Student("Madhuri","Limgude",true));
data.add(new Student("Devendra","Limgude",false));
pageContext.setAttribute("stud", data);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- forEach : Iterates over group of values -->
<c:forEach var="mystud" items="${stud}">

${mystud.firstName} 
${mystud.lastName} 
${mystud.boldStudent} 
<br><hr>
</c:forEach>

</body>
</html>