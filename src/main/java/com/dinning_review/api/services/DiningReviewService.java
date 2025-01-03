package com.dinning_review.api.services;

import com.dinning_review.api.entities.DiningReview;
import com.dinning_review.api.repositories.DiningReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class DiningReviewService {
    private final DiningReviewRepository diningReviewRepository;
    private UserService userService;

    public boolean isUserExist(DiningReview review) {
        return userService.getUserByName(review.getUser().getDisplayName()) != null;
    }

    public DiningReview submit(DiningReview review) throws Exception {
        if(isUserExist(review)) {
            return diningReviewRepository.save(review);
        }
        throw new Exception("User not registered");
    }

    public List<DiningReview> getAllDiningReview() {
        return diningReviewRepository.findAll();
    }
}
