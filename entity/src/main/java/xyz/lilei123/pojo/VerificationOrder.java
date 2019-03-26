package xyz.lilei123.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class VerificationOrder {
    @Id
    private String orderId;
    private String chanId;
    private String productId;
    private String chanUserId;
    private String orderType;
    private String outerOrderId;
    private double amount;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private java.sql.Timestamp createAt;

    public VerificationOrder() {
    }

    public VerificationOrder(String orderId, String chanId, String productId, String chanUserId, String orderType, String outerOrderId, double amount, Timestamp createAt) {
        this.orderId = orderId;
        this.chanId = chanId;
        this.productId = productId;
        this.chanUserId = chanUserId;
        this.orderType = orderType;
        this.outerOrderId = outerOrderId;
        this.amount = amount;
        this.createAt = createAt;
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


    public java.sql.Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(java.sql.Timestamp createAt) {
        this.createAt = createAt;
    }

}
