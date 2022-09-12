/**
 * 
 */
package com.lti.collection;
import java.util.HashMap;

import com.lti.dao.UserImplementation;
import com.lti.service.UserService;
/**
 * @author 10710198
 *
 */

public class UserDetails {
	public void savedCred(int i,String j) {
		//HashMap<Integer,HashMap<Integer,String>>alldat();
HashMap<Integer,String>userdet=new HashMap<Integer,String>();
userdet.put(101,"Oshita");
userdet.put(102,"Nathan");
userdet.put(103,"Neelam");
userdet.put(104,"Chinmay");
userdet.put(105,"Nagarjun");
//System.out.println(""+i+" "+j);
//System.out.println(userdet.get(i));
System.out.println();
if(!(j.equals(userdet.get(i)))) {
	System.out.println("Wrong Credentials!");
	UserImplementation u=new UserImplementation();
	u.login();}
	}
}
