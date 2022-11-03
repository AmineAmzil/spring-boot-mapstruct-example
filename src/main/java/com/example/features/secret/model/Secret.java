package com.example.features.secret.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Secret {

    private String text;

    private LocalDateTime createdAt;
}
