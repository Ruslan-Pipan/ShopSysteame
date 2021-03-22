package com.shop.systeme.services.fiiller.pages.index;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.qualifiers.PagesIndexCategoryQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component("index")
public class FillerByLastItemsFromCategoryPage implements FillerIndexPage {

    private final Map<CategoryItem, List<Item>> itemMap = new LinkedHashMap<>();

    @Autowired
    @PagesIndexCategoryQualifier
    private List<CategoryItem> lists;

    @Autowired
    private ItemsRepository itemsRepository;


    @Override
    public Map<CategoryItem, List<Item>> getCategoryAndItem() {
        return itemMap;
    }

    @Override
    public Set<CategoryItem> getCategory() {
        return itemMap.keySet();
    }

    @PostConstruct
    private void initMethod(){
        for (CategoryItem category : lists) {
            itemMap.put(category, itemsRepository.findFirst4ByCategoryItemOrderByIdDesc(category));
        }
    }
}
