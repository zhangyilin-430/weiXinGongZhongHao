package com.prj.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeiXinUtilTest {

	@Test
	public void test() {
		String access_token = WeiXinUtil.getAccess_Token();
		System.out.println("调用成功access_token:"+access_token);
	}
	
}
