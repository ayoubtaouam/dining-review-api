package com.dinning_review.api.repositories;

import com.dinning_review.api.entities.DiningReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningReviewRepository extends JpaRepository<DiningReview, Long> {
}
