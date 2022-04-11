package com.alphahotels.db;

import java.util.List;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.User;

public interface HotelRepository extends Repository
{
	public void inserthotels(Hotel h);
    public List selectallhotels();
    public List selecthotelsbycity(String hotelcity);
    public List selecthotelbyname(String hotelName);
    public List selecthotelbynamecity(String hotelname,String hotelcity);
    public void deletehotelbyhid(int hotelid);
    
}
