package com.chap02;

public class Student extends People{
	public int studentNo;
	

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn, studentNo);
		this.studentNo = studentNo;
	}
	
	
}
