package money.manage.selffinance.expense;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "EXPENSES")
@Data
public class Expense {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID")
    private String id;
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
