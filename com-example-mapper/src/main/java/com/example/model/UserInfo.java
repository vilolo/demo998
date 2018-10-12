package com.example.model;

public class UserInfo {
    private Integer id;

    private Short levelId;

    private String nickname;

    private Integer firstDeviceId;

    private Short status;

    private Integer createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getLevelId() {
        return levelId;
    }

    public void setLevelId(Short levelId) {
        this.levelId = levelId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getFirstDeviceId() {
        return firstDeviceId;
    }

    public void setFirstDeviceId(Integer firstDeviceId) {
        this.firstDeviceId = firstDeviceId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }
}