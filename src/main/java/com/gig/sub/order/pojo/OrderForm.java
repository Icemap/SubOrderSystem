package com.gig.sub.order.pojo;

public class OrderForm {
    private Integer id;

    private String name;

    private String des;

    private Integer mainUserId;

    private String srcDir;

    private String status;

    private Integer orderUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(Integer mainUserId) {
        this.mainUserId = mainUserId;
    }

    public String getSrcDir() {
        return srcDir;
    }

    public void setSrcDir(String srcDir) {
        this.srcDir = srcDir == null ? null : srcDir.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }
}