package com.example.springboot;

import com.example.features.user.dtos.*;
import com.example.features.user.model.User;
import com.example.features.user.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("api/users")
public class HelloController {

    private final UserService userService = new UserService();

    @GetMapping("test")
    public String test() {
        return "Hello";
    }

    @GetMapping
    public Set<UserGetDto> getAllUsers() {
        return this.userService.getAllUser();
    }

    @GetMapping("{username}")
    public UserGetDto finUserByUsername(@PathVariable String username) {
        return this.userService.findUserByUsername(username);
    }

    @PostMapping
    public User addUser(@RequestBody @Valid UserPostDto userPostDto) {
        return this.userService.addUser(userPostDto);
    }

    @PutMapping("{username}")
    public User updateUser(@PathVariable String username, @Valid @RequestBody UserUpdateDto userUpdateDto) {
        return this.userService.updateUserByUsername(username, userUpdateDto);
    }

    @DeleteMapping("{username}")
    public User deleteUserByUsername(@PathVariable String username) {
        return userService.deleteUserByUsername(username);
    }
}