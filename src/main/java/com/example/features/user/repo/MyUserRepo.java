package com.example.features.user.repo;

import com.example.features.user.model.User;

import java.util.*;

public class MyUserRepo {

    private final HashMap<String, User> user_db = new HashMap<>();

    public User save(User user) {
        return this.user_db.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return user_db.get(username);
    }

    public User deleteUserByUsername(String username) {
        return user_db.remove(username);
    }

    public Set<User> findAll() {
        return new HashSet<>(this.user_db.values());
    }
}