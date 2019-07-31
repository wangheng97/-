package com.wh.framework;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ApplicationContext
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class ApplicationContext {
    private  String filepath;
    private Map<String,Object> beanMap=new HashMap<>();
    private Map<String,BeanNode> nodeMap=new HashMap<>();
    public  ApplicationContext(String filepath){
        this.filepath=filepath;
        try {
            parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  <T> T getBean(String id){
        return (T)beanMap.get(id);
    }
    public  void parse() throws Exception{
        SAXReader reader=new SAXReader();
        InputStream is =this.getClass().getResourceAsStream(filepath);
       Document document= reader.read(is);
       //获取根节点Beans
      Element rootElement= document.getRootElement();
      //获取bean节点列表
        List<Element> beanList=rootElement.elements("bean");
        for (Element bean : beanList) {
            String id=bean.attributeValue("id");
            String cls=bean.attributeValue("class");
        //解析Property
            List<Element> list=bean.elements("property");
            Map<String,PropNode> propMap=new HashMap<>();
            for (Element prop : list) {
                String name=prop.attributeValue("name");
                String value=prop.attributeValue("value");
                String ref=prop.attributeValue("ref");
                //实例化propNode
                PropNode propNode=new PropNode();
                propNode.setName(name);
                propNode.setValue(value);
                propNode.setRef(ref);
                //属性名为key,proNode为value
                propMap.put(name, propNode);
            }
            //BeanNode
            BeanNode beanNode=new BeanNode();
            beanNode.setId(id);
            beanNode.setClsName(cls);
            beanNode.setProps(propMap);
            //放入Nodemap
            nodeMap.put(id,beanNode);
        }
    }
    public void Bean() throws  Exception{
        Set<Map.Entry<String,BeanNode>> set=nodeMap.entrySet();
        for (Map.Entry<String, BeanNode> entry : set) {
            String id=entry.getKey();
            BeanNode val=entry.getValue();
            String clsName=val.getClsName();
            Object obj=Class.forName(clsName).newInstance();
            beanMap.put(id, obj);
        }
    }
    public void propToBean() throws Exception{
        Set<Map.Entry<String,BeanNode>> set=nodeMap.entrySet();
        for (Map.Entry<String, BeanNode> entry : set) {
            String id=entry.getKey();
            BeanNode beanNode=entry.getValue();
            //属性列表
            Map<String,PropNode> propNodeMap=new HashMap<>();
            //取出当前属性，默认为null
          Object beanObj=  beanMap.get(id);
            Set<Map.Entry<String,PropNode>> propSet = propNodeMap.entrySet();
            for (Map.Entry<String, PropNode> prop : propSet) {
                String name = prop.getKey();
                PropNode propNode = prop.getValue();
                String ref = propNode.getRef();
                String val = propNode.getValue();
            String setMethodName="set"+name.substring(0,1).toUpperCase()+name.substring(1);
            Class<?> type=beanObj.getClass().getDeclaredField(name).getType();
            Method method= beanObj.getClass().getDeclaredMethod(setMethodName,type);
            if (ref!=null){
                method.invoke(beanObj, beanMap.get(ref));
            } else {
                if (type==Integer.class||type==int.class){
                    method.invoke(beanObj, Integer.parseInt(val));
                }if (type==Float.class||type==float.class){
                    method.invoke(beanObj, Float.parseFloat(val));
                }else  if (type==String.class){
                    method.invoke(beanObj, val);
                }
            }
            }
        }
    }
}
