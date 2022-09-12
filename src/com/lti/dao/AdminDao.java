/**
 * 
 */
package com.lti.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * @author 10710198
 *
 */
public interface AdminDao {

	void approveregistration();
	public void generateReportCard(); 
	public void addCourse(); 
	public void addProfessor(); 
	
	public void removeCourse(); 
	    
}
