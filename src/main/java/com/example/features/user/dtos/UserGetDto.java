package com.example.features.user.dtos;

import com.example.features.secret.dtos.SecretGetDto;
import lombok.*;

import java.util.Set;

@Builder
@Data
public class UserGetDto {

    private String firstname;

    private String lastname;

    private String username;

    private String email;

    private Set<SecretGetDto> secrets;

    private String createdAt;

    private String updatedAt;
}
