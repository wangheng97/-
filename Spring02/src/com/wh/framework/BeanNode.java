package com.wh.framework;

import java.util.Map;

/**
 * BeanNode
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class BeanNode {
    private  String id;
    private String clsName;
    private Map<String,PropNode> props;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public Map<String, PropNode> getProps() {
        return props;
    }

    public void setProps(Map<String, PropNode> props) {
        this.props = props;
    }
}
