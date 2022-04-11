package com.alphahotles.frontend;

import java.util.Scanner;

import com.alphahotles.entity.Booking;
import com.alphahotles.service.Adminservice;
import com.alphahotles.service.customerservice;

public class customerpage 
{
	static Scanner scn = new Scanner(System.in);
	static customerservice csi=new customerservice();
	public static void customermenu() 
	{
	System.out.println("1. viewprofile");
	System.out.println("2. searchhotelsbycity");
	System.out.println("3.  searchhotelbyhotelname");
	System.out.println("4.  searchhotelbynameandcity");
	System.out.println("5. Bookhotel");
	System.out.println("Any other key for exit");

	int choice = scn.nextInt();
	switch (choice) {
	case 1:csi.viewprofile();
		
		break;
	case 2:System.out.println("enter city");
			String city=scn.next();
		csi.searchhotelroombycity(city);	
		//csi.selectroom();
	break;
	case 3: System.out.println("enter hotel name" );
			String name=scn.next();
			csi.searchhotelroombyname(name);
			//csi.selectroom();
	break;
	case 4:System.out.println("enter hotel name" );
		String name1=scn.next();
		System.out.println("enter city");
		String city1=scn.next();
		csi.searchhotelroombynamecity(name1,city1);
		//csi.selectroom();
	break;
	case 5:System.out.println("enter from which date");
		Booking b=new Booking();		
		csi.bookhotel(b);
			
	break;

	default:System.out.println("EXIT");
		
	}
	}
}
