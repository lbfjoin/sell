package com.example.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author lbf
 * @date 2020/6/21 20:38
 * dataobject中的类即是实体类
 * 他是与数据库中的表字段一一对应的类
 * 写成JavaBean模式
 */
@Entity
@Data
public class OrderMaster {
    /*
    订单id
     */
   @Id
    private String orderId;
    /*
    买家名字
     */
    private String buyerName;
    /*
    订单的总金额
     */
    private BigDecimal orderAmount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }
}
