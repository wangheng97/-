package com.wh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
/**
 * SchoolEntity
 * @author wh
 * @date 2019/07/27
 * */

public class SchoolEntity {
    private int scid;
    private String scname;
    private String address;

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scid, scname, address);
    }
}
