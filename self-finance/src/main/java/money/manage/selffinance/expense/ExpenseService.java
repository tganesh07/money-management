package money.manage.selffinance.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpenses(){
        System.out.println("Service...");
        return expenseRepository.findAll();
    }
}
