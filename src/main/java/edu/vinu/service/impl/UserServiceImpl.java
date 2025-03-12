/*
 * Copyright (c) 2025 vinuth sri arampath
 *
 * This code is the intellectual property of vinuth sri arampath and is protected under copyright law.
 * Unauthorized copying, modification, distribution, or use of this code, in whole or in part,
 * without prior written permission is strictly prohibited.
 *
 * Portions of this code may be generated with AI and modified by vinuth sri arampath
 * All rights reserved.
 *
 *
 */

package edu.vinu.service.impl;

import edu.vinu.entity.UserEntity;
import edu.vinu.model.User;
import edu.vinu.repository.UserRepository;
import edu.vinu.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final ModelMapper mapper;
    private final UserRepository userRepository;
    @Override
    public User getUserByEmail(String email) {
        UserEntity userEntity=userRepository.findByEmail(email);
        return mapper.map(userEntity, User.class);
    }

    @Override
    public boolean isUserExist(String email) {
        return userRepository.existsByEmail(email);
    }
}
