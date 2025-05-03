package com.example.service.impl;

import com.example.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true)
public class UserServiceImpl implements IUserService {
    PasswordEncoder passwordEncoder;
}
