package com.shop.systeme.services.basket;

import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.services.items.ListItems;

import java.util.Map;

public interface Basket extends ListItems{
    double getTotal();
    int countItems();
    void removeBasket(Item item);
    void addBasket(Item item, int count);
    void addCount(Item item, Integer count);
    Map<Item,Integer> getItemsAndCount();
}
