package com.laioffer.onlineOrder.entity;

import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String address;
    private String name;
    private String phone;
    private String imageUrl;
    @OneToMany(mappedBy = "restaurant", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<MenuItem> menuItemList;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }

    public void setMenuItemList(final List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
}