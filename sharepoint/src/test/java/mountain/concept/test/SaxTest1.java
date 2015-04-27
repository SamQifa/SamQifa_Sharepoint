package mountain.concept.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author qifa
 * @serial SAX (Simple APIs for XML), 即XML简单应用程序接口
 * 与DOM不同，SAX提供的访问模式是一种顺序模式。这是一种快速读写XML数据的方式。
 * 当使用SAX分析器对XML文档进行分析时，会触发一系列事件，并激活相应的事件处理
 * 函数，应用程序通过这些事件处理函数实现对XML文档的访问，因而SAX接口也被称作
 * 事件驱动接口。
 */
public class SaxTest1 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//step1, 获得SAX解析器工厂实例
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//step2, 获得SAX解析器实例
		SAXParser parser = factory.newSAXParser();
		SaxTest1 saxTest1 = new SaxTest1();
		//step3, 开始进行解析
		parser.parse(new File(""), saxTest1.new MyHandler());
	}
	class MyHandler extends DefaultHandler{
		public MyHandler() {
			super();
		}
	}
}
