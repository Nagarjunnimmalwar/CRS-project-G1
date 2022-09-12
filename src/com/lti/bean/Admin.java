/**
 * 
 */
package com.lti.bean;

/**
 * @author 10710198
 *
 */
public class Admin extends User{
	User details;
	CourseCatalogue courses;
	
	
	public CourseCatalogue getCourses() {
		return courses;
	}	
	public void setCourses(CourseCatalogue courses) {
		this.courses = courses;
	}
	
	public User getDetails() {
		return details;
	}
	public void setDetails(User details) {
		this.details = details;
	}
}
