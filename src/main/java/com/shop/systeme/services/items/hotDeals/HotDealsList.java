package com.shop.systeme.services.items.hotDeals;


import java.util.List;


public interface HotDealsList {
    void addHotDeals(HotDealsI hotDeals);
    boolean deleteDeals(HotDealsI hotDeals);
    List<HotDealsI> getHotDeals();
}
