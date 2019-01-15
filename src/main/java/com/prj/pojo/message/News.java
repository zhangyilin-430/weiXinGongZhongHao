package com.prj.pojo.message;

/**
 * @类名称: Item
 * @类描述: 图文
 * @author
 * @创建时间:2017年12月8日下午6:42:39
 */
public class News {
	/**
	 * 图文消息标题
	 */
	private String Title;
	/**
	 * 图文消息描述
	 */
	private String Description;
	/**
	 * 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 */
	private String PicUrl;
	/**
	 * 点击图文消息跳转链接
	 */
	private String Url;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
