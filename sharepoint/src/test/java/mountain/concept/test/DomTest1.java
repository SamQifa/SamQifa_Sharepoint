package mountain.concept.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * 
 * @author qifa
 * @serial DOM Document Object Model, 也即文档对象模型。
 * 在应用程序中，基于DOM的XML分析器将一个XML文档转换为一个对象模型的集合
 * （通常称为DOM树），
 * 应用程序正式通过对这个对象模型的操作，来实现对XML文档数据的操作。
 * 通过DOM接口，应用程序可以在任何时候访问DOM模型中的任何一部分数据。
 * 因此，这种利用DOM接口的机制也称作随机访问机制。
 * 
 * DOM接口提供了一种分层对象模型来访问XML文档信息的方式，这些分层对象模型依据
 * XML的文档结构形成了一棵节点树。
 * 
 * 然而，由于DOM分析器把整个XML文档转化成DOM树放在了内存中，因此，当文档比较
 * 大或者结构比较复杂时，对内存的需求就比较高。而且，对于结构复杂的树的遍历也是
 * 一项耗时的操作。所以，DOM分析器对机器性能的要求比较高，实现效率不十分理想。
 * 不过，由于DOM分析器所采用的树结构的思想与XML文档的结构相吻合，同时
 * 鉴于随机访问带来的方便，因此，DOM分析器还是有很广泛的使用价值的。
 * 
 */
public class DomTest1 {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//step1, get DOM factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//step2, get conflict DOM builder
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//step3, parse a XML, get document objects
		Document document = db.parse(new File("C:\\Users\\qifa\\Workspaces\\MyEclipse 8.5\\sharepoint\\pom.xml"));
		
		Element rootElement = document.getDocumentElement();
		
		parseElement(rootElement);
	}

	private static void parseElement(Element element) {
		String tagName = element.getNodeName();
		
		NodeList children = element.getChildNodes();
		System.out.print("<" + tagName);
		
		//element元素的所有属性所构成的NameNodeMap对象，需要对其进行判断
		NamedNodeMap map = element.getAttributes();
		
		if (null != map) {
			for (int i = 0; i < map.getLength(); i++) {
				//获得该元素的每一个属性
				Attr attr = (Attr) map.item(i);
				String attrName = attr.getName();
				String attrValue = attr.getValue();
				System.out.println(" " + attrName + "=\"" + attrValue + "\"");
			}
		}
		System.out.print(">");
		
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			//获得节点的类型
			short nodeType = node.getNodeType();
			if (nodeType == Node.ELEMENT_NODE) {
				//是元素，继续递归
				parseElement((Element) node);
			}
			else if (nodeType == Node.TEXT_NODE) {
				//递归出口
				System.out.print(node.getNodeValue());
			}
			else if (nodeType == Node.COMMENT_NODE) {
				System.out.print("<!--");
				Comment comment = (Comment) node;
				//注释内容
				String data = comment.getData();
				System.out.print(data);
				System.out.print("-->");
			}
		}
		System.out.print("</" + tagName + ">");
	}
}