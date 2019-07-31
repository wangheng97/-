package com.wh.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Cla
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class Cla {
    private List<String> list;
    private Map<String,String> map;
    private ArrayList<String> arrayList;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
