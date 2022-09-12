package com.lti.collection;

import java.util.HashMap;

import com.lti.bean.Professor;


public class Professors {
	public Boolean savedCred(int id,String password) {
		Professor Neelam = new Professor();
		Neelam.getDetails().setUserId(1);
		Neelam.getDetails().setUserPassword("neelam");
		Neelam.getDetails().setUserName("Neelam");
		Neelam.getDetails().setRole("Professor");
		Neelam.getDetails().setIPAddress(1);
//		Neelam.getCourses().add(maths);
		
		Professor Chinmay = new Professor();
		Chinmay.getDetails().setUserId(2);
		Chinmay.getDetails().setUserPassword("chinmay");
		Chinmay.getDetails().setUserName("Chinmay");
		Chinmay.getDetails().setRole("Professor");
		Chinmay.getDetails().setIPAddress(2);
		
		HashMap<Integer,Professor> credentials = new HashMap<Integer,Professor>();
		credentials.put(1, Neelam);
		credentials.put(2, Chinmay);
		
		return password.equals(credentials.get(id).getDetails().getUserPassword());
	}
}
