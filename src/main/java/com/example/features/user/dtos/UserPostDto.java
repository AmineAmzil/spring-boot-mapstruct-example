package com.example.features.user.dtos;

import lombok.*;

import javax.validation.constraints.*;

@Data
@Builder
public class UserPostDto {

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotBlank
    private String username;

    @Email
    private String email;

    @NotBlank
    private String password;
}
