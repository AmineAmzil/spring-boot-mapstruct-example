package com.example.features.secret.utils;

import com.example.common.DateTimeMapper;
import com.example.features.secret.dtos.*;
import com.example.features.secret.model.Secret;
import org.mapstruct.*;

import java.util.*;

@Mapper(uses = {DateTimeMapper.class})
public interface SecretMapper {

    @Mappings(value = {
            @Mapping(target = "secret", source = "text"),
            @Mapping(target = "createdDate", source = "createdAt"),
    })
    SecretGetDto secretToSecretGetDto(Secret secret);

    Set<SecretGetDto> secretCollectionToSecretGetDtoSet(Collection<Secret> secrets);

    Secret secretPostDtoToSecret(SecretPostDto secretPostDto);
}
