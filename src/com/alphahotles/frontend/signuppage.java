package com.alphahotles.frontend;

import java.util.Scanner;

import com.alphahotles.entity.User;
import com.alphahotles.service.UserServiceImp;
import com.alphahotles.utility.Utilities;

public class signuppage 
{
	static Scanner scn = new Scanner(System.in);
	static UserServiceImp usi=new UserServiceImp();
	static Utilities ul=new Utilities();
	public static void userSignup()
	{
	System.out.println("userSignup() executed");
	User us=new User();
	System.out.println("entre your name:");
	String username= scn.next(); 
	boolean validusername=ul.verifyName(username);
	  if(validusername==true)
	    {
	    us.setName(username);
	    }
	    else
	    {
	    	System.out.println(username+"INAVLID USER NAME name should conatin only Alphabets from A-Z or a-z");
	    }
	System.out.println("enter your EmailID:");
	String useremail=scn.next();
	boolean validemail=ul.verifyEmailFormat(useremail);
	  if(validemail==true)
	    {
	    us.setEmail(useremail);
	    }
	    else
	    {
	    	System.out.println(useremail+" INVALID EMAIL ID please check format alphahote@gmail.com");
	    }
	System.out.println("enter your password:");
	String userpassword=scn.next();
	boolean validpassword=ul.verifyPassword(userpassword);
	  if(validpassword==true)
	    {
	    us.setPassword(userpassword);
	    }
	    else
	    {
	    	System.out.println(userpassword+" PASSWORD should be of 8 chars with one SPL Char");
	    }
	System.out.println("enter your mobile numer:");
	String usermob=scn.next();
	boolean validmob=ul.verifymobile(usermob);
	if(validmob==true){
	us.setMob(usermob);
	}
	else
	{
		System.out.println("!!NOT VALID MOBILE NUMBER!!");
	}
	System.out.println("enter your Address:");
	String useraddress=scn.next();
	boolean validaddress=ul.verifyaddress(useraddress);
	  if(validaddress==true)
	    {
	    us.setAddress(useraddress);
	    }
	    else
	    {
	    	System.out.println("ADDERSS can't be empty");
	    }
	System.out.println("enter yor role:");
    String userrole=scn.next();
    boolean validrole=ul.verifyrole(userrole);
    if(validrole==true)
    {
    us.setRole(userrole);
    }
    else
    {
    	System.out.println(userrole+"  ROLE must be CUSTOMER/ADMIN/HOTEL-ADMIN");
    }
  
  
  
    
  
  
	usi.signup(us);
	}
}
