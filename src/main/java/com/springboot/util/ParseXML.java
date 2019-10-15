package com.springboot.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseXML {

    //String解析
    public static Map parseByStr(String soap) throws DocumentException {
        Map<String, Object> map = new HashMap<String, Object>();
        Document doc = DocumentHelper.parseText(soap);//报文转成doc对象
        Element root = doc.getRootElement();//获取根元素，准备递归解析这个XML树
        getCode(root, map);
        return map;
    }

    //Element解析
    public static Map parseByElement(Element root) {
        Map<String, Object> map = new HashMap<String, Object>();
        getCode(root, map);
        return map;
    }

    private static void getCode(Element root, Map<String, Object> map) {
        if (root.elements() != null) {
            List<Element> list = root.elements();//如果当前跟节点有子节点，找到子节点
            for (Element e : list) {//遍历每个节点
                if (e.elements().size() > 0) {
                    getCode(e, map);//当前节点不为空的话，递归遍历子节点；
                }
                if (e.elements().size() == 0) {
                    map.put(e.getName(), e.getTextTrim());
                }//如果为叶子节点，那么直接把名字和值放入map
            }
        }
    }

}
