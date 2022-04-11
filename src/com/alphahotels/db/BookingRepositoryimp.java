package com.alphahotels.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.alphahotles.entity.Booking;
import com.alphahotles.entity.Hotel;

public class BookingRepositoryimp extends Repositoryutil implements BookingRepository
{
	static HotelRepository HRP;
	static Userrepository URP;
	static RoomRepository RRP;

	@Override
	public void selectallbooking() {
		
		
	}

	@Override
	public void selectbookingbybid() {
		
		
	}

	@Override
	public void insetbooking(Booking b) 
	{
		Hotel h=new Hotel();
	
		
	openconnection();
	
	
	/*try {
		PreparedStatement prs=condb.prepareStatement(SQLQuery.Insertbookingdetails);
		prs.setInt(1,0);
		prs.setString(2, null);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
		
	}

}
