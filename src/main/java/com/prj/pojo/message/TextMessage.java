package com.prj.pojo.message;

/**
 * @类名称: MessageTest
 * @类描述: 消息内容实体
 * @author
 * @创建时间:2017年12月5日上午10:41:40
 * 
 * 							<xml>
 * 
 *                            <ToUserName><![CDATA[toUser]]></ToUserName>
 * 
 *                            <FromUserName><![CDATA[fromUser]]></FromUserName>
 * 
 *                            <CreateTime>12345678</CreateTime>
 * 
 *                            <MsgType><![CDATA[text]]></MsgType>
 * 
 *                            <Content><![CDATA[你好]]></Content>
 * 
 *                            </xml>
 */
public class TextMessage extends BaseMessage {

	/**
	 * 文本消息内容
	 */
	private String Content;

	/**
	 * 消息id，64位整型
	 */
	private String MsgId;

	public TextMessage() {

	}

	public TextMessage(String toUserName, String fromUserName, long createTime, String msgType, String content,
			String msgId) {
		super();
		ToUserName = toUserName;
		FromUserName = fromUserName;
		CreateTime = createTime;
		MsgType = msgType;
		Content = content;
		MsgId = msgId;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
}
