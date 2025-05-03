package com.example.service.impl;

import com.example.core.repository.IRoleRepository;
import com.example.service.IRoleService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true)
public class RoleServiceImpl implements IRoleService {
    IRoleRepository iRoleRepository;


}
