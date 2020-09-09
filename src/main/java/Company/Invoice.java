package Company;

import java.time.LocalDate;
import java.util.Date;

public class Invoice {
    private LocalDate invoceDate;
    private double amount;


    public Invoice(){
        this.invoceDate = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }




}
