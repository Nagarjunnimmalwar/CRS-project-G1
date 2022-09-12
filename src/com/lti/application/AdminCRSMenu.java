/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.collection.Admins;
import com.lti.dao.AdminImplementation;
import com.lti.service.AdminInterface;
import com.lti.service.AdminService;
import com.lti.service.StudentService;
import com.lti.service.UserService;

/**
 * @author 10710198
 *
 */
public class AdminCRSMenu {
	public void adminlogin(Admins adm, int id) {
		System.out.println();
		//System.out.println("Login Successful!");
		System.out.println("Choose your activity:");
		System.out.println("1-Approve registration");
		System.out.println("2-Generate report card");
		System.out.println("3-Add Professor");
		System.out.println("4-Add Course");
		System.out.println("5-Remove Course");
		System.out.println("6-Log Out");
	//	System.out.println("5-Remove Course");
		//System.out.println("6-View Report Card");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt(); 
		AdminImplementation serva=new AdminImplementation();
		switch(i) {
			case 1:
				serva.approveregistration();
				break;
			case 2:
				serva.generateReportCard();
				break;
			case 3:
				serva.addProfessor();
				break;
			case 4:
				serva.addCourse();
				break;
			case 5:
				serva.removeCourse();
				break;
			case 6:
				System.out.println("Logged out Successfully!");
				MainMenu objA=new MainMenu();
				objA.displaymain();
			default:
				System.out.println("Select valid activity!");
				adminlogin(adm, id);
		}adminlogin(adm, id);
		}
	}
	
	

