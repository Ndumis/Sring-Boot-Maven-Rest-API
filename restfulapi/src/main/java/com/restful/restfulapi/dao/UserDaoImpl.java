package com.restful.restfulapi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import com.restful.restfulapi.mapper.UserRowMapper;
import com.restful.restfulapi.model.User;

@Repository
public class UserDaoImpl implements UserDao {	
	
	@Autowired
	JdbcTemplate template;
	
	
	public List<User> listAllUsers() {
		List<User> list = new ArrayList<User>();
		
		list = template.query("SELECT * FROM tblUser", new UserRowMapper());
		
		return list;
	}

		
	public void addUser(User user) {
		template.update("INSERT INTO tblUser(firstName, lastName, contactNumber) VALUES(?, ?, ?)", user.getFirstname(), user.getLastname(), user.getContactnumber());
		
	}

	public void updateUser(User user) {
		template.update("UPDATE tblUser SET firstName=?, lastName=?, contactNumber=? WHERE Id =?", user.getFirstname(), user.getLastname(), user.getContactnumber(), user.getId());
		
	}

	public void deleteUser(User user) {
		String sql = "DELETE FROM tblUser WHERE Id=?";
        Object[] args = new Object[] {user.getId()};
		// Delete
        template.update(sql, args);
		
	}

	public List<User> findUserById(Integer id) {

		List<User> user = new ArrayList<User>();
		
		user = template.query("SELECT * FROM tblUser", new UserRowMapper());	
		
		return user;
	}

}



