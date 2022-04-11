package com.alphahotels.db;

import java.util.List;

import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.Room;

public interface RoomRepository extends Repository
{
      public void insertroom(Room r);
      public List<Room> selectroom(String name);
      public void updateroom();
}
