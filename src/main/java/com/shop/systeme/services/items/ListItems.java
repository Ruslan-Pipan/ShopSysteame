package com.shop.systeme.services.items;

import com.shop.systeme.model.iteams.Item;

import java.util.List;

public interface ListItems {
    List<Item> getItems();
    default void addItem(Item item){}
    default void  deleteItem(Item item){}
}
