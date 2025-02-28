package com.sofiiasabat.petprojectpersonalfinancetracker.controller;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.UserDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.User;
import com.sofiiasabat.petprojectpersonalfinancetracker.service.implementation.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userDetailsServiceImpl;

    public UserController(UserServiceImpl userDetailsServiceImpl) {
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userDetailsServiceImpl.addUser(user);
    }

    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<UserDTO> getByEmail(@PathVariable String email) {
        UserDTO userDTO = userDetailsServiceImpl.getByEmail(email);

        return ResponseEntity.created(URI.create("/users/" + userDTO.getEmail())).body(userDTO);
    }

}
