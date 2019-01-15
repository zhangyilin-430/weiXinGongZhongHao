package com.prj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prj.common.CheckUtil;

/**
 * @类名称: LoginController
 * @类描述: 与微信对接登陆验证
 * @author
 * @创建时间:2017年12月5日上午10:52:13
 */
@Controller
public class LoginController {
	@RequestMapping(value = "wx", method = RequestMethod.GET)
	public void login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("success");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
				out.write(echostr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}
