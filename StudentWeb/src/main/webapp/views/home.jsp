<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*"%>
<%@page import="com.example.demo.dto.Student"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.note {
	text-align: center;
	height: 80px;
	background: -webkit-linear-gradient(left, #0072ff, #8811c5);
	color: #fff;
	font-weight: bold;
	line-height: 80px;
}

.form-content {
	padding: 5%;
	border: 1px solid #ced4da;
	margin-bottom: 2%;
	a
}

.form-control {
	border-radius: 1.5rem;
}

.btnSubmit {
	border: none;
	border-radius: 1.5rem;
	padding: 1%;
	width: 20%;
	cursor: pointer;
	background: #0062cc;
	color: #fff;
}
</style>
</head>
<body>
	<h1>Home Page JSP Calledddd ${student.getName()}</h1>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->
		
	<div class="container register-form">
        <div class="form">
            <div class="note">
                <p>This is a simpleRegister Form made using Boostrap.</p>
            </div>
            <%
            	String isUpdate =(String) request.getAttribute("isUpdate");
            	if(isUpdate == "true") {
            %>
			<form action="/edit" method="post">
	        
	        <%
	        } else { %>
	        <form action="/addStudent" method="post">
	        <%
	        }
	        %>
	              <form:errors path = "*" cssClass = "errorblock" element = "div" />
	        
	            <div class="form-content">
	                <div class="row">
	                    <div class="col-md-6">
	                        <div class="form-group">
	                        	<input type="hidden" class="form-control" name="id" value="${student.getId()}"/>
	                            <input type="text" class="form-control" placeholder="Your Name *" name="name" value="${student.getName()}"/>
	                        </div>
	                        <div class="form-group">
	                            <input type="text" class="form-control" placeholder="Phone Number *" name="phoneNumeber" value="${student.getPhoneNumeber()}"/>
	                        </div>
	                    </div>
	                    <div class="col-md-6">
	                        <div class="form-group">
	                            <input type="text" class="form-control" placeholder="Your Email *" name="email" value="${student.getEmail()}"/>
	                        </div>
	                    </div>
	                </div>
	                <button type="submit" class="btnSubmit">Submit</button>
	            </div>
	        </div>
	     </form>
    </div>
    
    
    <table class="table">
	  <thead>
	    <tr>
	      <th scope="col">Id</th>
	      <th scope="col">User Name</th>
	      <th scope="col">User Phone Number</th>
	      <th scope="col">User Email</th>
	      <th scope="col">Edit</th>
	      <th scope="col">Delete</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<% 
	  	List<Student> studentList = (List<Student>) request.getAttribute("studentList");
	  	for(Student student: studentList) {%>
	    <tr>
	      <th scope="row"><%=student.getId()%></th>
	      <td><%=student.getName()%></td>
	      <td><%=student.getPhoneNumeber()%></td>
	      <td><%=student.getEmail()%></td>
	       <td><a href="/editForm?id=<%=student.getId()%>">Edit</a></td>
	        <td><a href="/delete?id=<%=student.getId()%>">Delete</a></td>
	    </tr>
	    <%
	    }
	    %>
	  </tbody>
	</table>
</body>
</html>