package com.dinning_review.api.repositories;

import com.dinning_review.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByDisplayName(String name);
}
