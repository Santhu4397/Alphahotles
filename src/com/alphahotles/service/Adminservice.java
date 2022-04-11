package com.alphahotles.service;

import java.util.List;

import com.alphahotels.db.HotelRepository;
import com.alphahotels.db.RepositoryManager;
import com.alphahotels.db.RoomRepository;
import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.Room;

public class Adminservice 
{
	HotelRepository HRP;
	RoomRepository RRP;
	RepositoryManager rm=new RepositoryManager();
	
	public void  inserthotel(Hotel h)
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		HRP.inserthotels(h);
	}
	public void selectallhotels()
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		List<Hotel> h1=HRP.selectallhotels();
		for(int i=0;i<h1.size();i++)
		   {
			System.out.println("cityname: "+h1.get(i).getHotelcity());
			   System.out.println("hotelname: "+h1.get(i).getHotelname());
			   System.out.println("hoteladdress: "+h1.get(i).getHoteladdress());
			   System.out.println("hoteldesc: "+h1.get(i).getHoteldesc());
			   System.out.println("hotelphone: "+h1.get(i).getHotelphone1());
			   System.out.println("rating: "+h1.get(i).getHoterating());
			   System.out.println("  ");
		   }
	}
	public void selecthotelsbycity(String hotelcity)
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		List<Hotel>h1=HRP.selecthotelsbycity(hotelcity);
		System.out.println(h1.size());
		for(int i=0;i<h1.size();i++)
		   {
			System.out.println("cityname: "+h1.get(i).getHotelcity());
		   System.out.println("hotelname: "+h1.get(i).getHotelname());
		   System.out.println("hoteladdress: "+h1.get(i).getHoteladdress());
		   System.out.println("hoteldesc: "+h1.get(i).getHoteldesc());
		   System.out.println("hotelphone: "+h1.get(i).getHotelphone1());
		   System.out.println("rating: "+h1.get(i).getHoterating());
		   System.out.println(" ");
		   }
	}
	
	public void deletebyhotelid(int hotelid)
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		HRP.deletehotelbyhid(hotelid);
		
	}
	public void selecthotelbyname(String hotelName) 
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		List<Hotel>h1=HRP.selecthotelbyname(hotelName);
		for(int i=0;i<h1.size();i++)
		   {
			System.out.println("cityname: "+h1.get(i).getHotelcity());
		   System.out.println("hotelname: "+h1.get(i).getHotelname());
		   System.out.println("hoteladdress: "+h1.get(i).getHoteladdress());
		   System.out.println("hoteldesc: "+h1.get(i).getHoteldesc());
		   System.out.println("hotelphone: "+h1.get(i).getHotelphone1());
		   System.out.println("rating: "+h1.get(i).getHoterating());
		   System.out.println(" ");
		   }
		
	}
	public void selecthotelbynamecity(String hotelname, String hotelcity)
	{
		HRP=(HotelRepository) rm.getRepository("hotelrepo");
		List<Hotel>h1=HRP.selecthotelbynamecity(hotelname,hotelcity);
		for(int i=0;i<h1.size();i++)
		   {
			System.out.println("cityname: "+h1.get(i).getHotelcity());
		   System.out.println("hotelname: "+h1.get(i).getHotelname());
		   System.out.println("hoteladdress: "+h1.get(i).getHoteladdress());
		   System.out.println("hoteldesc: "+h1.get(i).getHoteldesc());
		   System.out.println("hotelphone: "+h1.get(i).getHotelphone1());
		   System.out.println("rating: "+h1.get(i).getHoterating());
		   System.out.println(" ");
		   }
	}
	public void insertroom(Room r)
	{
		RRP=(RoomRepository)rm.getRepository("roomrepo");
		RRP.insertroom(r);
	}
}
