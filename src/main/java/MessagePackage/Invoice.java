package MessagePackage;

import java.time.LocalDate;
import java.util.Date;

public class Invoice {

    private LocalDate recordDate;
    private LocalDate lastPaymentDate;
    private boolean isPaidBefore;
    private double amount;

    public Invoice(){
        this.recordDate = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void makePayment(){
        this.amount = 0;
        lastPaymentDate = LocalDate.now();
        isPaidBefore = false;
        isPaidBefore = true;
    }

    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public boolean isPaidBefore() {
        return isPaidBefore;
    }

    public void setPaidBefore(boolean paidBefore) {
        isPaidBefore = paidBefore;
    }

}
