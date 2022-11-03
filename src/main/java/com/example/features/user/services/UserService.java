package com.example.features.user.services;

import com.example.features.user.dtos.*;
import com.example.features.user.model.User;
import com.example.features.user.repo.MyUserRepo;
import com.example.features.user.utils.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    MyUserRepo userRepo = new MyUserRepo();

    UserMapper userMapper;

    public User addUser(UserPostDto userPostDto) {
        User user = userMapper.userFromUserPostDto(userPostDto);

        return this.userRepo.save(user);
    }

    public UserGetDto findUserByUsername(String username) {
        User rawUser = getRawUser(username);

        return userMapper.userToUserGetDto(rawUser);
    }

    public User deleteUserByUsername(String username) {

        getRawUser(username);

        return userRepo.deleteUserByUsername(username);
    }

    public Set<UserGetDto> getAllUser() {
        return userMapper.userCollectionToUserGetDtoSet(userRepo.findAll());
    }

    public User updateUserByUsername(String username, UserUpdateDto userUpdateDto) {

        User user = getRawUser(username);

        return userRepo.save(userMapper.update(user, userUpdateDto));
    }

    private User getRawUser(String username) {
        if (username == null) {
            return null;
        }

        return userRepo.findByUsername(username);
    }
}