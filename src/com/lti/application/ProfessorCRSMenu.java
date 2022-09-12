/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.collection.Professors;
import com.lti.dao.ProfessorImplementation;
import com.lti.service.ProfessorService;
import com.lti.service.UserService;

/**
 * @author 10710198
 *
 */
public class ProfessorCRSMenu {
	public void professorlogin(Professors prof, int id) {
		System.out.println();
		//System.out.println("Login Successful!");
		System.out.println("Choose your activity:");
		System.out.println("1-Select Course");
		System.out.println("2-Add Grade");
		System.out.println("3-View Enrolled Student list");
		System.out.println("4-Log Out");
	//	System.out.println("5-Remove Course");
		//System.out.println("6-View Report Card");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt(); 
		ProfessorImplementation servb=new ProfessorImplementation();
		switch(i) {
			case 1:
				servb.selectCourse();
				break;
			case 2:
				servb.addGrade();
				break;
			case 3:
				servb.viewenrolledlist(id);
				break;
			case 4:
				System.out.println("Logged out Successfully!");
				MainMenu objA=new MainMenu();
				objA.displaymain();
			default:
				System.out.println("Select valid activity!");
				professorlogin(prof, id);
				
		}professorlogin(prof, id);
		}
		
	}

