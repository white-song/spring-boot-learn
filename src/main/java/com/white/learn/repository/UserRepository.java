package com.white.learn.repository;

import com.white.learn.model.User;

import java.util.List;

public interface UserRepository {
	int save(User user);
	int update(User user);
	int delete(long id);
	List<User> findALL();
	User findById(long id);
}
