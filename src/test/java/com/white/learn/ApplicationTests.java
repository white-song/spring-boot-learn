package com.white.learn;

import com.white.learn.mapper.primary.UserMapper;
import com.white.learn.model.User;
import com.white.learn.model.UserInfo;
import com.white.learn.param.UserInfoParam;
import com.white.learn.repository.UserInfoRepository;
import com.white.learn.repository.UserRepository;
import com.white.learn.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private UserInfoRepository userInfoRepository;

//	@Autowired
//	private UserMapper userMapper;

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
//		System.out.println(userMapper.getCount(new User("sam", 20, "123")));
	}

	@Test
	void testJpa() {
//		userInfoRepository.save(new UserInfo("black", "222@qq.com"));
//		userInfoRepository.save(new UserInfo("white", "333@qq.com"));

//		System.out.println(userInfoRepository.findByName("sam"));

		int page=0,size=10;
		ArrayList<Object> objects = new ArrayList<>();

		Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());
		UserInfoParam param=new UserInfoParam();
		param.setEmail("qq.com");
		Page<UserInfo> pages=userInfoService.findByCondition(param,pageable);
		for (UserInfo userInfo:pages){
			System.out.println("userInfo: "+userInfo.toString());
		}
	}

}
