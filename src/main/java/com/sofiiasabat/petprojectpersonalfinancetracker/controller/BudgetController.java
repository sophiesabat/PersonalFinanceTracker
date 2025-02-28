package com.sofiiasabat.petprojectpersonalfinancetracker.controller;

import com.sofiiasabat.petprojectpersonalfinancetracker.dto.BudgetDTO;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Budget;
import com.sofiiasabat.petprojectpersonalfinancetracker.entity.Category;
import com.sofiiasabat.petprojectpersonalfinancetracker.service.implementation.BudgetServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/budget")
public class BudgetController {

    private final BudgetServiceImpl budgetServiceImpl;

    public BudgetController(BudgetServiceImpl budgetServiceImpl) {
        this.budgetServiceImpl = budgetServiceImpl;
    }

    @PostMapping("/addBudget")
    public void addBudget(@RequestBody Budget budget) {
        budgetServiceImpl.addBudget(budget);
    }

    @GetMapping("/getBudgetByCategory")
    public ResponseEntity<BudgetDTO> getBudgetByCategory(@PathVariable Category category) {
        BudgetDTO budgetByCategory = budgetServiceImpl.getByCategory(category);

        return ResponseEntity.created(URI.create("/budgets/" + budgetByCategory.getCategory())).body(budgetByCategory);
    }
}
