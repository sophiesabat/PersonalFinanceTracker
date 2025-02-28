package com.sofiiasabat.petprojectpersonalfinancetracker.service;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(User user);

    UserDTO getByEmail(String email);
}
