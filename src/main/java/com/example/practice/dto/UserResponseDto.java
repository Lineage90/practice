package com.example.practice.dto;

import com.example.practice.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private Long id;
    private String username;
    private String password;

    public UserResponseDto(User users) {
        this.id = users.getId();
        this.username = users.getUsername();
        this.password = users.getPassword();
    }

}
