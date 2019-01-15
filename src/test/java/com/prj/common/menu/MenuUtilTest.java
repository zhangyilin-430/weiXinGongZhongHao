package com.prj.common.menu;

import org.junit.Test;

import com.prj.common.WeiXinUtil;
import com.prj.common.message.NewsMessageUtil;

public class MenuUtilTest {

	@Test
	public void test() {
		String accessToken = WeiXinUtil.getAccess_Token();
		String menu = MenuUtil.initMenu();
		System.out.println(menu);
		int result = MenuUtil.createMenu(accessToken, menu);
		if (result == 0) {
			System.out.println("菜单创建成功");
		} else {
			System.out.println("错误码" + result);
		}
	}

	@Test
	public void test1() {
		NewsMessageUtil newsMessageUtil = new NewsMessageUtil();
		String message = newsMessageUtil.initMessage("aa", "bb");
		System.out.println(message);
	}
}
