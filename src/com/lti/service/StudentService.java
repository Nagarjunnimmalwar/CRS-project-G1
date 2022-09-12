/**
 * 
 */
package com.lti.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.lti.application.StudentCRSMenu;
import com.lti.bean.Course;
import com.lti.bean.CourseCatalogue;
import com.lti.bean.Student;
import com.lti.collection.AdminCourseCatalogue;
import com.lti.collection.Courses;
import com.lti.collection.Students;

import java.util.Scanner;
/**
 * @author 10710198
 *
 */
public class StudentService {
	public void viewCourseCatalogue(Student current) {		
		ArrayList<Course> primary = current.getPrimary();
		if(primary.size() == primary.size()-primary.size()) 
			System.out.println("Primary Cart is Empty");
		
		else{
			System.out.println("Your Primary course cart contains:");
			for(Course c : primary) {
				System.out.println(c.getCourseID()+" "+c.getCourseName());
			}
			System.out.println();
		}
		
		
		ArrayList<Course> secondary = current.getSecondary();
		if(secondary.size() == secondary.size()-secondary.size()) 
			System.out.println("Secondary Cart is Empty");
		
		else{
			System.out.println("Your Secondary course cart contains:");
			for(Course c : secondary) {
				System.out.println(c.getCourseID()+" "+c.getCourseName());
			}
		}		
	}
	
	public void addCourse(Student current) {
		ArrayList<Course> cart = current.getPrimary();
		Courses coursesObj = new Courses();
		ArrayList<Course> courseList = coursesObj.courseList;
		for(Course c : courseList) {
			System.out.println(c.getCourseID()+" "+c.getCourseName());
		}
		
		System.out.println("Enter your choice of subject:\n");
		Scanner scan = new Scanner(System.in);
		String subject = scan.next();
		int flag = 0;
		for(Course c : courseList) {
			if(subject.equals(c.getCourseName())) {
				flag = 1;
				current.primary.add(c);
				break;
			}
		}
		if (flag==0) {
			System.out.println("Wrong course selected!\n");
			addCourse(current);
		}
		
	}
	public void dropCourse(Student current) {
		ArrayList<Course> cart = current.getPrimary();
		if(cart.size() == cart.size()-cart.size()) 
			System.out.println("Primary Cart is Empty");
		
		else{
			System.out.println("Your Primary course cart contains:");
			for(Course c : cart) {
				System.out.println(c.getCourseID()+" "+c.getCourseName());
			}
			System.out.println();
		}
		
		System.out.println("Enter subject to remove:\n");
		Scanner scan = new Scanner(System.in);
		String subject = scan.next();
		int flag = 0;
		for(int i = 0; i < cart.size();i++) {
			Course c = cart.get(i);
			if(subject.equals(c.getCourseName())) {
				flag = 1;
				cart.remove(i);
				current.setPrimary(cart);
				System.out.println("Your Primary course cart contains:");
				for(Course cc : cart) {
					System.out.println(cc.getCourseID()+" "+cc.getCourseName());
				}
				break;
			}
		}
		if (flag==0) {
			System.out.println("Wrong course selected!\n");
			dropCourse(current);
		}
		
		
		
		}
	public void registerforCourse(Student current) {
		ArrayList<Course> cart = current.getPrimary();
		if(cart.size() == cart.size()-cart.size()) 
			System.out.println("Primary Cart is Empty");
		
		else{
			System.out.println("Your Primary course cart contains:");
			for(Course c : cart) {
				System.out.println(c.getCourseID()+" "+c.getCourseName());
			}
			System.out.println();
		}
		}
	
	public void viewGrades() {
		
	}
	public void payFees(Students stud, int id) {
        System.out.println();
        System.out.println("Choose the payment option");
        System.out.println("1-Debit Card");
        System.out.println("2-Credit Card");
        System.out.println("3-UPI");
        System.out.println("4-Net Banking");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("Payment Successful");
        System.out.println();
        StudentCRSMenu menu = new StudentCRSMenu();
        menu.studentlogin(stud, id);
    }
}
