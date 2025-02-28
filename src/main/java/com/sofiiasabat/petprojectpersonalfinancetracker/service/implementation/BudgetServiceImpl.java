package com.sofiiasabat.petprojectpersonalfinancetracker.service.implementation;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.BudgetDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Category;
import com.sofiiasabat.petprojectpersonalfinancetracker.mapper.implementation.BudgetMapperImplementation;
import com.sofiiasabat.petprojectpersonalfinancetracker.repository.BudgetRepository;
import com.sofiiasabat.petprojectpersonalfinancetracker.service.BudgetService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BudgetServiceImpl implements BudgetService {

    private BudgetRepository budgetRepository;
    private BudgetMapperImplementation budgetMapperImplementation;

    public BudgetServiceImpl(BudgetRepository budgetRepository, BudgetMapperImplementation budgetMapperImplementation) {
        this.budgetRepository = budgetRepository;
        this.budgetMapperImplementation = budgetMapperImplementation;
    }

    @Override
    public void addBudget(Budget budget) {
        if (budget != null) {
            budgetRepository.save(budget);
        }
    }

    @Override
    public BudgetDTO getByCategory(Category category) {
        Optional<Budget> budgetByCategory = budgetRepository.findByCategory(category);

        if (budgetByCategory.isPresent()) {
            return budgetMapperImplementation.toBudgetDTO(budgetByCategory.get());
        }

        return null;
    }
}
