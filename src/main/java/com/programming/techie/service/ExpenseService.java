package com.programming.techie.service;

import com.programming.techie.model.Expense;
import com.programming.techie.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    }
    public void updateExpense(){}
    public void getAllExpense(){}
    public void getExpenseByName(){}
    public void deleteExpense(){}

}
