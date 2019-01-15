package com.prj.pojo.menu;

/**
 * @类名称: Button 
 * @类描述: 按钮    
 * @author  
 * @创建时间:2017年12月8日下午8:35:38
 */
public class Button {

	/**
	 * 菜单标题
	 */
	private String name; 

	/**
	 * 菜单的响应动作类型
	 */
	private String type;

	/**
	 * 二级菜单数组，个数应为1~5个
	 */
	private Button[] sub_button;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}

}
