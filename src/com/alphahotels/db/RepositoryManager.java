package com.alphahotels.db;

public class RepositoryManager 
{

	public Repository getRepository(String nameofRepositry) 
	{
		System.out.println("get repositry: "+nameofRepositry);
		switch (nameofRepositry) 
		{
		case "userrepo": return new UserrepositoryImp();
		case "hotelrepo":return new HotelRepositoryimp();
		case "roomrepo":return new RoomRepositoryimp();
		case "bookingrepo":return new BookingRepositoryimp();
		
		default:return null;

		}
		
	}
}
