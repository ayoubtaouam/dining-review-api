package com.dinning_review.api.services;

import com.dinning_review.api.dtos.UserDto;
import com.dinning_review.api.entities.User;
import com.dinning_review.api.mappers.UserMapper;
import com.dinning_review.api.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service @AllArgsConstructor @Transactional
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User register(User user) throws Exception {
        if (userRepository.findByDisplayName(user.getDisplayName()) != null) {
            throw new Exception("User already exists.");
        }
        return userRepository.save(user);
    }

    public User modifyProfile(Long id, UserDto userDto) throws Exception {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            userMapper.toUser(userDto, user);
            return userRepository.save(user);
        }
        throw new Exception("User not found!");
    }

    public User getUserByName(String name) {
        return userRepository.findByDisplayName(name);
    }
}
