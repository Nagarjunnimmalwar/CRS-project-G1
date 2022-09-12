/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.bean.Student;
import com.lti.collection.Students;
import com.lti.dao.StudentImplemetation;
import com.lti.service.StudentInterface;
import com.lti.service.StudentService;
import com.lti.service.UserService;

/**
 * @author 10710198
 *
 */
public class StudentCRSMenu {
	public void studentlogin( int id) {
		//Student current = stud.credentials.get(id);
		System.out.println();
		
		System.out.println("Choose your activity:");
		System.out.println("1-Semester Registration");
		System.out.println("2-Add Course");
		System.out.println("3-Drop Course");
		System.out.println("4-View Course Catalogue");
		System.out.println("5-Pay fees");
		System.out.println("6-View Report Card");
		System.out.println("7-Log Out");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt(); 
		
		StudentImplemetation serv = new StudentImplemetation();
		switch(choice) {
			case 1:
				serv.registerforCourse(id);
				break;
			case 2:
				serv.addCourse(id);
				/*while(true) {
				System.out.println("Do you want to add another course?\t y/n \n");
				String choice2 = in.next();
				if (choice2.equals("y")) {
					serv.addCourse(id);
				}
				else {
					break;
				}
				}*/
				break;
			case 3:
				serv.dropCourse(id);
				break;
			case 4:
				serv.viewCourseCatalogue();
				break;
			case 5:
				serv.payFees(id);
				break;
			case 6:
				serv.viewGrades();
				break;
			case 7:
				System.out.println("Logged out Successfully!");
				MainMenu objA=new MainMenu();
				objA.displaymain();
			default:
				System.out.println("Select valid activity!");
				studentlogin(id);
		}
		studentlogin(id);
	}
}
