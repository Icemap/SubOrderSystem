package com.gig.sub.order.pojo;

public class OrderUser {
    private Integer id;

    private String userName;

    private String account;

    private String password;

    private String status;

    private Double score;

    private Double scoreWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScoreWeight() {
        return scoreWeight;
    }

    public void setScoreWeight(Double scoreWeight) {
        this.scoreWeight = scoreWeight;
    }
}