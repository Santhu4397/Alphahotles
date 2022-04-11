package com.alphahotels.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alphahotles.entity.User;

public class UserrepositoryImp  extends Repositoryutil  implements Userrepository 
{

	int count=0;
	@Override
	public void insertUser(User us) 
	{
		openconnection();
		try {
			PreparedStatement prs=condb.prepareStatement(SQLQuery.InsertUser);
			prs.setInt(1,0);
			prs.setString(2, us.getName());
			prs.setString(3, us.getEmail());
			prs.setString(4, us.getPassword());
			prs.setString(5, us.getMob());
			prs.setString(6, us.getAddress());
			prs.setString(7, us.getRole());
			count=prs.executeUpdate();
		} 
		catch (SQLException e) 
		{
			
				System.out.println("ERROR!!! User with "+us.getEmail()+" ALREADY REGISTERED");
				
			
			
			
		}
		System.out.println(count+"insertUser-repository");
			closeconnection();
		
	}

	

	@Override
	public User selectUser(String email, String password) 
	{
		
		openconnection();
		try {
			PreparedStatement prs=condb.prepareStatement(SQLQuery.SelectUserbyuid);
			prs.setString(1, email);
			prs.setString(2, password);
			ResultSet r=prs.executeQuery();
			r.next();
			String usrName   = r.getString("name");
			String usrEmail  = r.getString("email");
			String usrMob    = r.getString("mobile");
			String usrAddrss = r.getString("address");
			String usrRole   = r.getString("role");
			User us=new User();
			us.setName(usrName);
			us.setMob(usrMob);
			us.setAddress(usrAddrss);
			us.setRole(usrRole);
		    us.setEmail(usrEmail);
		    System.out.println("LOGIN SUCCSES");
		    return us;
		} 
		catch (SQLException e) 
		{
			System.out.println("invalid emailid or password");
			
		}
		System.out.println("selectUser-repository");
		closeconnection();
		return null;
	}

}
