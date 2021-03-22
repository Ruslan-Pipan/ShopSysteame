package com.shop.systeme.controler;

import com.shop.systeme.dao.items.CategoryItemRepository;
import com.shop.systeme.dao.items.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControler {

    @Autowired
    private CategoryItemRepository categoryItemRepository;

    @Autowired
    private ItemsRepository itemsRepository;

    @GetMapping("/t")
    public String getTest(Model model){
        model.addAttribute("category", categoryItemRepository.findFirstByName("Мобільний телефон"));
        model.addAttribute("item", itemsRepository.findFirst4ByCategoryItemOrderByIdDesc(categoryItemRepository.findFirstByName("Мобільний телефон")));
        return "test";
    }

}
