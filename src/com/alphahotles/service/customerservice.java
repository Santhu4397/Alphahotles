package com.alphahotles.service;

import java.util.ArrayList;
import java.util.List;

import com.alphahotels.db.BookingRepository;
import com.alphahotels.db.HotelRepository;
import com.alphahotels.db.RepositoryManager;
import com.alphahotels.db.RoomRepository;
import com.alphahotels.db.Userrepository;
import com.alphahotles.entity.Booking;
import com.alphahotles.entity.Hotel;
import com.alphahotles.entity.Room;
import com.alphahotles.entity.User;

public class customerservice {
	static HotelRepository HRP;
	static RepositoryManager rm = new RepositoryManager();
	static RoomRepository RRP;
	static BookingRepository BRP;
	static Userrepository URP;

	public static void viewprofile() {
		System.out.println("viewprofile()");
		User us = new User();
		us = URP.selectUser(null, null);
		System.out.println();

	}

	public static void searchhotelroombyname(String name) {
		HRP = (HotelRepository) rm.getRepository("hotelrepo");
		RRP = (RoomRepository) rm.getRepository("roomrepo");
		List<Hotel> h = HRP.selecthotelbyname(name);
		System.out.println("****this is selecthotelservic*****");
		for (int i = 0; i < h.size(); i++) {
			System.out.println("cityname: " + h.get(i).getHotelcity());
			System.out.println("hotelname: " + h.get(i).getHotelname());
			System.out.println("hoteladdress: " + h.get(i).getHoteladdress());
			System.out.println("hoteldesc: " + h.get(i).getHoteldesc());
			System.out.println("hotelphone: " + h.get(i).getHotelphone1());
			System.out.println("rating: " + h.get(i).getHoterating());
			System.out.println(" ");
			List<Room> r = RRP.selectroom(h.get(i).getHotelid());
			System.out.println(r.size());
			for (int j = 0; j < r.size(); j++) {
				System.out.println("room_no: " + r.get(j).getRoomno());
				System.out.println("room type: " + r.get(j).getRoomtype());
				System.out.println("room cost: " + r.get(j).getRommcost());
				System.out.println("room avliavblity: " + r.get(j).getRoomavilable());
				System.out.println(" ");
			}
		}

	}

	public static void searchhotelroombynamecity(String name, String city) {
		System.out.println("searchhotelroombynamecity()");
		RRP = (RoomRepository) rm.getRepository("roomrepo");
		HRP = (HotelRepository) rm.getRepository("hotelrepo");
		List<Hotel> h1 = HRP.selecthotelbynamecity(name, city);
		for (int i = 0; i < h1.size(); i++) {
			System.out.println("cityname: " + h1.get(i).getHotelcity());
			System.out.println("hotelname: " + h1.get(i).getHotelname());
			System.out.println("hoteladdress: " + h1.get(i).getHoteladdress());
			System.out.println("hoteldesc: " + h1.get(i).getHoteldesc());
			System.out.println("hotelphone: " + h1.get(i).getHotelphone1());
			System.out.println("rating: " + h1.get(i).getHoterating());
			System.out.println(" ");
			List<Room> r = RRP.selectroom(h1.get(i).getHotelid());
			System.out.println(r.size());
			for (int j = 0; j < r.size(); j++) {
				System.out.println("room_no: " + r.get(j).getRoomno());
				System.out.println("room type: " + r.get(j).getRoomtype());
				System.out.println("room cost: " + r.get(j).getRommcost());
				System.out.println("room avliavblity: " + r.get(j).getRoomavilable());
				System.out.println(" ");
			}
		}
	}

	public static void searchhotelroombycity(String city) {

		System.out.println("searchhotelroombycity()");
		HRP = (HotelRepository) rm.getRepository("hotelrepo");
		RRP = (RoomRepository) rm.getRepository("roomrepo");
		List<Hotel> h1 = HRP.selecthotelsbycity(city);
		for (int i = 0; i < h1.size(); i++) {
			System.out.println("cityname: " + h1.get(i).getHotelcity());
			System.out.println("hotelname: " + h1.get(i).getHotelname());
			System.out.println("hoteladdress: " + h1.get(i).getHoteladdress());
			System.out.println("hoteldesc: " + h1.get(i).getHoteldesc());
			System.out.println("hotelphone: " + h1.get(i).getHotelphone1());
			System.out.println("rating: " + h1.get(i).getHoterating());
			System.out.println(" ");
			List<Room> r = RRP.selectroom(h1.get(i).getHotelid());
			System.out.println(r.size());
			for (int j = 0; j < r.size(); j++) {
				System.out.println("room_no: " + r.get(j).getRoomno());
				System.out.println("room type: " + r.get(j).getRoomtype());
				System.out.println("room cost: " + r.get(j).getRommcost());
				System.out.println("room avliavblity: " + r.get(j).getRoomavilable());
				System.out.println(" ");
			}
		}

	}

	/*
	 * public static void selectroom() {
	 * System.out.println("customr serviceselectroom"); RRP=(RoomRepository)
	 * rm.getRepository("roomrepo"); RRP.selectroom(); RRP.updateroom(); }
	 */
	public static void bookhotel(Booking b) {
		System.out.println("this is bookhotel()");
		BRP = (BookingRepository) rm.getRepository("bookingrepo");
		BRP.insetbooking(b);
	}

}
