package com.alphahotles.frontend;

import java.util.Scanner;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.User;
import com.alphahotles.service.Adminservice;
import com.alphahotles.service.UserServiceImp;
import com.alphahotles.utility.Utilities;

public class loginpage 
{
	static Scanner scn = new Scanner(System.in);
	static UserServiceImp usi=new UserServiceImp();
	
	static Utilities ut=new Utilities ();
	
	public static void userlogin()
	{
		System.out.println("userlogin() executed");
		
		System.out.println("enter your emailID");
		String useremail=scn.next();
		boolean valiedemail=ut.verifyEmailFormat(useremail);
		System.out.println("enter your password");
		String userpassword=scn.next();
		boolean valiedpassword=ut.verifyPassword(userpassword);
		if(valiedemail==true&&valiedpassword==true)
		{
		usi.login(useremail,userpassword);
		}
		else
		{
			System.out.println(useremail+userpassword+"INVALID EMAIL ID&& PASSWORD please check format");
		}
		
		
	}
	
}
