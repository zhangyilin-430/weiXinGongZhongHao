package com.prj.pojo.message;

import java.awt.event.ItemEvent;
import java.util.List;

/**
 * @类名称: NewsMessage
 * @类描述: 图文消息
 * @author
 * @创建时间:2017年12月8日下午6:42:39 <xml>
 * 
 *                           <ToUserName>< ![CDATA[toUser] ]></ToUserName>
 * 
 *                           <FromUserName>< ![CDATA[fromUser] ]></FromUserName>
 * 
 *                           <CreateTime>12345678</CreateTime>
 * 
 *                           <MsgType>< ![CDATA[news] ]></MsgType>
 * 
 *                           <ArticleCount>1</ArticleCount>
 * 
 *                           <Articles>
 * 
 *                           <item>
 * 
 *                           <Title>< ![CDATA[title1] ]></Title>
 * 
 *                           <Description><
 *                           ![CDATA[description1]]></Description>
 * 
 *                           <PicUrl>< ![CDATA[picurl] ]></PicUrl>
 * 
 *                           <Url>< ![CDATA[url] ]></Url>
 * 
 *                           </item>
 * 
 *                           </Articles>
 * 
 *                           </xml>
 */
public class NewsMessage extends BaseMessage {
	/**
	 * 图文消息个数；当用户发送文本、图片、视频、图文、地理位置这五种消息时，开发者只能回复1条图文消息；其余场景最多可回复8条图文消息
	 */
	private Integer ArticleCount;
	/**
	 * 图文消息信息，注意，如果图文数超过限制，则将只发限制内的条数
	 */
	private List<News> Articles;

	public Integer getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(Integer articleCount) {
		ArticleCount = articleCount;
	}

	public List<News> getArticles() {
		return Articles;
	}

	public void setArticles(List<News> articles) {
		Articles = articles;
	}

}
