package com.alphahotles.utility;

public class Utilities {

	
	public boolean verifyName(String name)
	{
		if(name.length() >=2 && name.length()<=45)
		{
			int ub = name.length() - 1;
			
			for(int index = 0; index<=ub; index++)
			{
			   char c1 = name.charAt(index);
			   int  i1 = c1; 
			
			   if( (i1 >=0 && i1 <=64)    || 
			       (i1 >= 91 && i1 <= 96) || 
			       (i1 >= 123) )
			   {
			       return false;//inavlid name
			   }
			}
			
		}
		return true;//valid name
	}
	
	public boolean verifyEmailFormat(String email)
	{
		if(email.contains("@") && email.contains(".com"))
		{
			return true;//valid email format
		}
		else
		{
		  return false;//invalid email id
		}
	}
	
	public boolean verifyPassword(String password)
	{
		int count = 0;
		if(password.length() >= 8 && password.length()<=45)
		{
			int ub = password.length()-1;
			
			for (int index = 0; index <= ub; index++)
			{
				int unicode = password.charAt(index);
				
				if(unicode >= 32 && unicode <= 47 ||
				   unicode >= 58 && unicode <= 64 ||
				   unicode >= 123)
				{
					 return true;
				}
			}
			
		}
		return false;
		
		
	}
	public boolean verifyrole(String role)
	{
		switch (role) 
		{
		case "CUSTOMER": return true;
		case "ADMIN":return true;
		case "HOTEL-ADMIN":return true;
		default: return false;
		}
		
	}
	public boolean verifyaddress(String address)
	{
		if(address.length()>0&&address.length()<125) 
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public boolean verifymobile(String mobile)
	{
		if(mobile.length()>0&&mobile.length()<=10)
		{
			int ub=mobile.length()-1;
			for (int i = 0; i <= ub; i++) 
			{
				int num=mobile.charAt(i);
				if(num>=48&&num<57)
				{
					return true;
				}
			}
		}
		return false;
	}

}
