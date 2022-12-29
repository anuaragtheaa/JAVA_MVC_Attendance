package com.ad_project.Services;

public class Subject {
	private String sid;
    private String sname;
    private int sessions;
    private int credits;
    private String faculty;
    private int course;
    
    public Subject(String sid, String sname, int sessions, int credits, String faculty, int course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sessions = sessions;
		this.credits = credits;
		this.faculty = faculty;
		this.course = course;
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSessions() {
		return sessions;
	}
	public void setSessions(int sessions) {
		this.sessions = sessions;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
}
