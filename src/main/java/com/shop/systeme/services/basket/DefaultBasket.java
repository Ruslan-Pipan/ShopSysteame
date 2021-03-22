package com.shop.systeme.services.basket;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.*;

@Component("basket")
@SessionScope
public class DefaultBasket implements Basket{

    @Autowired
    private ItemsRepository itemsRepository;

    private final Map<Item,Integer> items = new LinkedHashMap<>();

    @Override
    public double getTotal() {
        return items.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrise() * entry.getValue())
                .sum();
    }

    @Override
    public int countItems() {
        return items.size();
    }

    @Override
    public void removeBasket(Item item) {
        items.remove(item);
    }

    @Override
    public void addBasket(Item item, int count) {
        items.put(item,count);
    }

    @Override
    public void addCount(Item item, Integer count) {
        items.put(item, items.get(item) + 1);
    }

    @Override
    public Map<Item, Integer> getItemsAndCount() {
        return Collections.unmodifiableMap(items);
    }

    @PostConstruct
    private void inint(){
        List<Item> itemsList = itemsRepository.findFirst5ByOrderByStatistic_DiscountDesc();
        for (int i = 1; i < itemsList.size(); i++) {
            items.put(itemsList.get(i),i);
        }
    }

    @Override
    public List<Item> getItems() {
        return new ArrayList<>(items.keySet());
    }

}
