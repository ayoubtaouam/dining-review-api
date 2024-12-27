package com.dinning_review.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor @ToString
public class DiningReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private User user;
    private Long id;
    private Restaurant restaurant;
    private double peanutScore;
    private double eggScore;
    private double dairyScore;
    private String commentary;
    private boolean status;
}
