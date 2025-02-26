package com.sofiiasabat.petprojectpersonalfinancetracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;

    private Category category;
    
    private User user;

    public Budget(BigDecimal amount, Category category, User user) {
        this.amount = amount;
        this.category = category;
        this.user = user;
    }
}
