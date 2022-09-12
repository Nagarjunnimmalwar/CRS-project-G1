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
import com.lti.utils.*;
/**
 * @author 10710198
 *
 */
public class ProfessorImplementation implements ProfessorDao{

	/**
	 * @param args
	 */
	// Step 1
			// JDBC driver name and database URL
		  
		   
	public void selectCourse() {}
	public void addGrade() {}
	
	
	public void viewenrolledlist(int id) {
		  Connection conn = null;
		   PreparedStatement stmt = null;
		   try{
			   
			   
			   Class.forName("com.mysql.jdbc.Driver");

			      System.out.println("Connecting to database...");
			      conn = DbUtils.getConnection();
			   
			      HashMap arr = new HashMap<>();
			    /*  Scanner sc = new Scanner(System.in);
			      System.out.println("Enter your userId number:");		
					int uid = sc.nextInt();		
					System.out.println("Enter your password:");
					String password = sc.next();
			    */
			      String sql="insert into course values(?,?,?)";
			      stmt = conn.prepareStatement(sql);
			        int cId=0;
			      
			      sql = "SELECT CourseId,ProfessorId,CourseName FROM course";
			    //  int id = 0,role=0;
			      ResultSet rs = stmt.executeQuery(sql);
			       
			      //STEP 5: Extract data from result set
			      while(rs.next()){
			    	  cId  = rs.getInt("CourseId");
				         int pId  = rs.getInt("ProfessorId");
			        String cName= rs.getString("CourseName");
			      
			        //Change here as per role
			         if(pId==id)
		        	 {
		        	 //Students stud = new Students();
		        	 System.out.println(cName);

		        	 break;
						//StudentCRSMenu menuS= new StudentCRSMenu();
						//menuS.studentlogin(stud, uid);
		        	 }
			         
			      }
			      //System.out.println("Reached here");
			      //HashMap arr = new HashMap<>();
			      sql="select CourseId,StudentId,StudentName from semregistration";
			      rs = stmt.executeQuery(sql);
			      while(rs.next()) {
			    	  int cid=rs.getInt("CourseId");
			    	  int sid=rs.getInt("StudentId");
			    	  
			    	  String Sname=rs.getString("StudentName");
			    	  if(cid==cId)
			    	  { arr.put(rs.getInt("StudentId"),rs.getString("StudentName"));
			    	  }
			    	  
			      }
			    
			      System.out.println(arr);
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
			   //System.out.println("Goodbye!");
	}
}
