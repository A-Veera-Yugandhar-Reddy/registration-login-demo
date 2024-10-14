package com.test.registrationlogindemo.service;

import com.test.registrationlogindemo.dto.UserDto;
import com.test.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
