package com.ad_project.Services;

public class Course {
	private int id;
	private String name;
	private String type;
	private int duration;
	private int fee;
	
	public Course(int id, String name, String type, int duration, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.duration = duration;
		this.fee = fee;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

}
