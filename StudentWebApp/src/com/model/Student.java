package com.model;

public class Student {
	
	private int studentId;
	private String studentName;
	private int age;
	private String gender;
	private String emailId;
	private String password;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int age, String gender, String emailId, String password) {
		super();
		this.studentId = studentId;
		this.studentName= studentName;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.password = password;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" +studentName + ",gender=" + gender
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
}


