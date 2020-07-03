package com.white.learn.mapper.primary;

import com.white.learn.model.User;
import com.white.learn.sql.UserSql;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
	@Select("SELECT * FROM users")
	@Results({
			@Result(property = "pass", column = "password")
	})
	List<User> getAll();

	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
			@Result(property = "pass", column = "password")
	})
	User getOne(Long id);

	@Insert("INSERT INTO users(name,age,password) VALUES(#{name}, #{age}, #{pass})")
	void insert(User user);

	@Update("UPDATE users SET name=#{name},age=#{age} WHERE id =#{id}")
	void update(User user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

	@SelectProvider(type = UserSql.class, method = "getCount")
	Long getCount(User user);
}
