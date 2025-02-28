package com.sofiiasabat.petprojectpersonalfinancetracker.repository;

import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    @Override
    <S extends Budget> S save(S entity);

    Optional<Budget> findByCategory(Category category);
}
