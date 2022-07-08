package com.restful.restfulapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.restful.restfulapi.model.User;

public class UserRowMapper implements RowMapper<User>{
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException{
		return new User(rs.getInt("Id"), 
				rs.getString("firstName"), 
				rs.getString("lastName"), 
				rs.getString("contactNumber"));
	}
}
