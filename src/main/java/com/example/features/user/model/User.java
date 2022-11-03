package com.example.features.user.model;

import com.example.features.secret.model.Secret;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstname;

    private String lastname;

    private String username;

    private String email;

    private String password;

    private Set<Secret> secrets;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}