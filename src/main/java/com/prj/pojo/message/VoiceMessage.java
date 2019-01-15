package com.prj.pojo.message;

/**
 * @类名称: VoiceMessage
 * @类描述: 语音消息
 * @author
 * @创建时间:2017年12月8日下午6:48:36
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
 *                           <Voice>
 * 
 *                           <MediaId><![CDATA[media_id]]></MediaId>
 * 
 *                           </Voice>
 * 
 *                           </xml>
 * 
 */
public class VoiceMessage extends BaseMessage {
	/**
	 * Voice节点
	 */
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
