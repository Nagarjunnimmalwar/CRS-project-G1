/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.dao.RegistrationDao;
import com.lti.dao.UserDao;
import com.lti.dao.UserImplementation;
import com.lti.service.UserService;

/**
 * @author 10710198
 *
 */
public class MainMenu{
	public void displaymain() {
		System.out.println("Welcome to the CRS application!");
		System.out.println("Enter the required activity: \n" + "1) Login\r\n" + "2) Update password\r\n" + "3) Registration\r\n" + "4) Exit");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt(); 
		//UserDao service =  new UserDao();
		switch(choice) {
		case 1:
			UserImplementation service =  new UserImplementation();
			service.login();
			break;
		case 2:
			UserImplementation service2= new UserImplementation();
			service2.updatePassword();
			break;
		case 3:
			RegistrationDao service3=new RegistrationDao();
			service3.registration();
			break;
		case 4:
			System.out.println("Application Exited!!");
			return;
		default:
			System.out.println("Select valid activity!");
			displaymain();	
		}
	}
}
