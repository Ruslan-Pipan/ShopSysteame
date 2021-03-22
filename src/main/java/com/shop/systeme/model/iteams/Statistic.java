package com.shop.systeme.model.iteams;

import javax.persistence.*;

@Entity
public class Statistic {
    private static final int MAX_RATING = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = true)
    private int countSellItems;

    @Column(nullable = true)
    private int reviews;

    @Column(nullable = true)
    private int rating;

    @Column
    private int discount;

    public Statistic(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountSellItems() {
        return countSellItems;
    }

    public void setCountSellItems(int countSellItems) {
        this.countSellItems = countSellItems;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating >= MAX_RATING ? MAX_RATING : rating;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
