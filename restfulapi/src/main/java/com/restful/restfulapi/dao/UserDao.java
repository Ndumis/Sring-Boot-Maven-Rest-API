package com.restful.restfulapi.dao;

import java.util.List;

import com.restful.restfulapi.model.User;

public interface UserDao {
	public List<User> listAllUsers();	
	
	public void addUser(User user);
		
	public void updateUser(User user);
	
	public void deleteUser(User user);
	
	public List<User> findUserById(Integer id);
}
