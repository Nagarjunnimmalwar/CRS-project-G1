package com.lti.collection;

import java.util.HashMap;

import com.lti.bean.Student;

public class Students {
	public HashMap<Integer,Student> credentials;
	
	public Students(){
		credentials = new HashMap<Integer,Student>();
		
		Student Oshita = new Student();
		Oshita.getDetails().setUserId(1);
		Oshita.getDetails().setUserPassword("oshita");
		Oshita.getDetails().setUserName("Oshita");
		Oshita.getDetails().setRole("Student");
		Oshita.getDetails().setIPAddress(1);
		
		Student Nathan = new Student();
		Nathan.getDetails().setUserId(2);
		Nathan.getDetails().setUserPassword("nathan");
		Nathan.getDetails().setUserName("Nathan");
		Nathan.getDetails().setRole("Student");
		Nathan.getDetails().setIPAddress(2);
		
		credentials.put(1, Oshita);
		credentials.put(2, Nathan);
	}	
	
	public HashMap<Integer, Student> getCredentials() {
		return credentials;
	}
	public void setCredentials(HashMap<Integer, Student> credentials) {}
}
