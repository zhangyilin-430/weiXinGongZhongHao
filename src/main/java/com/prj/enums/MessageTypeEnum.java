package com.prj.enums;

/**
 * @类名称: MessageTypeEnum
 * @类描述: 回复消息类型 枚举类
 * @author
 * @创建时间:2017年12月8日上午11:38:11
 */
public enum MessageTypeEnum {
	TEXT("text"), IMAGE("image"), VOICE("voice"), NEWS("news");
	private String type;

	MessageTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
