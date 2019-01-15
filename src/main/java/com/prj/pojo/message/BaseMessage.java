package com.prj.pojo.message;

/**
 * @类名称: BaseMessage
 * @类描述: 回复消息的基类
 * @author
 * @创建时间:2017年12月8日上午11:38:11
 */
public class BaseMessage {

	/**
	 * 接收方帐号（收到的OpenID）
	 */
	protected String ToUserName;
	/**
	 * 开发者微信号
	 */
	protected String FromUserName;
	/**
	 * 消息创建时间 （整型）
	 */
	protected long CreateTime;
	/**
	 * text
	 */
	protected String MsgType;

	public BaseMessage() {
		super();
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

}
