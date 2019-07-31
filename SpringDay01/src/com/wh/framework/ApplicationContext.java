package com.wh.framework;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApplicationContext
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class ApplicationContext {
    private  String filePath;
    private Map<String,Object> beanMap=new HashMap<>();
    public ApplicationContext(String filePath){
        this.filePath = filePath;
        try {
            parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public <T> T getBean(){
    return null;
    }
    public  void parse() throws Exception{
        SAXReader reader = new SAXReader();
        InputStream is = this.getClass().getResourceAsStream(filePath);
        Document document = reader.read(is);
        Element rootElement=document.getRootElement();
       List<Element> list= rootElement.elements();
        for (Element element : list) {
            String id=element.attributeValue("id");
            String cls=element.attributeValue("class");
            System.out.println(id+"==="+cls);
        }
    }

}
