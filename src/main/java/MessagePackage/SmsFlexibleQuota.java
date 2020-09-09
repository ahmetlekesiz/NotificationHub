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
    MessagePackageInvoice packageMessagePackageInvoice;

    @Override
    public String getMessageContent(Language language) {
        return language.getNotificationMessage();
    }

    public SmsFlexibleQuota(Company company){
        this.currentMessageCount = 0;
        this.packageLanguage = company.getCompanyLanguage();
        this.packageMessagePackageInvoice = new MessagePackageInvoice();
        this.packageMessagePackageInvoice.setAmount(packagePrice);
    }

    @Override
    public double getIncrementPrice() {
        return incrementPrice;
    }

    @Override
    public MessagePackageInvoice getPackageInvoice() {
        return packageMessagePackageInvoice;
    }

    public void setPackageInvoice(MessagePackageInvoice packageMessagePackageInvoice) {
        this.packageMessagePackageInvoice = packageMessagePackageInvoice;
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
