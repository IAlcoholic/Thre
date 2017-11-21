package me.yll.thre.model;

import java.util.Date;
import javax.persistence.*;

public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String imagename;

    private String imagedescription;

    private String imagekeyword;

    private String imageurl;

    /**
     * 0可见  1不可见
     */
    private Integer state;

    private String createtime;

    private Integer userid;

    /**
     * 0 可以下载 1不能下载
     */
    private Integer download;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id+1;
    }

    /**
     * @return imagename
     */
    public String getImagename() {
        return imagename;
    }

    /**
     * @param imagename
     */
    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    /**
     * @return imagedescription
     */
    public String getImagedescription() {
        return imagedescription;
    }

    /**
     * @param imagedescription
     */
    public void setImagedescription(String imagedescription) {
        this.imagedescription = imagedescription;
    }

    /**
     * @return imagekeyword
     */
    public String getImagekeyword() {
        return imagekeyword;
    }

    /**
     * @param imagekeyword
     */
    public void setImagekeyword(String imagekeyword) {
        this.imagekeyword = imagekeyword;
    }

    /**
     * @return imageurl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * @param imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**
     * 获取0可见  1不可见
     *
     * @return state - 0可见  1不可见
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0可见  1不可见
     *
     * @param state 0可见  1不可见
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

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
     * 获取0 可以下载 1不能下载
     *
     * @return download - 0 可以下载 1不能下载
     */
    public Integer getDownload() {
        return download;
    }

    /**
     * 设置0 可以下载 1不能下载
     *
     * @param download 0 可以下载 1不能下载
     */
    public void setDownload(Integer download) {
        this.download = download;
    }
}