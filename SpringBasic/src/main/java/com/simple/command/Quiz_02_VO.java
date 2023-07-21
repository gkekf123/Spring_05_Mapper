package com.simple.command;


public class Quiz_02_VO {
	
	private String id;
	private String pw;
	private String pwCheck;
	private String name;
	private String email;
	private String year;
	private String month;
	private String day;
	
	public Quiz_02_VO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Quiz_02_VO [id=" + id + ", pw=" + pw + ", pwCheck=" + pwCheck + ", name=" + name + ", email=" + email
				+ ", year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPwCheck() {
		return pwCheck;
	}

	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}