package com.wh.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Project
 *
 * @author wangheng
 * @date 2019/7/27
 */
public class Project {
    private int pno;
    private String pname;
    private Set<Employee> employees = new HashSet<>();
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


    @Override
    public int hashCode() {
        return Objects.hash(pno, pname);
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
