package com.smartQ.smartQ.sericeImpl;



import com.smartQ.smartQ.entity.Shop;
import com.smartQ.smartQ.repository.ShopRepository;
import com.smartQ.smartQ.service.ShopService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public Shop saveShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    @Override
    public Optional<Shop> getShopById(Integer id) {
        return shopRepository.findById(id);
    }

    @Override
    public List<Shop> getShopsByCategory(String category) {
        return shopRepository.findByCategory(category);
    }

    @Override
    public void deleteShop(Integer id) {
        shopRepository.deleteById(id);
    }
}