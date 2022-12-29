package com.ad_project.dashboard;

public class Student {
	private int register_no;
    private String full_name;
    private String mname;
    private String fname;
    private String phone;
    private String address;
    private String gender;
    private String state;
    private String city;
    private String dob;
    private String pin;
    private String course;
    private String email;
    private String roll;
    private String reg_year;
    
	public Student(int register_no, String full_name, String mname, String fname, String phone, String address,
			String gender, String state, String city, String dob, String pin, String course, String email, String roll,
			String reg_year) {
		super();
		this.register_no = register_no;
		this.full_name = full_name;
		this.mname = mname;
		this.fname = fname;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.state = state;
		this.city = city;
		this.dob = dob;
		this.pin = pin;
		this.course = course;
		this.email = email;
		this.roll = roll;
		this.reg_year = reg_year;
	}

	public int getRegister_no() {
		return register_no;
	}

	public void setRegister_no(int register_no) {
		this.register_no = register_no;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getReg_year() {
		return reg_year;
	}

	public void setReg_year(String reg_year) {
		this.reg_year = reg_year;
	} 
}
