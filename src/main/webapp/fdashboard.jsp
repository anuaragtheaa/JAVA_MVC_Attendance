<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ad_project.Services.Subject" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<% List<Subject> subjects = (List<Subject>) request.getAttribute("subjects"); %>

<table class="table table-striped table-responsive-md btn-table">

  <thead>
    <tr>
      <th>#</th>
      <th>Course Id</th>
      <th>Course Name</th>
      <th>Attendance</th>
    </tr>
  </thead>
  <tbody>
	<% for(Subject subject: subjects) { %>
	  <form action="fattendance" method="post">
	  <tr>
      <th scope="row">3</th>
      <td><input name="sid" value=<%= subject.getSid() %> /></td>
      <td><%= subject.getSname() %></td>
      <td>
        <input type="submit" class="btn btn-outline-primary btn-sm m-0 waves-effect" value="Mark Attendance" />
      </td>
    </tr>
    </form>
	<% } %>
  </tbody>
</table>
</body>
</html>