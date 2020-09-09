package MessagePackage;

import Company.Company;
import Language.Language;

public class EmailFixedQuota extends MessagePackage{
    Language packageLanguage;
    final int packageQuota = 1000;
    final int packagePrice = 10;
    int currentMessageCount;
    final boolean isFlexible = false;
    Invoice packageInvoice;

    @Override
    public String getMessageContent(Language language) {
        return language.getNotificationMessage();
    }

    public EmailFixedQuota(Company company){
        this.currentMessageCount = 0;
        this.packageLanguage = company.getCompanyLanguage();
        this.packageInvoice = new Invoice();
        this.packageInvoice.setAmount(packagePrice);
    }

    @Override
    public double getIncrementPrice() {
        return this.packagePrice;
    }

    @Override
    public Invoice getPackageInvoice() {
        return this.packageInvoice;
    }

    public void setPackageInvoice(Invoice packageInvoice) {
        this.packageInvoice = packageInvoice;
    }

    public int getCurrentMessageCount() {
        return this.currentMessageCount;
    }

    @Override
    public int getPackageQuota() {
        return packageQuota;
    }

    public void incrementMessageCount(){
        this.currentMessageCount++;
    }

    public void setCurrentMessageCount(int currentMessageCount) {
        this.currentMessageCount = currentMessageCount;
    }

    public boolean isFlexible() {
        return isFlexible;
    }

}
