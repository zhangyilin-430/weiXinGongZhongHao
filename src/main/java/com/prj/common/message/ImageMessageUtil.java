package com.prj.common.message;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import com.prj.common.UploadUtil;
import com.prj.common.WeiXinUtil;
import com.prj.enums.MessageTypeEnum;
import com.prj.pojo.message.Image;
import com.prj.pojo.message.ImageMessage;
import com.thoughtworks.xstream.XStream;

/**
 * @类名称: ImageMessageUtil
 * @类描述: 文本消息封装工具类
 * @author
 * @创建时间:2017年12月8日下午6:57:18
 */
public class ImageMessageUtil implements BaseMessageUtil<ImageMessage> {
	/**
	 * 将信息转为xml格式
	 */
	public String messageToxml(ImageMessage imageMessage) {
		XStream xtream = new XStream();
		xtream.alias("xml", imageMessage.getClass());
		return xtream.toXML(imageMessage);
	}

	/**
	 * 封装信息
	 */
	public String initMessage(String FromUserName, String ToUserName) {
		Image image = new Image();
		image.setMediaId(getmediaId());
		ImageMessage message = new ImageMessage();
		message.setFromUserName(ToUserName);
		message.setToUserName(FromUserName);
		message.setCreateTime(new Date().getTime());
		message.setMsgType(MessageTypeEnum.IMAGE.getType());
		message.setImage(image);
		return messageToxml(message);
	}

	/**
	 * 获取Media
	 * 
	 * @return
	 */
	public String getmediaId() {
		String path = "D:/1.jpg";
		String accessToken = WeiXinUtil.getAccess_Token();
		String mediaId = null;
		try {
			mediaId = UploadUtil.upload(path, accessToken, "image");
		} catch (KeyManagementException | NoSuchAlgorithmException | NoSuchProviderException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mediaId;
	}
}
