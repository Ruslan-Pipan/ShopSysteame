package com.shop.systeme.controler;

import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.services.basket.Basket;
import com.shop.systeme.services.items.ListItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cart/{id}")
public class BasketControler {

    @Autowired
    private Basket basket;

    @Autowired
    private List<ListItems> items;

    @Autowired
    private ItemsRepository itemsRepository;

    @DeleteMapping
    public String removeItem(@PathVariable Integer id, HttpServletRequest request){
        Map<Item, Integer> items = basket.getItemsAndCount();
        Item removeItem = null;
        for(Item item: items.keySet()){
            if (item.getId() == id)
                removeItem = item;
        }

        if (removeItem != null)
            basket.removeBasket(removeItem);

        String refresh = request.getHeader("Referer");

        return "redirect:" + refresh;
    }

    @PostMapping
    public String addItem(@PathVariable Integer id, HttpServletRequest request){
        Item item = basket.getItems().stream().filter(it -> it.getId() == id).findFirst().orElse(new Item());

        if (item.getId() == 0){

            for (ListItems listItems : items)
                for (Item i : listItems.getItems())
                    if (i.getId() == id){
                        item = i;
                        break;
                    }

            if (item.getId() == 0)
                item = itemsRepository.findById(id).orElseThrow();
        }else {
            basket.addCount(item,1);
        }

        basket.addBasket(item,1);
        String refresh = request.getHeader("Referer");
        return "redirect:" + refresh;
    }
}
