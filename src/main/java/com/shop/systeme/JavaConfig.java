package com.shop.systeme;

import com.shop.systeme.dao.items.CategoryItemRepository;
import com.shop.systeme.dao.items.ItemsRepository;
import com.shop.systeme.model.iteams.CategoryItem;
import com.shop.systeme.model.iteams.Item;
import com.shop.systeme.qualifiers.PagesIndexCategoryQualifier;
import com.shop.systeme.services.slider.Slide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@ComponentScan
@Configuration
public class JavaConfig {
    private CategoryItemRepository categoryItemRepository;

    @Autowired
    private ItemsRepository itemsRepository;

    @Bean
    public List<CategoryItem> categories(){
        return categoryItemRepository.findAll();
    }


    @Bean
    public Slide slide1(){
        Slide slider = new Slide();
        slider.setLayer1("LUMIA 888 DESIGN");
        slider.setLayer2("Elegant design for business");
        slider.setLayer3("$966.82");
        slider.setImg("img/sliders/slider-1/bg1.jpg");
        slider.setPositions(1);
        return slider;
    }

    @Bean
    public Slide slide2(){
        Slide slider = new Slide();
        slider.setLayer1("PHILIPS");
        slider.setLayer2("-50%");
        slider.setLayer3("На другий товар техніки краси та здоровя");
        slider.setImg("img/sliders/slider-1/bg2.jpg");
        slider.setPositions(2);
        return slider;
    }

    @Bean
    public Slide slide3(){
        Slide slider = new Slide();
        slider.setLayer1("BUY AIR LACOTE");
        slider.setLayer2("SUPER TABLET, SUPER GIFT");
        slider.setLayer3("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et.");
        slider.setImg("img/sliders/slider-1/bg3.jpg");
        slider.setPositions(3);
        return slider;
    }

    @Bean
    @PagesIndexCategoryQualifier
    public CategoryItem category1(){
        return categoryItemRepository.findFirstByName("Мобільний телефон");
    }

    @Bean
    @PagesIndexCategoryQualifier
    public CategoryItem category2(){
        return categoryItemRepository.findFirstByName("Комп'ютери");
    }

    @Bean
    @PagesIndexCategoryQualifier
    public CategoryItem category3(){
        return categoryItemRepository.findFirstByName("ELECTRONIC");
    }

    @Autowired
    public void setCategoryItemRepository(CategoryItemRepository categoryItemRepository) {
        this.categoryItemRepository = categoryItemRepository;
    }



}