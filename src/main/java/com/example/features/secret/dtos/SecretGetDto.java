package com.example.features.secret.dtos;

import lombok.*;

@Data
@Builder
public class SecretGetDto {

    String secret;

    String createdDate;
}
