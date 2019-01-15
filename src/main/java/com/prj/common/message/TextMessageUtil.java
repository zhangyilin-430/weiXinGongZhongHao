package com.prj.common.message;

import java.util.Date;

import com.prj.enums.MessageTypeEnum;
import com.prj.pojo.message.TextMessage;
import com.thoughtworks.xstream.XStream;

/**
 * @类名称: TextMessageUtil
 * @类描述: 文本消息封装工具类
 * @author
 * @创建时间:2017年12月8日下午6:57:18
 */
public class TextMessageUtil implements BaseMessageUtil<TextMessage> {

	/**
	 * 将发送消息封装成对应的xml格式
	 */
	public String messageToxml(TextMessage message) {
		XStream xstream = new XStream();
		xstream.alias("xml", message.getClass());
		return xstream.toXML(message);
	}

	/**
	 * 封装发送消息对象,封装时，需要将调换发送者和接收者的关系
	 * 
	 * @param FromUserName
	 * @param ToUserName
	 */
	public String initMessage(String FromUserName, String ToUserName) {
		TextMessage text = new TextMessage();
		text.setToUserName(FromUserName);
		text.setFromUserName(ToUserName);
		text.setContent("欢迎关注机械振动工程党支部");
		text.setCreateTime(new Date().getTime());
		text.setMsgType(MessageTypeEnum.TEXT.getType());
		return messageToxml(text);
	}

	// 添加封装发送消息的方法，重载，将内容传入
	public String initMessage(String FromUserName, String ToUserName, String Content) {
		TextMessage text = new TextMessage();
		text.setToUserName(FromUserName);
		text.setFromUserName(ToUserName);
		text.setContent("您输入的内容是：" + Content);
		text.setCreateTime(new Date().getTime());
		text.setMsgType(MessageTypeEnum.TEXT.getType());
		return messageToxml(text);
	}

}
