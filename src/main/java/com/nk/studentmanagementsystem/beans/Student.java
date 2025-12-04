package com.nk.studentmanagementsystem.beans;

public class Student {
    private int sid;
    private String sname;
    private String saddr;
    private long sphone;

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int eno) {
        this.sid = eno;
    }

    public long getSphone() {
        return sphone;
    }

    public void setSphone(long sphone) {
        this.sphone = sphone;
    }
}
