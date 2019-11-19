package com.zx.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 张绚
 * @创建时间 2019/11/15 0015
 * @描述
 */
public class User implements Serializable {

    private String id;
    private Date date;

    public User() {
    }

    public User(String id) {
        this.id = id;
        this.date = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }
}
