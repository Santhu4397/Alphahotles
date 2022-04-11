package com.alphahotels.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.Room;

public class RoomRepositoryimp extends Repositoryutil implements RoomRepository 
{
	Hotel h=new Hotel();
	List <Room> Room=new ArrayList<Room>();
   
	@Override
	public void insertroom(Room r) {
		openconnection();
		System.out.println("insertroom");
		try {
			PreparedStatement prs=condb.prepareStatement(SQLQuery.Insertroomdetails);
			prs.setString(1, r.getHotelid() );
			prs.setString(2, r.getRoomid());
			prs.setString(3, r.getRoomno());
			prs.setString(4, r.getRoomtype());
			prs.setString(5, r.getRommcost());
			prs.setString(6,r.getRoomavilable());
			prs.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		closeconnection();
	}

	@Override
	public List<Room> selectroom(String name) 
	{
		
		System.out.println("selectroom");
		openconnection();
		
		try {
			PreparedStatement prs=condb.prepareStatement(SQLQuery.Selectroomdetailsbyhid);
			prs.setString(1, name);
			ResultSet res=prs.executeQuery();
			while(res.next())
			{
				String hotelid=res.getString("hotel_id");
				String roomid=res.getString("room_id");
				String roomnumb=res.getString("room_no");
				String roomtype=res.getString("room_type");
				String roomcost=res.getString("per_night_rate");
				String roomavl=res.getString("availability");
			
			Room r=new Room();
			r.setRoomno(roomnumb);
			r.setRoomtype(roomtype);
			r.setRommcost(roomcost);
			r.setRoomavilable(roomavl);
			r.setHotelid(hotelid);
			r.setRoomid(roomid);
			
			Room.add(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnection();
		return Room;		
	}

	@Override
	public void updateroom() {
		// TODO Auto-generated method stub
		System.out.println("updateroom");
	}

	
}
