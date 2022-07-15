package com.handtalk.fan.models;

import java.util.List;

public class User {
    private String userName;
    private String userPhone;
    private String userPwd;
    private String userEmail;
    private String Imgs;
    private int id;

    private List<String> videoList;

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getImgs() {
        return Imgs;
    }

    public void setImgs(String imgs) {
        Imgs = imgs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<String> videoList) {
        this.videoList = videoList;
    }
}
