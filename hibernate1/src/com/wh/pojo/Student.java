package com.wh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

/**
 * Student
 *
 * @author wangheng
 * @date 2019/7/27
 */
@Entity
public class Student {
    private int sid;
    private String sname;
    private Date birthday;
    private String gendar;
    private String phone;

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 20)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "gendar", nullable = true, length = 2)
    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 12)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(gendar, student.gendar) &&
                Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, birthday, gendar, phone);
    }
}
