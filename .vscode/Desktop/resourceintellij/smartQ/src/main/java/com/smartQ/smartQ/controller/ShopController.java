package com.smartQ.smartQ.controller;



import com.smartQ.smartQ.entity.Shop;
import com.smartQ.smartQ.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.saveShop(shop);
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @GetMapping("/{id}")
    public Optional<Shop> getShopById(@PathVariable Integer id) {
        return shopService.getShopById(id);
    }

    @GetMapping("/category/{category}")
    public List<Shop> getShopsByCategory(@PathVariable String category) {
        return shopService.getShopsByCategory(category);
    }

    @DeleteMapping("/{id}")
    public String deleteShop(@PathVariable Integer id) {
        shopService.deleteShop(id);
        return "Shop Deleted Successfully";
    }
}