package com.wh.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Student
 *
 * @author wangheng
 * @date 2019/7/29
 */
@Entity
public class Student {
    private int sid;
    private String sname;
    private Date birthday;
    private String gendar;
    private String phone;
    private School schoolByScid;

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
    public int hashCode() {
        return Objects.hash(sid, sname, birthday, gendar, phone);
    }

    @ManyToOne
    @JoinColumn(name = "scid", referencedColumnName = "scid")

    public School getSchoolByScid() {
        return schoolByScid;
    }

    public void setSchoolByScid(School schoolByScid) {
        this.schoolByScid = schoolByScid;
    }
}
