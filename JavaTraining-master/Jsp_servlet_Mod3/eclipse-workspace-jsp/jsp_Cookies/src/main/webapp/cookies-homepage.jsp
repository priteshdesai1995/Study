<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read fav car cookie</title>
</head>
<body>
<%

//by default
String favcar="BMW";

//get cokkies from browser
Cookie []cookie = request.getCookies();

//find our fav car
if(cookie!=null)
	for(Cookie temp: cookie)
	{
		if("mycar.favcar".equals(temp.getName()))
		{
			favcar=temp.getValue();
			break;
		}
	}
%>

<!-- Show personalize page -->
<h3>new brands for <%= favcar %></h3>
<ul>
==========
============
</ul>

<h3>new 2 brands for <%= favcar %></h3>
<ul>
==========
============
</ul>

<a href="cookies-html-form.html"> personalize page</a>
</body>
</html>