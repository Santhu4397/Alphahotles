package com.alphahotels.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.User;

public class HotelRepositoryimp extends Repositoryutil implements HotelRepository 
{
	List<Hotel> hotels = new ArrayList<Hotel>();
	int count=0;
	@Override
	public void inserthotels(Hotel h) {
		openconnection();
		try {
			PreparedStatement psr=condb.prepareStatement(SQLQuery.Inserthotel);
			psr.setInt(1, 0);
			psr.setString(2, h.getHotelcity());
			psr.setString(3, h.getHotelname());
			psr.setString(4, h.getHoteladdress());
			psr.setString(5, h.getHoteldesc());
			psr.setString(6, h.getHoterating());
			psr.setString(7, h.getHotelphone1());
			psr.setString(8, h.getHotelphone2());
			psr.setString(9, h.getHoterating());
			psr.setString(10, h.getHotelemail());
			count=psr.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(count+"hotelinserted-repository");
		closeconnection();
		
	}
	
		
	@Override
	public List<Hotel>  selectallhotels() 
	{
		openconnection();
		try 
		{
			PreparedStatement p1=condb.prepareStatement(SQLQuery.Selectallhotel);
			
			ResultSet r=p1.executeQuery();
			while(r.next())
			{
			String hotlecity=r.getString("city");
			String hotel_name=r.getString("hotel_name");
			String address=r.getString("address");
			String description=r.getString("description");
			String avg_rate_pernight=r.getString("avg_rate_pernight");
			String phone_no1= r.getString("phone_no1");
			String phone_no2=r.getString("phone_no2");
			String rating=r.getString("rating");
			String email=r.getString("email");
			
			Hotel h=new Hotel();
			h.setHoteladdress(address);
			h.setHotelcity(hotlecity);
			h.setHotelcost(avg_rate_pernight);
			h.setHoteldesc(description);
			h.setHotelphone1(phone_no1);
			h.setHotelphone2(phone_no2);
			h.setHoterating(rating);
			h.setHotelemail(email);
			h.setHotelname(hotel_name);
			
			hotels.add(h);
			
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnection();
		return hotels;
		
	}

	@Override
	public List<Hotel> selecthotelsbycity(String hotelcity)
	{
		openconnection();
		try 
		{
			PreparedStatement p=condb.prepareStatement(SQLQuery.Selecthotelbycity);
			p.setString(1, hotelcity);
			
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				
			String hotelid=r.getString("hotel_id");
			String hotlecity=r.getString("city");
			String hotel_name=r.getString("hotel_name");
			String address=r.getString("address");
			String description=r.getString("description");
			String avg_rate_pernight=r.getString("avg_rate_pernight");
			String phone_no1= r.getString("phone_no1");
			String phone_no2=r.getString("phone_no2");
			String rating=r.getString("rating");
			String email=r.getString("email");
			
			Hotel h=new Hotel();
			h.setHotelid(hotelid);
			h.setHoteladdress(address);
			h.setHotelcity(hotlecity);
			h.setHotelcost(avg_rate_pernight);
			h.setHoteldesc(description);
			h.setHotelphone1(phone_no1);
			h.setHotelphone2(phone_no2);
			h.setHoterating(rating);
			h.setHotelemail(email);
			h.setHotelname(hotel_name);
			
			hotels.add(h);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnection();
		return hotels;

		
	}

	@Override
	public List<Hotel>  selecthotelbyname(String hotelname) 
	{
		openconnection();
		try 
		{
			PreparedStatement p=condb.prepareStatement(SQLQuery.Selecthotelbyhotelname);
			p.setString(1, hotelname);
			
			ResultSet r=p.executeQuery();
			while(r.next())
			{
			String hotelid=r.getString("hotel_id");
			String hotlecity=r.getString("city");
			String hotel_name=r.getString("hotel_name");
			String address=r.getString("address");
			String description=r.getString("description");
			String avg_rate_pernight=r.getString("avg_rate_pernight");
			String phone_no1= r.getString("phone_no1");
			String phone_no2=r.getString("phone_no2");
			String rating=r.getString("rating");
			String email=r.getString("email");
			
			Hotel h=new Hotel();
			h.setHotelid(hotelid);
			h.setHoteladdress(address);
			h.setHotelcity(hotlecity);
			h.setHotelcost(avg_rate_pernight);
			h.setHoteldesc(description);
			h.setHotelphone1(phone_no1);
			h.setHotelphone2(phone_no2);
			h.setHoterating(rating);
			h.setHotelemail(email);
			h.setHotelname(hotel_name);
			
			hotels.add(h);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnection();
		return hotels;

		

		
		
	}

	@Override
	public List<Hotel>  selecthotelbynamecity(String hotelname, String hotelcity) {
		Hotel h=null;
		openconnection();
		try {
		
			PreparedStatement p=condb.prepareStatement(SQLQuery.Selecthotelbynameandcity);
			p.setString(1, hotelname);
			p.setString(2, hotelcity);	
			ResultSet r=p.executeQuery();
			while(r.next())
			{
			String hotelid=r.getString("hotel_id");
			String hotlecity=r.getString("city");
			String hotel_name=r.getString("hotel_name");
			String address=r.getString("address");
			String description=r.getString("description");
			String avg_rate_pernight=r.getString("avg_rate_pernight");
			String phone_no1= r.getString("phone_no1");
			String phone_no2=r.getString("phone_no2");
			String rating=r.getString("rating");
			String email=r.getString("email");
			
			h=new Hotel();
			h.setHotelid(hotelid);
			h.setHoteladdress(address);
			h.setHotelcity(hotlecity);
			h.setHotelcost(avg_rate_pernight);
			h.setHoteldesc(description);
			h.setHotelphone1(phone_no1);
			h.setHotelphone2(phone_no2);
			h.setHoterating(rating);
			h.setHotelemail(email);
			h.setHotelname(hotel_name);
			
			hotels.add(h);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnection();
		return hotels;
	}
	@Override
	public void deletehotelbyhid(int hotelid)
	{
		openconnection();
		try {
			PreparedStatement p3=condb.prepareStatement(SQLQuery.deletehotelbyhid);
			p3.setInt(1, hotelid);
			p3.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	

}
