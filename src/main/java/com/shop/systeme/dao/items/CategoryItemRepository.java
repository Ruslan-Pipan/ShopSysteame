package com.shop.systeme.dao.items;

import com.shop.systeme.model.iteams.CategoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryItemRepository extends JpaRepository<CategoryItem,Integer> {
    CategoryItem findFirstById(int id);
    CategoryItem findFirstByName(String name);
}
