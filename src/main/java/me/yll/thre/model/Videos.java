package me.yll.thre.model;

import java.util.Date;
import javax.persistence.*;

public class Videos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String videoname;

    private String videodescription;

    private String videokeyword;

    private String videourl;

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
     * @return videoname
     */
    public String getVideoname() {
        return videoname;
    }

    /**
     * @param videoname
     */
    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    /**
     * @return videodescription
     */
    public String getVideodescription() {
        return videodescription;
    }

    /**
     * @param videodescription
     */
    public void setVideodescription(String videodescription) {
        this.videodescription = videodescription;
    }

    /**
     * @return videokeyword
     */
    public String getVideokeyword() {
        return videokeyword;
    }

    /**
     * @param videokeyword
     */
    public void setVideokeyword(String videokeyword) {
        this.videokeyword = videokeyword;
    }

    /**
     * @return videourl
     */
    public String getVideourl() {
        return videourl;
    }

    /**
     * @param videourl
     */
    public void setVideourl(String videourl) {
        this.videourl = videourl;
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