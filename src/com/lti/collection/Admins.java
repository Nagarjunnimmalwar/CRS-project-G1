package com.lti.collection;

import java.util.HashMap;

import com.lti.bean.Admin;

public class Admins {
	public Boolean savedCred(int id,String password) {
		Admin Nagarjuna = new Admin();
		Nagarjuna.getDetails().setUserId(1);
		Nagarjuna.getDetails().setUserPassword("chinmay");
		Nagarjuna.getDetails().setUserName("Chinmay");
		Nagarjuna.getDetails().setRole("Admin");
		Nagarjuna.getDetails().setIPAddress(2);
		
		HashMap<Integer,Admin> credentials = new HashMap<Integer,Admin>();
		credentials.put(1, Nagarjuna);
		
		return password.equals(credentials.get(id).getDetails().getUserPassword());
	}
}
