package com.backbase.trainer.service;

import com.backbase.trainer.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
