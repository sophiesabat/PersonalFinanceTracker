package com.sofiiasabat.petprojectpersonalfinancetracker.entity;

import com.sofiiasabat.petprojectpersonalfinancetracker.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal sum;
    private TransactionType type;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Transaction(BigDecimal sum, TransactionType type, Category category, LocalDateTime dateTime, User user) {
        this.sum = sum;
        this.type = type;
        this.category = category;
        this.dateTime = dateTime;
        this.user = user;
    }
}
