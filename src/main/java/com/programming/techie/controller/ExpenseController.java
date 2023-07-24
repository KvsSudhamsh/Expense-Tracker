package com.programming.techie.controller;

import com.programming.techie.model.Expense;
import com.programming.techie.model.ExpenseCategory;
import com.programming.techie.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")

public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService=expenseService;
    }
    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpense(){
        return ResponseEntity.ok(expenseService.getAllExpense());
    }
    public void getExpenseByName(){}
    public void deleteExpense(){}
}
