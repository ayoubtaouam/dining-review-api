package com.dinning_review.api.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String displayName;
    private String city;
    private String state;
    private String zipCode;
    private boolean isInterestedPeanutAllergy;
    private boolean isInterestedEggAllergy;
    private boolean isInterestedDairyAllergy;
}
