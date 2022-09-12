package com.lti.collection;

import java.util.ArrayList;

import com.lti.bean.Course;

public class Courses {
	public ArrayList<Course> courseList;
	public Courses(){
		courseList = new ArrayList<Course>();
		Course maths = new Course();
		maths.setCourseName("Maths");
		maths.setCourseID(1);
		maths.setInstructorID(1);
		courseList.add(maths);		
		
		Course phy = new Course();
		phy.setCourseName("Physics");
		phy.setCourseID(2);
		phy.setInstructorID(2);
		courseList.add(phy);
		
		
		Course chem = new Course();
		chem.setCourseName("Chemistry");
		chem.setCourseID(3);
		chem.setInstructorID(1);
		courseList.add(chem);
		
		
		Course bio = new Course();
		bio.setCourseName("Biology");
		bio.setCourseID(4);
		bio.setInstructorID(2);
		courseList.add(bio);
	}
	
	
	
}
