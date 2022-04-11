package com.alphahotels.db;

import com.alphahotles.entity.Booking;

public interface BookingRepository extends Repository
{
	public void selectallbooking();
	public void selectbookingbybid();
	public void insetbooking(Booking b);
	

}
