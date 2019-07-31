package com.wh.demo3;

/**
 * Person
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class Teacher {
    private String name ;
    private int age;
    private String sex;
    private String teachId;

    public void setTeachId(String teachId) {
        this.teachId = teachId;
    }

    public String getTeachId() {
        return teachId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
