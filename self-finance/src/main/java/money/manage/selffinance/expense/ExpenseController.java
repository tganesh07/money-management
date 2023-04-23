package money.manage.selffinance.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/all")
    public List<Expense> getExpenses(){
        return expenseService.getExpenses();
    }

    @PostMapping
    public void addExpense(@RequestBody ExpenseRequest expenseRequest){
        expenseService.addExpense(expenseRequest, "Thulasi");
    }
}
