package com.prj.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTests {

	@Autowired
	private WebApplicationContext context;
	private MockMvc mvc;
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;

	@Before // 在测试开始前初始化工作
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testQ1() throws Exception {
		// url
		String url = "/wx";
		MvcResult result = mvc
				.perform(get(url)
						.param("timestamp", new Timestamp(System.currentTimeMillis()).toString())
						.param("nonce", "2")
						.param("signature", "2"))
				.andExpect(status().isOk())// 模拟向testRest发送get请求
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))// 预期返回值的媒体类型text/plain;charset=UTF-8
				.andReturn();// 返回执行请求的结果
		System.out.println(result.getResponse().getContentAsString());
	}

	@Test
	public void test2() throws Exception {
		MvcResult result = mvc.perform(post("/hello1").content(JSONObject.toJSONString(null)))
				.andExpect(status().isOk()).andReturn();// 模拟向testRest发送get请求//
		// 预期返回值的媒体类型text/plain;charset=UTF-8

		System.out.println(result.getResponse().getContentAsString());

	}

}
