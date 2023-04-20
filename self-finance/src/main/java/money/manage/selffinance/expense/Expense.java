package money.manage.selffinance.expense;

import javax.persistence.*;

@Entity
@Table(name = "EXPENSES")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EXPENSE_DESC")
    private String expenseDescription;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "TOTAL")
    private Double total;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "USER_ID")
    private String userId;
}
