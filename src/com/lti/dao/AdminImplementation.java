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
public class AdminImplementation implements AdminDao{
	  
	@Override
	

	public void approveregistration() {
		// TODO Auto-generated method stub
		 Connection conn = null;
         PreparedStatement stmt = null;



       try {
            Class.forName("com.mysql.jdbc.Driver");



           System.out.println("Connecting to database...");
            conn = DbUtils.getConnection();


            String sql="insert into registration values(?,?,?,?,?,?)";
           stmt = conn.prepareStatement(sql);
          // sql="update registration set  Adminapproval='Approved' where Adminapproval='Pending'";
           sql = "SELECT RegId,RegName,RegContact,RegAddress,RegPassword,Adminapproval FROM registration";
           
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()) {
        	   int rId=rs.getInt("RegId");
        	   String rName=rs.getString("RegName");
        	   String rContact=rs.getString("RegContact");
        	   String rAddress=rs.getString("RegAddress");
        	   String rpass=rs.getString("RegPassword");
        	   String rapproval=rs.getString("Adminapproval");
        	   System.out.print(rs+" "+rName+ " "+rContact+" "+rAddress+"/n");
        	   if(rapproval=="Pending")
        	   {
        		   System.out.println("To approve the registration enter y/Y");
        		   Scanner sc = new Scanner(System.in);
                   char response = sc.next().charAt(0);
                   if(response=='y' || response=='Y')
                   {
                	   sql="insert into user (UserId,UserName,Contact,Address,UserPassword)values(?,?,?,?,?)";
                	   stmt = conn.prepareStatement(sql);
                	   stmt.setInt(1, rId);  // This would set age
                       stmt.setString(2,rName);
                       stmt.setString(3,rContact);
                       stmt.setString(4,rAddress);
                       stmt.setString(5, rpass);
                    //   stmt.setString(6, approval);
                     
                      // System.out.println("Working till here2");
                       stmt.executeUpdate();
                       
                   }
        	   }
           }
           
           stmt.execute(sql);
            //stmt.setInt(2, 1);
            //stmt.execute();

           System.out.println("Student registration approved");

           stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        }



        }
		
	public void generateReportCard() {
		// TODO Auto-generated method stub
		
	}
	public void addCourse() {
		// TODO Auto-generated method stub
		
	}
	public void addProfessor() {
		// TODO Auto-generated method stub
		
	}
	public void removeCourse() {
		// TODO Auto-generated method stub
		
	}
	
	

}
