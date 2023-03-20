package com.laioffer.onlineOrder.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String email;
    private String authorities;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(final String authorities) {
        this.authorities = authorities;
    }
}