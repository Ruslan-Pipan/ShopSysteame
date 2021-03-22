package com.shop.systeme.services.items.hotDeals;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.services.items.ListItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component("hotDealsListByMaxDiscount")
public class HotDealsListByDiscount implements HotDealsList, ListItems {

    private final List<HotDealsI> hotDealsList = new ArrayList<>();

    @Autowired
    private ItemsRepository itemsRepository;
    @Override
    public void addHotDeals(HotDealsI hotDeals) {
        if (hotDealsList.size() >= 10)
            hotDealsList.remove(0);

        hotDealsList.add(hotDeals);
    }

    @Override
    public boolean deleteDeals(HotDealsI hotDeals) {
        return hotDealsList.remove(hotDeals);
    }

    @Override
    public List<HotDealsI> getHotDeals() {
        return Collections.unmodifiableList(hotDealsList);
    }

    @PostConstruct
    private void initMethod(){
        List<Item> items = itemsRepository.findFirst5ByOrderByStatistic_DiscountDesc();
        int i = 2;
        for(Item item: items){
            HotDealsI hotDeals = new HotDeal();
            hotDeals.addItemAndTime(item,LocalDate.of(2021,5,i));
            addHotDeals(hotDeals);
            i += 2;
        }

    }

    @Override
    public List<Item> getItems() {
        return hotDealsList.stream().map(HotDealsI::getItem).collect(Collectors.toUnmodifiableList());
    }
}
