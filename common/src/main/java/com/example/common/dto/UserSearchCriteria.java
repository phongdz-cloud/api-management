package com.example.common.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserSearchCriteria {

    String username;

    String email;

    LocalDateTime createdAtFrom;

    LocalDateTime createdAtTo;
}
