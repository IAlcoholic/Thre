package me.yll.thre.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    private Integer userid;

    private String username;

    private String password;

    private String name;

    /**
     * 个性签名
     */
    private String qianming;

    private String sex;

    private String birthday;

    private String email;

    private String tel;

    private String userimg;

    private Date regtime;

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取个性签名
     *
     * @return qianming - 个性签名
     */
    public String getQianming() {
        return qianming;
    }

    /**
     * 设置个性签名
     *
     * @param qianming 个性签名
     */
    public void setQianming(String qianming) {
        this.qianming = qianming;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return userimg
     */
    public String getUserimg() {
        return userimg;
    }

    /**
     * @param userimg
     */
    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    /**
     * @return regtime
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * @param regtime
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
}