package com.lcz.jdp.dp3_FactoryMethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * desc: TODO
 * date: 2019/8/19 11:02 by lcz
 */
public class ReadXML1 {
    public static Object getObject() {
        try {
            //创建文档对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("E:\\workplace-as-util\\lczJavaDesignPattern\\app\\src\\main\\java\\com\\lcz\\jdp\\dp1_FactoryMethod\\config1.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "com.lcz.jdp.dp1_FactoryMethod." + classNode.getNodeValue();
            System.out.println("新类名："+cName);
            //通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
