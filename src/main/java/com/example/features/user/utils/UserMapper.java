package com.example.features.user.utils;

import com.example.common.DateTimeMapper;
import com.example.features.secret.utils.SecretMapper;
import com.example.features.user.dtos.*;
import com.example.features.user.model.User;
import org.mapstruct.*;

import java.util.*;

@Mapper(uses = {DateTimeMapper.class, SecretMapper.class})
public interface UserMapper {

    UserGetDto userToUserGetDto(User user);

    Set<UserGetDto> userCollectionToUserGetDtoSet(Collection<User> users);

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "secrets", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    User userFromUserPostDto(UserPostDto userPostDto);

    @Mappings(value = {
            @Mapping(target = "username", ignore = true)
    })
    User copy(@MappingTarget User targetUser, User SourceUser);

    @Mappings(value = {
            @Mapping(target = "username", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "secrets", ignore = true),
            @Mapping(target = "updatedAt", ignore = true)
    })
    User update(@MappingTarget User targetUser, UserUpdateDto SourceUser);
}
