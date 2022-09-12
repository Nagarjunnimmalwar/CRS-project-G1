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

import com.lti.application.StudentCRSMenu;
import com.lti.collection.Students;
import com.lti.service.UserService;
import com.lti.utils.DbUtils;

/**
 * @author 10710198
 *
 */
public class UserImplementation implements UserDao  {

	/**
	 * @param args
	 */
	// Step 1
		// JDBC driver name and database URL
	  
	   
		public void login() {
			// TODO Auto-generated method stub
			

			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   
				   Class.forName("com.mysql.jdbc.Driver");

				      System.out.println("Connecting to database...");
				      conn = DbUtils.getConnection();
				   
				    
				      Scanner sc = new Scanner(System.in);
				      System.out.println("Enter your userId number:");		
						int uid = sc.nextInt();		
						System.out.println("Enter your password:");
						String password = sc.next();
				    
				      String sql="insert into user values(?,?,?)";
				      stmt = conn.prepareStatement(sql);
				        
				      
				      sql = "SELECT UserId,UserName,UserPassword FROM user";
				      int id = 0,role=0;
				      ResultSet rs = stmt.executeQuery(sql);
				       
				      //STEP 5: Extract data from result set
				      while(rs.next()){
				        
				         int userId  = rs.getInt("UserId");
				         String userName = rs.getString("UserName");
				        String userPassword= rs.getString("UserPassword");
				      
				        //Change here as per role
				         if(userId==uid && userPassword.equals(password))
			        	 {
			        	 //Students stud = new Students();
			        	System.out.println("Login Successful!");

			        	 id=uid;
							//StudentCRSMenu menuS= new StudentCRSMenu();
							//menuS.studentlogin(stud, uid);
			        	 }
				         
				      }
				      
				      sql="select RoleId,UserId from role";
				      rs = stmt.executeQuery(sql);
				      while(rs.next()) {
				    	  int sid=rs.getInt("UserId");
				    	  int rid=rs.getInt("RoleId");
				    	  if(sid==id)
				    		  role=rid;
				    		  
				      }
				      UserService a=new UserService();
					      a.checkrole(role,id);
				      
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

		public void updatePassword() {
			// TODO Auto-generated method stub
			
			 Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   
				   Class.forName("com.mysql.jdbc.Driver");

				      System.out.println("Connecting to database...");
				      conn = DbUtils.getConnection();
				   
				    
				      Scanner sc = new Scanner(System.in);
				      System.out.println("Enter your userId number:");		
						int uid = sc.nextInt();		
						System.out.println("Enter your old password:");
						String password = sc.next();
						System.out.println("Enter your new password:");
						String newpassword = sc.next();
						
				      String sql="insert into user values(?,?)";
				      stmt = conn.prepareStatement(sql);
				        
				      
				      sql = "SELECT UserId,UserPassword FROM user";
				      
				      ResultSet rs = stmt.executeQuery(sql);
				       
				      //STEP 5: Extract data from result set
				      while(rs.next()){
				        
				         int userId  = rs.getInt("UserId");
				        // String userName = rs.getString("UserName");
				        String userPassword= rs.getString("UserPassword");
				      
				        //Change here as per role
				         if(userId==uid && userPassword.equals(password))
			        	 {
				        	 stmt.execute("UPDATE user\r\n" + 
				        	 		"SET UserPassword = newpassword WHERE UserId = uid");
				        	 stmt.setString(2, newpassword);
				        	 System.out.println("Password updated!");
				        	/* Students stud = new Students();
			        	 System.out.println("Login Successful!");
							StudentCRSMenu menuS= new StudentCRSMenu();
							menuS.studentlogin(stud, uid);*/
			        	 }
				         
				      }
				      
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
				   System.out.println("Goodbye!");

		}
		
		public void registration() {
			// TODO Auto-generated method stub
			
		}
}
