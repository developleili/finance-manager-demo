package xyz.lilei123.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "order_t")
public class Order {
    @Id
    private String orderId;
    private String chanId;
    private String productId;
    private String chanUserId;

    private String orderType;
    private String orderStatus;
    private String outerOrderId;
    private double amount;
    private String memo;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:ss")
    private Date createAt;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:ss")
    private Date updateAt;

    public Order() {
    }

    public Order(String orderId, String chanId, String productId, String chanUserId, String orderType, String orderStatus, String outerOrderId, double amount, String memo, Date createAt, Date updateAt) {
        this.orderId = orderId;
        this.chanId = chanId;
        this.productId = productId;
        this.chanUserId = chanUserId;
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.outerOrderId = outerOrderId;
        this.amount = amount;
        this.memo = memo;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public String getChanId() {
        return chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getChanUserId() {
        return chanUserId;
    }

    public void setChanUserId(String chanUserId) {
        this.chanUserId = chanUserId;
    }


    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


    public String getOuterOrderId() {
        return outerOrderId;
    }

    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }


    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(java.sql.Timestamp createAt) {
        this.createAt = createAt;
    }


    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(java.sql.Timestamp updateAt) {
        this.updateAt = updateAt;
    }

}
