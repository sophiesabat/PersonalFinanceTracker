package com.sofiiasabat.petprojectpersonalfinancetracker.mapper;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.BudgetDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;

public interface BudgetMapper {

    BudgetDTO toBudgetDTO(Budget budget);
}
