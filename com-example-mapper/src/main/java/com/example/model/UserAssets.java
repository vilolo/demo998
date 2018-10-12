package com.example.model;

import java.math.BigDecimal;

public class UserAssets {
    private Integer id;

    private Integer userId;

    private Integer recommendId;

    private Integer hashrate;

    private BigDecimal availableMine;

    private BigDecimal frozenMine;

    private Short autoMining;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
    }

    public Integer getHashrate() {
        return hashrate;
    }

    public void setHashrate(Integer hashrate) {
        this.hashrate = hashrate;
    }

    public BigDecimal getAvailableMine() {
        return availableMine;
    }

    public void setAvailableMine(BigDecimal availableMine) {
        this.availableMine = availableMine;
    }

    public BigDecimal getFrozenMine() {
        return frozenMine;
    }

    public void setFrozenMine(BigDecimal frozenMine) {
        this.frozenMine = frozenMine;
    }

    public Short getAutoMining() {
        return autoMining;
    }

    public void setAutoMining(Short autoMining) {
        this.autoMining = autoMining;
    }
}