package com.example.practice.service;

import com.example.practice.Entity.User;
import com.example.practice.dto.UserRequestDto;
import com.example.practice.repostitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User create(UserRequestDto userDto) {

        User user = User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .build();

        return userRepository.save(user);
    }

    public User readOne(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
