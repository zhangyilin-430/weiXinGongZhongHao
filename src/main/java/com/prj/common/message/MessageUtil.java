package com.prj.common.message;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @类名称: MessageUtil
 * @类描述: 消息处理工具
 * @author
 * @创建时间:2017年12月8日下午3:20:48
 */
public class MessageUtil {
	/**
	 * 将微信的请求中参数转成map
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String> xmlToMap(HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		InputStream in = null;
		try {
			in = request.getInputStream();
			// 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
			Document doc = reader.read(in);
			// 通过document对象获取根节点bookstore
			Element root = doc.getRootElement();
			// 通过element对象的elements方法迭代
			List<Element> list = root.elements();
			for (Element element : list) {
				map.put(element.getName(), element.getText());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map;
	}
}
