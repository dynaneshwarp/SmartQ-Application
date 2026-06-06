package com.smartQ.smartQ.controller;

import com.smartQ.smartQ.entity.Review;
import com.smartQ.smartQ.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable Integer id) {
        return reviewService.getReviewById(id);
    }

    @GetMapping("/shop/{shopId}")
    public List<Review> getReviewsByShop(@PathVariable Integer shopId) {
        return reviewService.getReviewsByShop(shopId);
    }

    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable Integer id) {
        reviewService.deleteReview(id);
        return "Review Deleted Successfully";
    }
}
