package com.white.learn.repository.impl;

import com.white.learn.model.User;
import com.white.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private JdbcTemplate primaryJdbcTemplate;

	@Override
	public int save(User user) {
		return primaryJdbcTemplate.update("INSERT into users(name, password, age) values (?, ?, ?)", user.getName(), user.getPass(), user.getAge());
	}

	@Override
	public int update(User user) {
		return primaryJdbcTemplate.update("update users set name=?, password=?, age=? where id=?", user.getName(), user.getPass(), user.getAge(), user.getId());
	}

	@Override
	public int delete(long id) {
		return 0;
	}


	@Override
	public User findById(long id) {
		return primaryJdbcTemplate.queryForObject("select * from users where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public List<User> findALL() {
		return primaryJdbcTemplate.query("select * from users", new UserRowMapper());
	}

}
