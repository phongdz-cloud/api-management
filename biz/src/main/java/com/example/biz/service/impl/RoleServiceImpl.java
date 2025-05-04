package com.example.biz.service.impl;

import com.example.biz.service.IRoleService;
import com.example.core.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true)
public class RoleServiceImpl implements IRoleService {
    IRoleRepository iRoleRepository;


}
