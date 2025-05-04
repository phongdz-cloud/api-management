package com.example.app.controller;

import com.example.common.constants.ApiConstants;
import com.example.common.dto.PageResponse;
import com.example.common.dto.UserDto;
import com.example.biz.service.IUserService;
import com.example.common.dto.UserSearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ApiConstants.ENDPOINT_ADMIN)
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @GetMapping("/users/search")
    public ResponseEntity<PageResponse<UserDto>> findAll(
            @ModelAttribute UserSearchCriteria criteria,
            @PageableDefault Pageable pageable) {
        return ResponseEntity.ok(userService.findAll(pageable, criteria));
    }
}