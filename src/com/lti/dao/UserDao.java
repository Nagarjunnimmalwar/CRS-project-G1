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
public interface UserDao {

	/**
	 * @param args
	 */
	// Step 1
	// JDBC driver name and database URL
    
   
	public void login();

	public void updatePassword();

	public void registration(); 

}
