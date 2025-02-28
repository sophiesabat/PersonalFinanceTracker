package com.sofiiasabat.petprojectpersonalfinancetracker.mapper;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;

public interface UserMapper {

    UserDTO toUserDTO(User user);
}
