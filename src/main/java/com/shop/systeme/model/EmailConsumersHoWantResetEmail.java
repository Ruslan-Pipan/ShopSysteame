package com.shop.systeme.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmailConsumersHoWantResetEmail {
    @Id
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
