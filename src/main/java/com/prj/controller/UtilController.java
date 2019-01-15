package com.prj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prj.common.message.ImageMessageUtil;
import com.prj.common.message.MessageUtil;
import com.prj.common.message.NewsMessageUtil;
import com.prj.common.message.TextMessageUtil;
import com.prj.pojo.message.NewsMessage;

/**
 * @类名称: UtilController
 * @类描述: 与微信信息对接
 * @author
 * @创建时间:2017年12月5日上午10:52:13
 */
@RestController
public class UtilController {
	@RequestMapping(value = "wx", method = RequestMethod.POST)
	public void dopost(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = null;
		// 将微信请求xml转为map格式，获取所需的参数
		Map<String, String> map = MessageUtil.xmlToMap(request);
		String ToUserName = map.get("ToUserName");
		String FromUserName = map.get("FromUserName");
		String MsgType = map.get("MsgType");
		String Content = map.get("Content");

		String message = null;
		// 处理文本类型，实现输入1，回复相应的封装的内容
		if ("text".equals(MsgType)) {
			if ("1".equals(Content)) {
				// ImageMessageUtil imageMessage = new ImageMessageUtil();
				// message = imageMessage.initMessage(FromUserName, ToUserName);
				NewsMessageUtil newsMessage = new NewsMessageUtil();
				message = newsMessage.initMessage(FromUserName, ToUserName);
			} else {
				TextMessageUtil textMessage = new TextMessageUtil();
				message = textMessage.initMessage(FromUserName, ToUserName, Content);
			}
		}
		try {
			out = response.getWriter();
			out.write(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}

}
