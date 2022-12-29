package com.ad_project.faculty;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ad_project.Services.SubjectService;

/**
 * Servlet implementation class FLoginServlet
 */
@WebServlet("/flogin")
public class FLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SubjectService subjectService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        this.subjectService = new SubjectService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("flogin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		String pass = request.getParameter("password");
		HttpSession session = request.getSession();
		Connection con = null;
		RequestDispatcher dispatcher = null;
		
		if(userid==null || userid.length()<=5) {
			request.setAttribute("status", "failed");
			request.setAttribute("msg", "User_ID_must_be_longer_than_5_char");
			dispatcher = request.getRequestDispatcher("flogin.jsp");
			dispatcher.forward(request, response);
		}
		else if(pass==null || pass.length()<=5) {
			request.setAttribute("status", "failed");
			request.setAttribute("msg", "Password_must_be_longer_than_5_char");
			dispatcher = request.getRequestDispatcher("flogin.jsp");
			dispatcher.forward(request, response);
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?characterEncoding=utf8","root","MySQL");  
			
			PreparedStatement ps = con.prepareStatement("select * from ad_faculty where uname=? and pass=?");
			ps.setString(1, userid);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				session.setAttribute("name", rs.getString("fid"));
				request.setAttribute("subjects", this.subjectService.getSubjects(rs.getString("fid")));
				dispatcher = request.getRequestDispatcher("fdashboard.jsp");
			}
			else {
				request.setAttribute("status", "failed");
				request.setAttribute("msg", "Wrong_Id_or_Password");
				dispatcher = request.getRequestDispatcher("flogin.jsp");
			}
			dispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
