package com.smartQ.smartQ.service;



import com.smartQ.smartQ.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    Review saveReview(Review review);

    List<Review> getAllReviews();

    List<Review> getReviewsByShop(Integer shopId);

    Optional<Review> getReviewById(Integer id);

    void deleteReview(Integer id);
}
