package com.sofiiasabat.petprojectpersonalfinancetracker.mapper.implementation;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.BudgetDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;
import com.sofiiasabat.petprojectpersonalfinancetracker.mapper.BudgetMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class BudgetMapperImplementation implements BudgetMapper {
    @Override
    public BudgetDTO toBudgetDTO(Budget budget) {
        if (budget == null) {
            return null;
        }

        BudgetDTO budgetDTO = new BudgetDTO();
        budgetDTO.setName(budget.getName());
        budgetDTO.setAmount(budget.getAmount());
        budgetDTO.setCategory(budget.getCategory());
        budgetDTO.setUser(budget.getUser());

        return budgetDTO;
    }
}
