package com.ad_project.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

	public List<Course> getCourses() {
		ArrayList<Course> courses = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?characterEncoding=utf8","root","MySQL");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ad_course");
			
			while(rs.next()) {
				Course c = new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				courses.add(c);
			}
		
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		return courses;
	}

}
