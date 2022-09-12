/**
 * 
 */
package com.lti.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Scanner;

import com.lti.bean.Student;
import com.lti.collection.Students;
import com.lti.utils.DbUtils;

/**
 * @author 10710198
 *
 */
public class StudentImplemetation implements StudentDao {

	/**
	 * @param args
	 */
	 
	   
    
	   public void viewCourseCatalogue() {
			// TODO Auto-generated method stub


	        Connection conn = null;
	         PreparedStatement stmt = null;
	         
	         try{
	         	 Class.forName("com.mysql.jdbc.Driver");

				      System.out.println("Connecting to database...");
				      conn = DbUtils.getConnection();
	             
	              
	                
	              
	                String sql="insert into coursecatalog values(?,?)";
	        //        System.out.println("Step1 executed");
	                stmt = conn.prepareStatement(sql);
	                  
	              //  System.out.println("Step2 executed");
	                sql = "SELECT CourseName,CourseId FROM coursecatalog";
	                
	                ResultSet rs = stmt.executeQuery(sql);
	               // System.out.println("Step3 executed");
	                HashMap hm = new HashMap<>();
	                //STEP 5: Extract data from result set
	                while(rs.next()){
	                	hm.put(rs.getInt("CourseId"),rs.getString("CourseName"));
	                	//System.out.println("Step4 executed");
	                  // int CourseID  = rs.getInt("CourseId");
	                //   String CourseName = rs.getString("CourseName");
	                   
	                 
	               //  System.out.println(CourseID);
	                // System.out.println(CourseName);                       
	                }
	              //  System.out.println("Step5 executed");
	                System.out.println(hm);
	                stmt.close();
	                conn.close();
	             }catch(SQLException se){
	                 
	                se.printStackTrace();
	             }catch(Exception e){
	                 
	                e.printStackTrace();
	             }finally {
	                 
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
	             System.out.println("Courses displayed");
			
		}
	public void registerforCourse(Student current) {
		// TODO Auto-generated method stub
		
	}

	public void addCourse(int id) {
		// TODO Auto-generated method stub
		 Connection conn = null;
         PreparedStatement stmt = null;
         
         try{
             
             
             Class.forName("com.mysql.jdbc.Driver");



               System.out.println("Connecting to database...");
                conn = DbUtils.getConnection();
             
                String sql="insert into user values(?,?)";
                stmt = conn.prepareStatement(sql);
                  
                
                sql = "INSERT INTO semregistration(CourseId,StudentId, Approval) VALUES (?,?,?)";
                System.out.println("Enter courseID which you would like to enroll for:");
                Scanner sc = new Scanner(System.in);
                int cid = sc.nextInt();
                //ResultSet rs = stmt.executeQuery(sql);
                
                stmt.setInt(1, 0);
                stmt.setInt(2, cid);
                //stmt.executeQuery(sql);
               stmt.setInt(3, id);
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

	public void dropCourse(Student current) {
		// TODO Auto-generated method stub
		
	}

	public void payFees(Students stud, int id) {
		// TODO Auto-generated method stub
		
	}

	public void viewCourseCatalogue(Student current) {
		// TODO Auto-generated method stub
		
	}

	public void viewGrades() {
		// TODO Auto-generated method stub
		  Connection conn = null;
	         PreparedStatement stmt = null;
	         
	         try{
	         	 Class.forName("com.mysql.jdbc.Driver");

				      System.out.println("Connecting to database...");
				      conn = DbUtils.getConnection();
	             
	              
	                
	              
	                String sql="insert into coursecatalog values(?,?)";
	        //        System.out.println("Step1 executed");
	                stmt = conn.prepareStatement(sql);
	                  
	              //  System.out.println("Step2 executed");
	                sql = "SELECT CourseName,CourseId FROM coursecatalog";
	                
	                ResultSet rs = stmt.executeQuery(sql);
	               // System.out.println("Step3 executed");
	                HashMap hm = new HashMap<>();
	                //STEP 5: Extract data from result set
	                while(rs.next()){
	                	hm.put(rs.getInt("CourseId"),rs.getString("CourseName"));
	                	//System.out.println("Step4 executed");
	                  // int CourseID  = rs.getInt("CourseId");
	                //   String CourseName = rs.getString("CourseName");
	                   
	                 
	               //  System.out.println(CourseID);
	                // System.out.println(CourseName);                       
	                }
	              //  System.out.println("Step5 executed");
	                System.out.println(hm);
	                stmt.close();
	                conn.close();
	             }catch(SQLException se){
	                 
	                se.printStackTrace();
	             }catch(Exception e){
	                 
	                e.printStackTrace();
	             }finally {
	                 
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
	             System.out.println("Courses displayed");
			
	}
	public void registerforCourse(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void payFees(int id) {
		// TODO Auto-generated method stub
		
	}
	public void dropCourse(int id) {
		// TODO Auto-generated method stub
		
	}

	
	}


