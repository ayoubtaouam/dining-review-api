package com.dinning_review.api.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private String city;
    private String state;
    private String zipCode;
    private boolean isInterestedPeanutAllergy;
    private boolean isInterestedEggAllergy;
    private boolean isInterestedDairyAllergy;
}
