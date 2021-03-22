package com.shop.systeme.dao;

import com.shop.systeme.dao.items.CategoryItemRepository;
import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;

import java.util.HashSet;
import java.util.Set;

import com.shop.systeme.model.iteams.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Felling {
    @Autowired
    private CategoryItemRepository categoryItemRepository;

    @Autowired
    private ItemsRepository itemsRepository;

    public void fill(){
        CategoryItem categoryItem1 = new CategoryItem();
        categoryItem1.setName("Мобільний телефон");

        CategoryItem categoryItem2 = new CategoryItem();
        categoryItem2.setName("Комп'ютери");

        CategoryItem categoryItem3 = new CategoryItem();
        categoryItem3.setName("ELECTRONIC");



        Item item1 = new Item();
        item1.setNameItem("Samsung Galaxy S21 Ultra");
        item1.setCount(5);
        item1.setPrise(39_999);
        item1.setCategory(new HashSet<>(Set.of(categoryItem1)));
        item1.setDescription("Екран (6.8\", Dynamic AMOLED 2X, 3200x1440) / Samsung Exynos 2100 (1 x 2.9 ГГц + 3 x 2.8 ГГц + 4 x 2.2 ГГц) / основна квадрокамера: 108 Мп + 12 Мп + 10 Мп + 10 Мп, фронтальна : 40 Мп / RAM 12 ГБ / 256 ГБ вбудованої пам'яті / 3G / LTE / 5G / GPS / підтримка 2 SIM-карток (Nano-SIM) / Android 11.0 / 5000 мА·год");
        categoryItem1.setItems(new HashSet<>(Set.of(item1)));
        itemsRepository.save(item1);




        Item item2 = new Item();
        item2.setNameItem("Everest Home 4070 (4070_9414)");
        item2.setCount(2);
        item2.setPrise(14_999);
        item2.setCategoryItem(new HashSet<>(Set.of(categoryItem2)));
        item2.setDescription("Intel Core i3-9100F (3.6 - 4.2 ГГц) / RAM 8 ГБ / HDD 1 ТБ / nVidia GeForce GTX 1050 Ti, 4 ГБ / Без ОД / LAN / без ОС");
        categoryItem2.setItems(new HashSet<>(Set.of(item2)));
        itemsRepository.save(item2);

        categoryItemRepository.save(categoryItem1);
        categoryItemRepository.save(categoryItem2);
        categoryItemRepository.save(categoryItem3);

    }

    public CategoryItemRepository getCategoryItemRepository() {
        return categoryItemRepository;
    }

    public void setCategoryItemRepository(CategoryItemRepository categoryItemRepository) {
        this.categoryItemRepository = categoryItemRepository;
    }

    public ItemsRepository getItemsRepository() {
        return itemsRepository;
    }

    public void setItemsRepository(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }
}
