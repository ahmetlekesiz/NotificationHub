package MessagePackage;

import Language.Language;
import Company.Company;

public class SmsFixedQuota extends MessagePackage{

    Language packageLanguage;
    final int packageQuota = 1000;
    final int packagePrice = 100;
    int currentMessageCount;
    final double incrementPrice = 100;
    final boolean isFlexible = false;

    Invoice packageInvoice;

    @Override
    public String getMessageContent(Language language) {
        return language.getNotificationMessage();
    }

    public SmsFixedQuota(Company company){
        this.currentMessageCount = 0;
        this.packageLanguage = company.getCompanyLanguage();
        this.packageInvoice = new Invoice();
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
}
