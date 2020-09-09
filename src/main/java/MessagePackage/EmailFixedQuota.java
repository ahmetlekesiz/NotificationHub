package MessagePackage;

import Company.Company;
import Language.Language;

public class EmailFixedQuota extends MessagePackage{
    Language packageLanguage;
    final int packageQuota = 1000;
    final int packagePrice = 10;
    int currentMessageCount;
    final boolean isFlexible = false;
    MessagePackageInvoice packageMessagePackageInvoice;

    @Override
    public String getMessageContent(Language language) {
        return language.getNotificationMessage();
    }

    public EmailFixedQuota(Company company){
        this.currentMessageCount = 0;
        this.packageLanguage = company.getCompanyLanguage();
        this.packageMessagePackageInvoice = new MessagePackageInvoice();
        this.packageMessagePackageInvoice.setAmount(packagePrice);
    }

    @Override
    public double getIncrementPrice() {
        return this.packagePrice;
    }

    @Override
    public MessagePackageInvoice getPackageInvoice() {
        return this.packageMessagePackageInvoice;
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
