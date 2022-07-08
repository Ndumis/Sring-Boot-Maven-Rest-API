package com.restful.restfulapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.restfulapi.dao.UserDao;
import com.restful.restfulapi.model.User;


@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	UserDao userDao;
	
	public void setUserdao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	public List<User> listAllUsers() {
		return userDao.listAllUsers();
	}

	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}

	public List<User> findUserById(Integer id) {
		return userDao.findUserById(id);
	}

}
