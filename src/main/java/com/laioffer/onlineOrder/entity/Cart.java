package com.laioffer.onlineOrder.entity;

import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double totalPrice;
    @OneToMany(mappedBy = "cart", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<OrderItem> orderItemList;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(final double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(final List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}