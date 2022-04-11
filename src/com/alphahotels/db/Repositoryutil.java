package com.alphahotels.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repositoryutil 
{
	 Connection condb=null;
	public void openconnection()
	{
		try 
		{
			if(condb == null)
			{
			condb=DriverManager.getConnection("jdbc:mysql://localhost:3306/alphahotels","root", "123456");
			}		
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	public void closeconnection()
	{
		try 
		{
			condb.close();
		}
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
}	
