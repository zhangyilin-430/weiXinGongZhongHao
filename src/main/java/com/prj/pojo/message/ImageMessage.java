package com.prj.pojo.message;

/**
 * @类名称: ImageMessage
 * @类描述: 图片消息
 * @author
 * @创建时间:2017年12月8日下午6:44:10
 * 
 * 							<xml>
 * 
 *                           <ToUserName><![CDATA[toUser]]></ToUserName>
 * 
 *                           <FromUserName><![CDATA[fromUser]]></FromUserName>
 * 
 *                           <CreateTime>12345678</CreateTime>
 * 
 *                           <MsgType><![CDATA[image]]></MsgType>
 * 
 *                           <Image>
 * 
 *                           <MediaId><![CDATA[media_id]]></MediaId>
 * 
 *                           </Image>
 * 
 *                           </xml>
 */
public class ImageMessage extends BaseMessage {

	/**
	 * Image节点
	 */
	private Image Image;

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}

}
