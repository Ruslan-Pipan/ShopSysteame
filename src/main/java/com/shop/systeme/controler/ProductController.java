package com.shop.systeme.controler;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.services.items.ListItems;
import com.shop.systeme.services.items.hotDeals.HotDealsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Controller
public class ProductController {

    private final static String PAGE = "product-details";
    private final static String ITEM = "itemDetail";

    @Autowired
    private ItemsRepository itemsRepository;

    @Autowired
    private List<ListItems> listItems;

    @GetMapping("product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){

        Optional<Item> itemFound = Optional.empty();

        for (ListItems listItems : listItems) {
            for (Item item : listItems.getItems()) {
                if (item.getId() == id)
                    itemFound = Optional.of(item);
            }
        }

        if (itemFound.isEmpty())
            itemFound = itemsRepository.findById(id);

        model.addAttribute(ITEM, itemFound.orElseThrow());
        model.addAttribute("related", itemsRepository.findFirst4ByCategoryItemOrderByIdDesc(itemFound.get().getCategory().stream().findFirst().get()));

        return PAGE;
    }

}
