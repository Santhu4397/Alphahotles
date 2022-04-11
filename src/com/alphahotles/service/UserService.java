package com.alphahotles.service;

import com.alphahotles.entity.User;

public interface UserService 
{
	public void signup(User usr);
	public void login(String email, String password);

}
