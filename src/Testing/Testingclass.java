package Testing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.alphahotels.db.HotelRepositoryimp;
import com.alphahotels.db.Repositoryutil;
import com.alphahotels.db.SQLQuery;
import com.alphahotels.db.UserrepositoryImp;
import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.User;
import com.alphahotles.frontend.adminpage;
import com.alphahotles.frontend.customerpage;
import com.alphahotles.service.Adminservice;
import com.alphahotles.utility.Utilities;

public class Testingclass extends Repositoryutil 
{   
	public void HotelRepositoryimp()
	{
	HotelRepositoryimp h=new HotelRepositoryimp();
	 	List<Hotel>  h1=h.selectallhotels();
	   System.out.println("hotels : "+h1.size());
	   for(int i=0;i<h1.size();i++)
	   {
	   System.out.println(h1.get(i).getHotelcity());
	   System.out.println();
	   System.out.println(h1.get(i).getHoteladdress());
	   System.out.println(h1.get(i).getHotelname());
	   System.out.println(h1.get(i).getHotelphone1());
	   System.out.println(h1.get(i).getHoterating());
	   }
	   
	}
	public void HotelRepositoryimp1()
	{
	HotelRepositoryimp h=new HotelRepositoryimp();
	 	List<Hotel>  h1=h.selecthotelbynamecity("Little LLC","Gaizhou");
	   System.out.println("hotels : "+h1.size());
	  for(int i=0;i<h1.size();i++)
	   {
	   System.out.println(h1.get(i).getHotelcity());
	   System.out.println();
	   System.out.println(h1.get(i).getHoteladdress());
	   System.out.println(h1.get(i).getHotelname());
	   System.out.println(h1.get(i).getHotelphone1());
	   System.out.println(h1.get(i).getHoterating());
	   }
	   System.out.println();
	   
	}
	public void adminservice()
	{
		Adminservice a=new Adminservice();
		adminpage a1=new adminpage();
		//a.selecthotelbyname("546354");
		a1.Adminmenu();
	}

	public  void login(String email, String password) 
	{   UserrepositoryImp us=new UserrepositoryImp();
	us.selectUser(email, password)	;
	}
	public  void userverfi()
	{
		   Utilities uit=new Utilities();
		    boolean res;
		   res= uit.verifyName("santhu ");
		    System.out.println(res);
		    res=uit.verifyEmailFormat("@.com");
		    System.out.println(res);
		    res=uit.verifyPassword("hhkkkk@jjhk");
		    System.out.println(res);
		    res=uit.verifymobile("12");
		    System.out.println(res);
		
	}
	public void customerservice()
	{
		customerpage csi=new customerpage(); 
		csi.customermenu();
	}

	public static void main(String[] args) 
	{
		Testingclass t1=new Testingclass();
		
		//t1.HotelRepositoryimp();
		//t1.HotelRepositoryimp1();
		//t1.adminservice();
	      t1.customerservice();
		//t1.userverfi();
		
	}

}
