package com.example.features.user.dtos;

import lombok.*;

import javax.validation.constraints.*;

@Data
@Builder
public class UserUpdateDto {

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @Email
    private String email;

    @NotBlank
    private String password;
}
