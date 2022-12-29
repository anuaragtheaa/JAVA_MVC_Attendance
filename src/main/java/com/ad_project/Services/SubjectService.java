package com.ad_project.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {
	public List<Subject> getSubjects(){
		ArrayList<Subject> subjects = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?characterEncoding=utf8","root","MySQL");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ad_subjects");
			
			while(rs.next()) {
				Subject s = new Subject(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
				subjects.add(s);
			}
		
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return subjects;
	}
	
	public List<Subject> getSubjects(String fid){
		ArrayList<Subject> subjects = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?characterEncoding=utf8","root","MySQL");
			
			PreparedStatement ps = con.prepareStatement("select * from ad_subjects where faculty=?");
			ps.setString(1, fid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Subject s = new Subject(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
				subjects.add(s);
			}
		
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return subjects;
	}
}
