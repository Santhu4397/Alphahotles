package com.alphahotels.db;

import com.alphahotles.entity.User;

public interface Userrepository extends Repository 
{
	public void insertUser(User us);
	public User selectUser(String email, String password);

}
