package com.smartQ.smartQ.repository;

import com.smartQ.smartQ.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    List<Review> findByShopId(Integer shopId);
}
