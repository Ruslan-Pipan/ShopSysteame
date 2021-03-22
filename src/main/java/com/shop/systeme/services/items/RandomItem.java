package com.shop.systeme.services.items;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component("randomItems")
public class RandomItem implements ListItems {

    private List<Item> items;

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void deleteItem(Item item) {
        items.remove(item);
    }

    @PostConstruct
    private void initMethod(){
        items = itemsRepository.findRandom9();
    }
}
