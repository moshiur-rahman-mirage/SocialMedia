package com.social.models;

import java.time.LocalDateTime;

public class User {
    private int zid;
    private LocalDateTime ztime;
    private LocalDateTime zutime;

    private String xuserid;
    private String zauserid;
    private String zuuserid;
    private String xfirstName;
    private String xlastName;
    private String xemail;
    private String xpassword;

    public User(){

    }

    public User(int zid, LocalDateTime ztime, LocalDateTime zutime, String zauserid, String zuuserid,String xuserid, String xfirstName, String xlastName, String xemail, String xpassword) {
        this.zid = zid;
        this.ztime = ztime;
        this.zutime = zutime;
        this.zauserid = zauserid;
        this.zuuserid = zuuserid;
        this.xuserid = xuserid;
        this.xfirstName = xfirstName;
        this.xlastName = xlastName;
        this.xemail = xemail;
        this.xpassword = xpassword;
    }

    public int getZid() {
        return zid;
    }

    public void setZid(int zid) {
        this.zid = zid;
    }

    public LocalDateTime getZtime() {
        return ztime;
    }

    public void setZtime(LocalDateTime ztime) {
        this.ztime = LocalDateTime.now();
    }

    public LocalDateTime getZutime() {
        return zutime;
    }

    public void setZutime(LocalDateTime zutime) {
        this.zutime = LocalDateTime.now();
    }

    public String getZauserid() {
        return zauserid;
    }

    public void setZauserid(String zauserid) {
        this.zauserid = zauserid;
    }

    public String getZuuserid() {
        return zuuserid;
    }

    public void setZuuserid(String zuuserid) {
        this.zuuserid = zuuserid;
    }

    public String getXuserid() {
        return xuserid;
    }

    public void setXuserid(String xuserid) {
        this.xuserid = xuserid;
    }

    public String getXfirstName() {
        return xfirstName;
    }

    public void setXfirstName(String xfirstName) {
        this.xfirstName = xfirstName;
    }

    public String getXlastName() {
        return xlastName;
    }

    public void setXlastName(String xlastName) {
        this.xlastName = xlastName;
    }

    public String getXemail() {
        return xemail;
    }

    public void setXemail(String xemail) {
        this.xemail = xemail;
    }

    public String getXpassword() {
        return xpassword;
    }

    public void setXpassword(String xpassword) {
        this.xpassword = xpassword;
    }
}
