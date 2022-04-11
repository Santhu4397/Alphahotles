
package com.alphahotles.frontend;

import java.util.Scanner;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.Room;
import com.alphahotles.service.Adminservice;
import com.alphahotles.service.UserServiceImp;

public class adminpage 
{
	static Scanner scn = new Scanner(System.in);
	static Adminservice asi=new Adminservice();
	public static void Adminmenu() 
	{
	System.out.println("1. inserthotels");
    System.out.println("2. insertroom");
	System.out.println("3. selectallhotels");
	System.out.println("4. selecthotelsbycity");
	System.out.println("5. deletebyhotelid");
	System.out.println("6. selecthotelbyhotelname");
	System.out.println("7. selecthotelbynameandcity");
	System.out.println("Any other key for exit");

	int choice = scn.nextInt();

	switch (choice)
	{
	case 1: System.out.println("insert hotels selected");
	inserthotels();
		   break;
	case 2: System.out.println("insert room selected");
	insertroom();
	break;
	case 3: System.out.println("select all hotels selected");
	asi.selectallhotels();
	break;
	case 4: System.out.println("select hotels by city selected");
	selectbycity();
		   break;
	case 5: System.out.println("delete by hotelid selected");
	deletebyhotelid();
		   break;
	case 6: System.out.println("select hotel by hotelname selected");
	System.out.println("enter hotelname");
	String hotelname=scn.next();
	asi.selecthotelbyname(hotelname);
		   break;
	case 7: System.out.println("select hotel by name and city selected");
	System.out.println("enter hotel name ");
	String hotelname1=scn.next();
	System.out.println("enter hotel city");
	String hotelcity=scn.next();
	asi.selecthotelbynamecity(hotelname1, hotelcity);
		   break;
		   
	default: System.out.println("exit");

	}
	}
	
	public static void inserthotels()
	{
		Hotel h=new Hotel();
		System.out.println("this is insert hotels()");
		System.out.println("enter the city");
		String city=scn.next();
		h.setHotelcity(city);
		
		System.out.println("enter hotel_name");
		String hotelname=scn.next();
		h.setHotelname(hotelname);
		
		System.out.println("enter address");
		String hoteladdress=scn.next();
		h.setHoteladdress(hoteladdress);
		
		System.out.println("description");
		String description=scn.next();
		h.setHoteldesc(description);
		
		System.out.println("avg_rate_pernight");
		String rate=scn.next();
		h.setHotelcost(rate);
		
		System.out.println("phone_no1");
		String phone1=scn.next();
		h.setHotelphone1(phone1);
		
		System.out.println("phone_no2");
		String phone2=scn.next();
		h.setHotelphone1(phone2);
		
		System.out.println("rating");
		String rating=scn.next();
		h.setHoterating(rating);
		
		System.out.println("emailID");
		String emailid=scn.next();
		h.setHotelemail(emailid);
		asi.inserthotel(h);
	}
	public static void insertroom()
	{
		Room r=new Room();
		System.out.println("enter Hotelid");
		String hotelid=scn.next();
		r.setHotelid(hotelid);
		System.out.println("enter roomid");
		String roomid=scn.next();
		r.setRoomid(roomid);
		System.out.println("enter room number");
		String roomnum=scn.next();
		r.setRoomno(roomnum);
		System.out.println("enter room type");
		String roomtype=scn.next();
		r.setRoomtype(roomtype);
		System.out.println("enter room cost pernight");
		String cost=scn.next();
		r.setRommcost(cost);
		System.out.println("enter room is avilablie or not");
		String avil=scn.next();
		r.setRoomavilable(avil);
		asi.insertroom(r);
		
	}
	public static void selectbycity()
	{
		System.out.println("enter city name");
		String city=scn.next();
		asi.selecthotelsbycity(city);
	}
	public static void deletebyhotelid()
	{
		System.out.println("enter hotelID");
		int hotelid=scn.nextInt();
		asi.deletebyhotelid(hotelid);
	}
	public static void selectbyhotelname()
	{
		System.out.println("enter hotelname");
		String hotelname=scn.next();
		asi.selecthotelbyname(hotelname);
	}
	public static void selectbyhotelbynameandcity()
	{
		System.out.println("enter hotel name ");
		String hotelname=scn.next();
		System.out.println("enter hotel city");
		String hotelcity=scn.next();
		asi.selecthotelbynamecity(hotelname,hotelcity);
	}

}
