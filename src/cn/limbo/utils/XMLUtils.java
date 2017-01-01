package cn.limbo.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * 该类用于与xml文件进行交互
 * Created by limbo on 2016/12/7.
 */
public class XMLUtils {

	/**
	 * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	 * @param tagName 标签名称
	 * @return 返回标签内容一致的实力对象
	 */
	public static Object getBean(String tagName){

		try {
			//创建文档对象
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document;
			document = documentBuilder.parse(new File("config.xml"));

			//获取包含类名的文本节点
			NodeList nodeList = document.getElementsByTagName(tagName);
			Node classNode = nodeList.item(0).getFirstChild();
			String className = classNode.getNodeValue();

			Class c = Class.forName(className);
			Object o = c.newInstance();
			return o;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
