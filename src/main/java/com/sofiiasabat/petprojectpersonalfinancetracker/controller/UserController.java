package com.sofiiasabat.petprojectpersonalfinancetracker.controller;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;
import com.sofiiasabat.petprojectpersonalfinancetracker.mapper.UserMapper;
import com.sofiiasabat.petprojectpersonalfinancetracker.service.implementation.UserDetailsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserDetailsServiceImpl userDetailsServiceImpl;

    public UserController(UserDetailsServiceImpl userDetailsServiceImpl) {
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userDetailsServiceImpl.addUser(user);
    }

    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<UserDTO> findByEmail(@PathVariable String email) {

        UserDTO userDTO = userDetailsServiceImpl.findByEmail(email);

        return ResponseEntity.created(URI.create("/users/" + userDTO.getEmail())).body(userDTO);
    }

}
