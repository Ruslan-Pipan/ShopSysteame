package com.shop.systeme.dao.items;

import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item,Integer> {
    List<Item> findByNameItemIgnoreCaseContaining(String name);
    List<Item> findFirst8ByOrderByStatistic_RatingDesc();
    List<Item> findFirst5ByOrderByStatistic_DiscountDesc();
    List<Item> findFirst4ByCategoryItemOrderByIdDesc(CategoryItem categoryItem);
    List<Item> findFirst9ByOrderByIdDesc();
    List<Item> findFirst9ByOrderByStatistic_DiscountDesc();

    @Query(nativeQuery = true,value = "SELECT * FROM item ORDER BY random() LIMIT 9")
    List<Item> findRandom9();


}
