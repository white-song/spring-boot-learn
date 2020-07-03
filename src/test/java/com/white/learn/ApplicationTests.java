package com.white.learn;

import com.white.learn.mapper.primary.UserMapper;
import com.white.learn.model.User;
import com.white.learn.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Test
	void userCRUD() {
		User user = new User("sam", 20, "12345");
//		userRepository.save(user);

		userRepository.findALL().forEach(System.out::println);
	}

	@Test
	void mybatis() {
//		userMapper.insert(new User("aa", 20, "123"));
//		userMapper.insert(new User("bb", 21, "234"));
//		userMapper.insert(new User("cc", 22, "567"));
//		userMapper.getAll().forEach(System.out::println);
		System.out.println(userMapper.getCount(new User("sam", 20, "123")));
	}

}
