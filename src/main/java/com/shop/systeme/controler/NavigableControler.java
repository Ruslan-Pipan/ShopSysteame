package com.shop.systeme.controler;

import com.shop.systeme.dao.Felling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigableControler {


    private Felling felling;

    @RequestMapping("index")
    public String indexPages(Model model){
        model.addAttribute("title","Home | Malias");
        return "index";
    }

    @RequestMapping("my-account")
    public String myAccount(Model model){
        model.addAttribute("title","My Account | Malias");
        return "my-account";
    }

    @RequestMapping("wishlist")
    public String wishlist(Model model){
        model.addAttribute("title","Wish List | Malias");
        return "wishlist";
    }

    @RequestMapping("checkout")
    public String checkout(Model model){
        model.addAttribute("title","Checkout | Malias");
        return "checkout";
    }

    @RequestMapping("account")
    public String account(Model model){
        model.addAttribute("title","Create New Customer Account | Malias");
        return "account";
    }

    @RequestMapping("about")
    public String about(Model model){
        model.addAttribute("title","About Us | Malias");
        return "about";
    }

    @RequestMapping("cart")
    public String cart(Model model){
        model.addAttribute("title","Shopping Cart | Malias");
        return "cart";
    }

    @RequestMapping("contact")
    public String contact(Model model){
        model.addAttribute("title","Contact Us | Malias");
        return "contact";
    }

    @RequestMapping("product-details")
    public String productDetails(Model model){
        model.addAttribute("title","Product Details | Malias");
        return "product-details";
    }

    @RequestMapping("shop")
    public String shop(Model model){
        model.addAttribute("title","Shop | Malias");
        return "shop";
    }
    @RequestMapping("shop-list")
    public String shopList(Model model){
        model.addAttribute("title","Shop List | Malias");
        return "shop-list";
    }

    @RequestMapping("fill")
    public String fill(){
        felling.fill();
        return "index";
    }
    public Felling getFelling() {
        return felling;
    }

    @Autowired
    public void setFelling(Felling felling) {
        this.felling = felling;
    }
}
