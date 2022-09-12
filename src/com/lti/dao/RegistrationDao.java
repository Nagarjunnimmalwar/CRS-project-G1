/**
 * 
 */
package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.lti.utils.DbUtils;

/**
 * @author 10710198
 *
 */
public class RegistrationDao {

	/**
	 * @param args
	 */
	
	   
		public void registration() {
			// TODO Auto-generated method stub
			

			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				  
				   
				   Class.forName("com.mysql.jdbc.Driver");

				    
				   
				      System.out.println("Connecting to database...");
				      conn = DbUtils.getConnection();


				     
				      System.out.println("Creating statement...");
				      String sql="insert into registration (RegId,RegName,RegAddress,RegContact,RegPassword,Adminapproval)values(?,?,?,?,?,?)";
				      
				      stmt = conn.prepareStatement(sql);
				   
				      // Hard coded data 
				      Scanner sc = new Scanner(System.in);
				      System.out.println("Enter your userId number:");		
						int rId = sc.nextInt();
						System.out.println("Enter your name:");
						String rName = sc.next();
						System.out.println("Enter your Address:");
						String rAddress = sc.next();
						System.out.println("Enter your Contact Info:");
						String rContact = sc.next();
						System.out.println("Enter your password:");
						String rPassword = sc.next();
				      
				      String approval="Pending";
				 
				    //  System.out.println("Working till here");
				      stmt.setInt(1, rId);  // This would set age
				      stmt.setString(2,rName);
				      stmt.setString(3,rAddress);
				      stmt.setString(4,rContact);
				      stmt.setString(5, rPassword);
				      stmt.setString(6, approval);
				    
				     // System.out.println("Working till here2");
				      stmt.executeUpdate();
				           
				 stmt.close();
				      conn.close();
				   }catch(SQLException se){
				    
				      se.printStackTrace();
				   }catch(Exception e){
				      
				      e.printStackTrace();
				   }finally{
				      
				      try{
				         if(stmt!=null)
				            stmt.close();
				      }catch(SQLException se2){
				      } 
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }
				   }
				  // System.out.println("Goodbye!");

		}

	}
	
