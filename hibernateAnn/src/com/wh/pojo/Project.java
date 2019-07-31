package com.wh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Project
 *
 * @author wangheng
 * @date 2019/7/29
 */
@Entity
public class Project {
    @Id
    @Column(name = "pno")
    private  int  pno;
    @Basic
    @Column(name = "pname")
    private String pname;

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
