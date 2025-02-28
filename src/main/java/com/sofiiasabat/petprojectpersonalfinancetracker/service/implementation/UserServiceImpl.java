package com.sofiiasabat.petprojectpersonalfinancetracker.service.implementation;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;
import com.sofiiasabat.petprojectpersonalfinancetracker.mapper.implementation.UserMapperImplementation;
import com.sofiiasabat.petprojectpersonalfinancetracker.repository.UserRepository;
import com.sofiiasabat.petprojectpersonalfinancetracker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapperImplementation userMapperImplementation;

    public UserServiceImpl(UserRepository userRepository, UserMapperImplementation userMapperImplementation) {
        this.userRepository = userRepository;
        this.userMapperImplementation = userMapperImplementation;
    }

    @Override
    public void addUser(User user) {
        if (user != null) {
            userRepository.save(user);
        }
    }

    @Override
    public UserDTO getByEmail(String email) {

        Optional<User> userByEmail = userRepository.findByEmail(email);
        if (userByEmail.isPresent()) {
            return userMapperImplementation.toUserDTO(userByEmail.get());
        }
        return null;
    }
}
