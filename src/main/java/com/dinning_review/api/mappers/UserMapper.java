package com.dinning_review.api.mappers;

import com.dinning_review.api.dtos.UserDto;
import com.dinning_review.api.entities.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component @AllArgsConstructor
public class UserMapper {
    private ModelMapper modelMapper;

    public void toUser(UserDto userDto, User user) {
        modelMapper.typeMap(UserDto.class, User.class).addMappings(mapper -> {
            mapper.skip(User::setId);
            mapper.skip(User::setDisplayName);
        });
        modelMapper.map(userDto, user);
    }
}
