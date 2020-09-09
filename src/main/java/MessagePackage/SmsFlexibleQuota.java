package MessagePackage;

import Company.Company;
import Language.Language;

public class SmsFlexibleQuota extends MessagePackage{
    Language packageLanguage;
    final int packageQuota = 2000;
    final int packagePrice = 30;
    int currentMessageCount;
    final double incrementPrice = 0.1;
    final boolean isFlexible = true;
    Invoice packageInvoice;

    @Override
    public String getMessageContent(Language language) {
        return language.getNotificationMessage();
    }

    public SmsFlexibleQuota(Company company){
        this.currentMessageCount = 0;
        this.packageLanguage = company.getCompanyLanguage();
        this.packageInvoice = new Invoice();
        this.packageInvoice.setAmount(packagePrice);
    }

    @Override
    public double getIncrementPrice() {
        return incrementPrice;
    }

    @Override
    public Invoice getPackageInvoice() {
        return packageInvoice;
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
