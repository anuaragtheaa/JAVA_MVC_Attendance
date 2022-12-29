package com.ad_project.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ad_project.Services.CourseService;

import java.sql.*;
import java.util.Calendar;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CourseService courseService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        this.courseService = new CourseService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("registration.jsp");
		request.setAttribute("courses", courseService.getCourses());
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String full_name = request.getParameter("full_name");
		String faname = request.getParameter("faname");
		String add = request.getParameter("add");
		String gender = request.getParameter("gender");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String pin = request.getParameter("pin");
		String dob = request.getParameter("dob");
		String course = request.getParameter("course");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		int curr_year = Calendar.getInstance().get(Calendar.YEAR);
		
		Connection con = null;
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world?characterEncoding=utf8","root","MySQL");  
		
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ad_register");
			int reg_no=1;
			while(rs.next()){
				reg_no += 1;
			}
			
			PreparedStatement ps = con.prepareStatement("insert into ad_register values(?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?)");
			ps.setInt(1, reg_no);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, full_name);
			ps.setString(5, mname);
			ps.setString(6, faname);
			ps.setString(7, phone);
			ps.setString(8, add);
			ps.setString(9, gender);
			ps.setString(10, state);
			ps.setString(11, city);
			ps.setString(12, dob);
			ps.setString(13, pin);
			ps.setString(14, course);
			ps.setString(15, email);
			ps.setInt(16, reg_no);
			ps.setInt(17, curr_year);
			ps.setString(18, pass);
			int rowCount = ps.executeUpdate();
			
			dispatcher = request.getRequestDispatcher("registration.jsp");
			
			if(rowCount>0) {
				request.setAttribute("status", "success");
				request.setAttribute("msg", "Account_created.Login_through_login_page");
			}else {
				request.setAttribute("status", "failed");
				request.setAttribute("msg", "Account_not_created!!_Error_in_form_data");
				
			}
			dispatcher.forward(request, response);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
