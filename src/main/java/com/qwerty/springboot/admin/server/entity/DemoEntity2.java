package com.qwerty.springboot.admin.server.entity;

import java.io.Serializable;
import java.util.Date;

public class DemoEntity2 implements Serializable {

    private String pid;
    private String name;
    private Date time;
    private Date time2;

    public String getPid() {
        return pid;
    }

    public Date getTime2() {
        return time2;
    }

    public void setTime2(Date time2) {
        this.time2 = time2;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", time2=" + time2 +
                '}';
    }
}
