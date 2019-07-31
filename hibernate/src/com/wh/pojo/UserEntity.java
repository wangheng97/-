package com.wh.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * UserEntity
 *
 * @author wangheng
 * @date 2019/7/27
 */
@Entity
@Table(name = "user", schema = "db05", catalog = "")
public class UserEntity {
    private long id;
    private String name;
    private String sex;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex);
    }
}
