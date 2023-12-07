package com.example.practice.controller;

import com.example.practice.Entity.User;
import com.example.practice.dto.UserRequestDto;
import com.example.practice.dto.UserResponseDto;
import com.example.practice.service.UserService;
import com.example.practice.Entity.User;
import com.example.practice.dto.UserRequestDto;
import com.example.practice.dto.UserResponseDto;
import com.example.practice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity create(@RequestBody UserRequestDto userDto) {
        log.info("create Users");
        User users = userService.create(userDto);
        return ResponseEntity.ok(new UserResponseDto(users));
    }

    @GetMapping("{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        log.info("readOne");
        User users = userService.readOne(id);
        return ResponseEntity.ok(new UserResponseDto(users));
    }
}
