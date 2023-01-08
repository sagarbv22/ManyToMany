package com.iNeuron.main;

import com.iNeuron.bean.Courses;
import com.iNeuron.bean.Students;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Students s1= new Students("Sagar", "S17", "Bpura");
		Students s2= new Students("manohar", "m13", "Kpura");
		Students s3= new Students("kabheer", "k27", "ppura");
		
		Students[] students = new Students[3];
		
		students[0]= s1;
		students[1]=s2;
		students[2]=s3;
		
		Courses c1 = new Courses("JFSE", "java8", students);
		Courses c2 = new Courses("DSFSE", "DS2", students);
		Courses c3 = new Courses("UXFSE", "UX1", students);
		
		
		c1.getCourseDetails();
		c2.getCourseDetails();
		c3.getCourseDetails();
	}

}
