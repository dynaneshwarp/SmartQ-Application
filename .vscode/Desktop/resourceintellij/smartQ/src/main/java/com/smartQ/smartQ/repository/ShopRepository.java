package com.smartQ.smartQ.repository;



import com.smartQ.smartQ.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    List<Shop> findByCategory(String category);
}
