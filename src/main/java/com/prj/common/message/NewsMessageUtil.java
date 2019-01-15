package com.prj.common.message;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.prj.common.UploadUtil;
import com.prj.common.WeiXinUtil;
import com.prj.enums.MessageTypeEnum;
import com.prj.pojo.message.News;
import com.prj.pojo.message.NewsMessage;
import com.thoughtworks.xstream.XStream;

/**
 * @类名称: NewsMessageUtil
 * @类描述: 图文消息封装工具类
 * @author
 * @创建时间:2017年12月8日下午6:57:18
 */
public class NewsMessageUtil implements BaseMessageUtil<NewsMessage> {
	/**
	 * 将信息转为xml格式
	 */
	public String messageToxml(NewsMessage newsMessage) {
		XStream xtream = new XStream();
		xtream.alias("xml", newsMessage.getClass());
		xtream.alias("item", new News().getClass());
		return xtream.toXML(newsMessage);
	}

	/**
	 * 封装信息
	 */
	public String initMessage(String FromUserName, String ToUserName) {
		List<News> newList = new ArrayList<News>();

		News news1 = new News();
		news1.setTitle("JAVA程序员介绍");
		news1.setDescription(
				"JAVA程序员广义上是指一群以12356667vfJAVA为谋生手段的软件开发人员。狭义的说，是指拥有SUN公司JAVA认证的程序员。Sun Java认证分为两个级别：Sun 认证Java程序员和Sun 认证Java开发员。通常要求程序员精通java基础，java高级编程，及常用java设计模式，并深入理解mvc编程模式，了解uml相关知识!");
		news1.setPicUrl("http://d.hiphotos.bdimg.com/wisegame/pic/item/f3529822720e0cf3ac9f1ada0846f21fbe09aaa3.jpg");// 这里测试采用地址，换成自己项目下面的图片路径
		news1.setUrl("www.baidu.com");
		newList.add(news1);
		
		News news2 = new News();
		news2.setTitle("JAVA程序员12341介绍");
		news2.setDescription(
				"JAVA程序员广义上是指一群1234以JAVA为谋生手段的软件开发人员。狭义的说，是指拥有SUN公司JAVA认证的程序员。Sun Java认证分为两个级别：Sun 认证Java程序员和Sun 认证Java开发员。通常要求程序员精通java基础，java高级编程，及常用java设计模式，并深入理解mvc编程模式，了解uml相关知识!");
		news2.setPicUrl("");// 这里测试采用地址，换成自己项目下面的图片路径
		news2.setUrl("");
		newList.add(news2);
		
		News news3 = new News();
		news3.setTitle("JAVA程序员123介绍");
		news3.setDescription(
				"JAVA程序员广义上是指一群以JAVA为谋生手段的软件开发人员。狭义的说，是指拥有SUN公司JAVA认证的程序员。Sun Java认证分为两个级别：Sun 认证Java程序员和Sun 认证Java开发员。通常要求程序员精通java基础，java高级编程，及常用java设计模式，并深入理解mvc编程模式，了解uml相关知识!");
		news3.setPicUrl("");// 这里测试采用地址，换成自己项目下面的图片路径
		news3.setUrl("www.baidu.com");
		newList.add(news3);

		NewsMessage message = new NewsMessage();
		message.setFromUserName(ToUserName);
		message.setToUserName(FromUserName);
		message.setCreateTime(new Date().getTime());
		message.setMsgType(MessageTypeEnum.NEWS.getType());
		message.setArticleCount(newList.size());
		message.setArticles(newList);
		return messageToxml(message);
	}
}
