package com.shop.systeme.dao;


import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest

public class ItemRepositoryTest {

    @Autowired
    private static ItemsRepository itemsRepository;

    @BeforeAll
    @Rollback(value = false)
    public static void setUp(){
        CategoryItem categoryItem1 = new CategoryItem();
        categoryItem1.setName("Мобільний телефон");

        Item samsung = new Item();
        samsung.setNameItem("Samsung Galaxy S21 Ultra");
        samsung.setCount(5);
        samsung.setPrise(39_999);
        samsung.setCategory(new HashSet<>(Set.of(categoryItem1)));
        samsung.setDescription("Екран (6.8\", Dynamic AMOLED 2X, 3200x1440) / Samsung Exynos 2100 (1 x 2.9 ГГц + 3 x 2.8 ГГц + 4 x 2.2 ГГц) / основна квадрокамера: 108 Мп + 12 Мп + 10 Мп + 10 Мп, фронтальна : 40 Мп / RAM 12 ГБ / 256 ГБ вбудованої пам'яті / 3G / LTE / 5G / GPS / підтримка 2 SIM-карток (Nano-SIM) / Android 11.0 / 5000 мА·год");
        categoryItem1.setItems(new HashSet<>(Set.of(samsung)));

        itemsRepository.save(samsung);
    }

    @Test
    public void testFindByNameItemContaining(){
    }
}
