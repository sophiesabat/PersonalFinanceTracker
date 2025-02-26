package com.sofiiasabat.petprojectpersonalfinancetracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "isEnable")
    private boolean isEnable;

    @OneToMany(mappedBy = "user",)
    private Budget budget;

    public User(String name, String email, String password, boolean isEnable, Budget budget) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isEnable = isEnable;
        this.budget = budget;
    }
}
