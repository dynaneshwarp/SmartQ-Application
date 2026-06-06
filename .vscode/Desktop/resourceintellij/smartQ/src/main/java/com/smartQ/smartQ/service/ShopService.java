package com.smartQ.smartQ.service;


import com.smartQ.smartQ.entity.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {

    Shop saveShop(Shop shop);

    List<Shop> getAllShops();

    Optional<Shop> getShopById(Integer id);

    List<Shop> getShopsByCategory(String category);

    void deleteShop(Integer id);
}
