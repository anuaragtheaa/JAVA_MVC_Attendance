<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ad_project.Services.Course" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<% List<Course> courses = (List<Course>) request.getAttribute("courses"); %>

<section class="h-100 bg-dark">
	<form method="post" action="Register">
	  <div class="container py-5 h-100">
	    <div class="row d-flex justify-content-center align-items-center h-100">
	      <div class="col">
	        <div class="card card-registration my-4">
	          <div class="row g-0">
	            <div class="col-xl-6 d-none d-xl-block">
	              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
	                alt="Sample photo" class="img-fluid"
	                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
	            </div>
	            <div class="col-xl-6">
	              <div class="card-body p-md-5 text-black">
	                <h3 class="mb-5 text-uppercase">Student registration form</h3>
	
	                <div class="row">
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="fname" required="required" name="fname" class="form-control form-control-lg" />
	                      <label class="form-label" for="fname">First name</label>
	                    </div>
	                  </div>
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="lname" required="required" name="lname" class="form-control form-control-lg" />
	                      <label class="form-label" for="lname">Last name</label>
	                    </div>
	                  </div>
	                </div>
	
					<div class="form-outline mb-4">
	                  <input type="text" id="full_name" required="required" name="full_name" class="form-control form-control-lg" />
	                  <label class="form-label" for="add">Full Name as of 10th</label>
	                </div>
	
	                <div class="row">
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="mname" required="required" name="mname" class="form-control form-control-lg" />
	                      <label class="form-label" for="mname">Mother's name</label>
	                    </div>
	                  </div>
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="faname" required="required" name="faname" class="form-control form-control-lg" />
	                      <label class="form-label" for="faname">Father's name</label>
	                    </div>
	                  </div>
	                </div>
	
	                <div class="form-outline mb-4">
	                  <input type="text" id="add" required="required" name="add" class="form-control form-control-lg" />
	                  <label class="form-label" for="add">Address</label>
	                </div>
	
	                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
	
	                  <h6 class="mb-0 me-4">Gender: </h6>
	
	                  <div class="form-check form-check-inline mb-0 me-4">
	                    <input class="form-check-input" type="radio" name="gender" id="femaleGender"
	                      value="female" />
	                    <label class="form-check-label" for="femaleGender">Female</label>
	                  </div>
	
	                  <div class="form-check form-check-inline mb-0 me-4">
	                    <input class="form-check-input" type="radio" name="gender" id="maleGender"
	                      value="male" />
	                    <label class="form-check-label" for="maleGender">Male</label>
	                  </div>
	
	                  <div class="form-check form-check-inline mb-0">
	                    <input class="form-check-input" type="radio" name="gender" id="otherGender"
	                      value="other" />
	                    <label class="form-check-label" for="otherGender">Other</label>
	                  </div>
	
	                </div>
	
	                <div class="row">
	                  <div class="col-md-6 mb-4">
	
	                    <div class="form-outline">
	                      <input type="text" id="state" required="required" name="state" class="form-control form-control-lg" />
	                      <label class="form-label" for="state">State</label>
	                    </div>
	
	                  </div>
	                  <div class="col-md-6 mb-4">
	
	                    <div class="form-outline">
	                      <input type="text" id="city" required="required" name="city" class="form-control form-control-lg" />
	                      <label class="form-label" for="city">City</label>
	                    </div>
	
	                  </div>
	                </div>
	
					<div class="row">
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="pin" required="required" name="pin" class="form-control form-control-lg" />
	                      <label class="form-label" for="pin">Pin Code</label>
	                    </div>
	                  </div>
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="text" id="dob" required="required" name="dob" class="form-control form-control-lg" />
	                      <label class="form-label" for="dob">DOB</label>
	                    </div>
	                  </div>
	                </div>
	
					<div class="form-outline mb-4">
	
		                <select class="select form-control-lg" name="course">
		                  <option value="0">Select Course</option>
		                  <% for(Course course: courses){ %>
		                  <option value=<%=course.getId() %>><%=course.getName() %></option>
		                  <% } %>
		                </select>
	              	</div>
	
					<div class="form-outline mb-4">
	                  <input type="text" id="phone" required="required" name="phone" class="form-control form-control-lg" />
	                  <label class="form-label" for="phone">Phone No. </label>
	                </div>
	
	                <div class="form-outline mb-4">
	                  <input type="text" id="email" required="required" name="email" class="form-control form-control-lg" />
	                  <label class="form-label" for="email">Email ID</label>
	                </div>
	
					<div class="row">
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="password" id="pass" required="required" name="pass" class="form-control form-control-lg" />
	                      <label class="form-label" for="pass">Password</label>
	                    </div>
	                  </div>
	                  <div class="col-md-6 mb-4">
	                    <div class="form-outline">
	                      <input type="password" id="repass" required="required" name="repass" class="form-control form-control-lg" />
	                      <label class="form-label" for="repass">Re Password</label>
	                    </div>
	                  </div>
	                </div>
	
	                <div class="d-flex justify-content-end pt-3">
	                  <button type="button" class="btn btn-light btn-lg">Reset all</button>
	                  <input type="submit" class="btn btn-warning btn-lg ms-2" value="Submit form" />
	                </div>
	
	              </div>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	  </form>
</section>

<!-- Using Sweet Alert to display Message -->
<input type="hidden" id="status" value=<%= request.getAttribute("status") %> />
<input type="hidden" id="msg" value=<%= request.getAttribute("msg") %> />
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script type="text/javascript">
	var status = document.getElementById("status").value;
	var msg = document.getElementById("msg").value;
	if(status=="failed"){
		swal("Registration Failed", msg, "error");
	}
</script>
</body>
</html>