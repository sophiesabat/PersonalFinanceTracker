package com.sofiiasabat.petprojectpersonalfinancetracker.service;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.BudgetDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Category;
import org.springframework.stereotype.Service;

@Service
public interface BudgetService {

    void addBudget(Budget budget);

    BudgetDTO getByCategory(Category category);
}
