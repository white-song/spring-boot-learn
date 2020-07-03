package com.white.learn.repository.impl;

import com.white.learn.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet res, int i) throws SQLException {
		User user= new User();
		user.setId(res.getLong("id"));
		user.setName(res.getString("name"));
		user.setPass(res.getString("password"));
		user.setAge(res.getInt("age"));
		return user;
	}
}
