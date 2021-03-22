package com.shop.systeme.services.items.hotDeals;

import com.shop.systeme.model.iteams.Item;

import java.time.LocalDate;
import java.util.Objects;



public class HotDeal implements HotDealsI {

    private LocalDate date;
    private Item item;

    @Override
    public void addItemAndTime(Item item, LocalDate date) {
        this.item = item;
        this.date = date;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public String getName() {
        return item.getNameItem();
    }

    @Override
    public LocalDate getLocalTime() {
        return date;
    }

    @Override
    public double getPriseWithDiscount() {
        return item.getPrise() - item.getPrise() * item.getStatistic().getDiscount() / 100;
    }

    @Override
    public double getDiscount() {
        return item.getPrise() * item.getStatistic().getDiscount() / 100;
    }

    @Override
    public int getRating() {
        return item.getStatistic().getRating();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDeal that = (HotDeal) o;
        return Objects.equals(getItem(), that.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItem());
    }
}
