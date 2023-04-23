package money.manage.selffinance.expense;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExpenseRequest {
    private String item;
    private int amount;
    private int quantity;
    private String shop;
}
