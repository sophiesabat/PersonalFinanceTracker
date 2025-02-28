package com.sofiiasabat.petprojectpersonalfinancetracker.mapper.implementation;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;
import com.sofiiasabat.petprojectpersonalfinancetracker.mapper.UserMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class UserMapperImplementation implements UserMapper {
    @Override
    public UserDTO toUserDTO(User user) {
        if (user == null) {
            return null;
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setBudgets(user.getBudgets());
        userDTO.setTransactions(user.getTransactions());

        return userDTO;
    }
}
