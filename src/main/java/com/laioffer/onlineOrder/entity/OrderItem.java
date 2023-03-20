package com.laioffer.onlineOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "orderitem")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int quantity;
    private double price;
    @ManyToOne
    private MenuItem menuItem;
    @ManyToOne
    @JsonIgnore
    private Cart cart;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public MenuItem getMenuItem() {
        return this.menuItem;
    }

    public void setMenuItem(final MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(final Cart cart) {
        this.cart = cart;
    }
}
