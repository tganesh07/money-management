package money.manage.selffinance.expense;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    private ExpenseMapper mapper = Mappers.getMapper(ExpenseMapper.class);

    public List<Expense> getExpenses(){
        return expenseRepository.findAll();
    }

    public void addExpense(ExpenseRequest expenseRequest, String userId){
        Expense expense = mapper.requestToEntity(expenseRequest);
//        expense.setId(UUID.randomUUID().toString());
        expense.setUserId(userId);
        expense.setTotal(expense.getAmount() * expense.getQuantity());
        expenseRepository.save(expense);
    }
}
