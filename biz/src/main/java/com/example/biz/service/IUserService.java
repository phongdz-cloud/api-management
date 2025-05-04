package com.example.biz.service;

import com.example.common.dto.PageResponse;
import com.example.common.dto.UserDto;
import com.example.common.dto.UserSearchCriteria;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    PageResponse<UserDto> findAll(Pageable pageable, UserSearchCriteria criteria);
}
