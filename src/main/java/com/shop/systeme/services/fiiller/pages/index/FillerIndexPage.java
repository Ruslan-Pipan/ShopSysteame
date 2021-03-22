package com.shop.systeme.services.fiiller.pages.index;


import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface FillerIndexPage {
    Map<CategoryItem,List<Item>> getCategoryAndItem();
    Set<CategoryItem> getCategory();
}
