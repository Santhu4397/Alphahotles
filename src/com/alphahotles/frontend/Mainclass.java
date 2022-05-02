package com.alphahotles.frontend;

import java.util.Scanner;

import com.alphahotles.service.UserServiceImp;

public class Mainclass {
	static Scanner scn = new Scanner(System.in);
	static UserServiceImp usi=new UserServiceImp();

	public static void menu() 
	{
		for(;;) {
		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("Any other key for exit");

		

		int choice = scn.nextInt();

		switch (choice)
		{
		case 1: System.out.println("signup selected");
		signuppage.userSignup();
			   break;
		case 2: System.out.println("login selected");
		loginpage.userlogin();
			   break;
		default:System.out.println("Exit"); 
			System.exit(0);

		}
		}
	}
	
	

	public static void main(String[] args) 
	{
		menu();
	}
}