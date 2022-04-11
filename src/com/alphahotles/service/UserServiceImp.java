package com.alphahotles.service;

import com.alphahotels.db.HotelRepository;
import com.alphahotels.db.RepositoryManager;
import com.alphahotels.db.Userrepository;
import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.User;
import com.alphahotles.frontend.adminpage;
import com.alphahotles.frontend.customerpage;

public class UserServiceImp implements UserService
{
	Userrepository URP;
	HotelRepository HRP;
     RepositoryManager rmgn=new RepositoryManager();
	@Override
	public void signup(User usr) 
	{
		System.out.println("UserServiceImp-signp done");
		
		URP= (Userrepository) rmgn.getRepository("userrepo");
	
		URP.insertUser(usr);
		User us;
	}

	@Override
	public void login(String email, String password) 
	{
		User us=new User();
		URP= (Userrepository) rmgn.getRepository("userrepo");
		us=URP.selectUser(email, password);
		System.out.println(us.getName()+"  WELCOM TO ALPHA HOTELS");
		String role=us.getRole();
		if(role.equals("ADMIN")||role.equals("HOTEL-ADMIN"))
		{
		adminpage.Adminmenu();
		}
		else
		{
		customerpage.customermenu();	
		}
	}
	

}
