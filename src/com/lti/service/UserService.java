/**
 * 
 */
package com.lti.service;

import java.util.Scanner;

import com.lti.application.*;
import com.lti.collection.*;
//package com.lti.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author 10710198
 *
 */
public class UserService {
	public void checkrole(int role,int id) {
		
		switch(role) {
			case 1:
				//Students stud = new Students();
				/*if(!(password.equals(stud.credentials.get(id).getDetails().getUserPassword()))){
					System.out.println("Wrong Credentials! \n");
					System.out.println();
					login();
				}*/
				//System.out.println("Login Successful!");
				StudentCRSMenu menuS= new StudentCRSMenu();
				menuS.studentlogin(id);
				break;
			case 2:
				Professors prof = new Professors();
				/*if(!prof.savedCred(id, password)){
					System.out.println("Wrong Credentials!");
					System.out.println();
					login();
				}*/
				ProfessorCRSMenu menuP= new ProfessorCRSMenu();
				menuP.professorlogin(prof, id);
				break;
			case 3:
				Admins adm = new Admins();
				/*if(!adm.savedCred(id, password)){
					System.out.println("Wrong Credentials!");
					System.out.println();
					login();
				}*/
				AdminCRSMenu menuA= new AdminCRSMenu();
				menuA.adminlogin(adm, id);
				break;			
			default:
				System.out.println("Select valid role!");
		}
		
        return;
	}
	public void logout() {
		return;
	}
	public Boolean updatePassword() {
		return true;
	}
}
