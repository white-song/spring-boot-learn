package com.white.learn;

import com.white.learn.comm.NeoProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class PropertiesTest {

	@Value("${neo.title}")
	private String title;

	@Resource
	private NeoProperties properties;

	@Test
	public void testMore() {
		System.out.println("title:" + properties.getTitle());
		System.out.println("description:" + properties.getDesc());
	}

}
