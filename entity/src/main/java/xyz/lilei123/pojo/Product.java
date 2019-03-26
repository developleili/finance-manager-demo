package xyz.lilei123.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private double thresholdAmount;
    private double stepAmount;
    private long lockTerm;
    private double rewardRate;
    /**
     * @see xyz.lilei123.pojo.enums.ProductStatus
     */
    @ApiModelProperty(value = "状态", dataType = "xyz.lilei123.pojo.enums.ProductStatus")
    private String status;
    private String memo;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:ss")
    private java.sql.Timestamp createAt;
    private String createUser;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:ss")
    private java.sql.Timestamp updateAt;
    private String updateUser;

    public Product() {
    }

    public Product(String id, String name, double thresholdAmount, double stepAmount, long lockTerm, double rewardRate, String status, String memo, Timestamp createAt, String createUser, Timestamp updateAt, String updateUser) {
        this.id = id;
        this.name = name;
        this.thresholdAmount = thresholdAmount;
        this.stepAmount = stepAmount;
        this.lockTerm = lockTerm;
        this.rewardRate = rewardRate;
        this.status = status;
        this.memo = memo;
        this.createAt = createAt;
        this.createUser = createUser;
        this.updateAt = updateAt;
        this.updateUser = updateUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(double thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }


    public double getStepAmount() {
        return stepAmount;
    }

    public void setStepAmount(double stepAmount) {
        this.stepAmount = stepAmount;
    }


    public long getLockTerm() {
        return lockTerm;
    }

    public void setLockTerm(long lockTerm) {
        this.lockTerm = lockTerm;
    }


    public double getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(double rewardRate) {
        this.rewardRate = rewardRate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }


    public java.sql.Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(java.sql.Timestamp createAt) {
        this.createAt = createAt;
    }


    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    public java.sql.Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(java.sql.Timestamp updateAt) {
        this.updateAt = updateAt;
    }


    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}
