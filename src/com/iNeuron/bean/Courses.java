package com.iNeuron.bean;

public class Courses {

	private String cName;
	private String cId;
	Students[] students;
	
	
	public Courses(String cName, String cId, Students[] students) {
		super();
		this.cName = cName;
		this.cId = cId;
		this.students = students;
	}
	
	
	public void getCourseDetails() {
		System.out.println("Course name::" + cName);
		System.out.println("Course Id  ::"+ cId);
		System.out.println("===================");
		System.out.println();
		System.out.println("Students Details");
		
		for (Students std : students) {
			System.out.println("Student Name	:"+std.sName);
			System.out.println("Student Id      :"+ std.sId);
			System.out.println("Student Address :"+ std.sAddress);
			
			System.out.println();
		}
		
		
	}
	
	
	
	
}
