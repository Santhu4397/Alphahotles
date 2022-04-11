package com.alphahotels.db;

public class SQLQuery 
{
    static String InsertUser="insert into alphahotels.users value(?,?,?,?,?,?,?)";
    static String UpdateUserbyuid="update alphahotels.users set name=?,email=?,mobile=?,password=?,address=? where uid=?";
    static String deleteUserbyuid="delete from alphahotels.users where uid=?";
    public static String SelectUserbyuid="select *from alphahotels.users where email=? And  password=?";
    static String SelectAllUsers="select *from alphahotels.users ";
    
    static String Insertbookingdetails="insert into alphahotels.bookingdetails value(?,?,?,?,?,?,?,?)";
    static String Updatebookingdetailsbybid="update alphahotels.bookingdetails set room_id=?,user_id=?,booked_from=?,booked_to=?,no_of_adults=?, no_of_children=?,amount=? where bid=?";
    static String deletebookingdetailsbybid="delete from alphahotels.bookingdetails where bid=?";
    static String Selectbookingdetailsbybid="select *from alphahotels.bookingdetails where bid=?";
    static String Selectallbookingdetails="select *from alphahotels.bookingdetails ";
    
    static String Inserthotel="insert into alphahotels.hotels value(?,?,?,?,?,?,?,?,?,?)";
    static String Updatehotelbyhid="update alphahotels.hotels set city=?,hotel_name=?,address=?,description=?,avg_rate_pernight=?, phone_no1=?,phone_no2=?,rating=?,email=? where hid=?";
    static String deletehotelbyhid="delete from alphahotels.hotels where hotel_id=?";
    static String Selecthotelbycity="select *from alphahotels.hotels where city=?";
    static String Selecthotelbyhotelname="select *from alphahotels.hotels where hotel_name=?";
    static String Selecthotelbynameandcity="select *from alphahotels.hotels where hotel_name=? and city=? ";
    public static String Selectallhotel="select *from alphahotels.hotels";
    
    static String Insertroomdetails="insert into alphahotels.roomdetails value(?,?,?,?,?,?,?)";
    static String Updateroomdetailsbyrid="update alphahotels.roomdetails set city=?,room_id=?,room_no=?,room_type=?,room_type=?, availability=? where hotel_id=?";
    static String deleteroomdetailsbyrid="delete from alphahotels.roomdetails where rid=?";
    static String Selectroomdetailsbyhid="select *from alphahotels.roomdetails where hotel_id=?";
    static String Selectallroomdetails="select *from alphahotels.roomdetails ";
    
}
