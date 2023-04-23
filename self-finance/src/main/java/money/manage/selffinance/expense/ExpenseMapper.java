package money.manage.selffinance.expense;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    @Mapping(target = "expenseDescription", source = "item")
    @Mapping(target = "location", source = "shop")
    Expense requestToEntity(ExpenseRequest request);
}
