package com.white.learn.web;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
public class WebTests {

	static MockMvc mockMvc;

	@BeforeAll
	static void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
	}

	@Test
	void testHello() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=小米").accept(MediaType.APPLICATION_JSON_UTF8))
//				.andDo(MockMvcResultHandlers.print());
	}

	@Test
	void testTmp() throws Exception {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add("text", "text1");
		params.add("text", "text2");
		params.add("summary", "summary1");

		System.out.println(params);
	}

}
