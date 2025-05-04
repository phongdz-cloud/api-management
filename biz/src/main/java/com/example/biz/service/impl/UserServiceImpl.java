package com.example.biz.service.impl;

import com.example.biz.mapper.UserMapper;
import com.example.biz.service.IUserService;
import com.example.common.dto.PageResponse;
import com.example.common.dto.UserDto;
import com.example.common.dto.UserSearchCriteria;
import com.example.core.repository.IUserRepository;
import com.example.core.specification.UserSpecification;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true)
public class UserServiceImpl implements IUserService {

    PasswordEncoder passwordEncoder;

    IUserRepository iUserRepository;

    UserMapper userMapper;

    @Override
    @Transactional
    public PageResponse<UserDto> findAll(Pageable pageable, UserSearchCriteria criteria) {
        Page<UserDto> users = iUserRepository.findAll(UserSpecification.build(criteria), pageable)
                .map(userMapper::toDto);
        return new PageResponse<>(users);
    }

}
