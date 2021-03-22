package com.shop.systeme.services.items;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component("bestseller")
public class BestsellersItems implements ListItems{

    @Autowired
    private ItemsRepository itemsRepository;

    private List<Item> items;

    @Scheduled(cron = "0 * 12 * * ?")
    @PostConstruct
    private void initMethod(){
        items = itemsRepository.findFirst8ByOrderByStatistic_RatingDesc();
    }

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
}
