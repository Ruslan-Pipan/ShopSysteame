package com.shop.systeme.services.items.hotDeals;

import com.shop.systeme.model.iteams.Item;

import java.time.LocalDate;


public interface HotDealsI {
    void addItemAndTime(Item item, LocalDate time);
    Item getItem();
    String getName();
    LocalDate getLocalTime();
    double getPriseWithDiscount();
    double getDiscount();
    int getRating();
}
