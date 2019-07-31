package com.wh.pojo;

import java.sql.Date;
import java.util.Objects;

/**
 * SchoolEntity
 * @author wh
 * @date 2019/07/27
 * */
public class StudentEntity {
    private int sid;
    private String sname;
    private String gendar;
    private Date birthday;
    private String phone;
    private SchoolEntity school;

    public String getSname() {
        return sname;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SchoolEntity getSchool() {
        return school;
    }

    public void setSchool(SchoolEntity school) {
        this.school = school;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, birthday,gendar,  phone);
    }
}
