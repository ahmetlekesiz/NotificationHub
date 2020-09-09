package MessagePackage;

import Language.Language;

public abstract class MessagePackage {
    Language packageLanguage;
    int packageQuota;
    int packagePrice;
    int currentMessageCount;
    double incrementPrice;
    boolean isFlexible;

    Invoice packageInvoice;

    public abstract String getMessageContent(Language language);

    public void incrementMessageCount(){
        this.currentMessageCount++;
    }

    public Language getPackageLanguage() {
        return packageLanguage;
    }

    public void setPackageLanguage(Language packageLanguage) {
        this.packageLanguage = packageLanguage;
    }

    public int getPackageQuota() {
        return packageQuota;
    }

    public int getPackagePrice() {
        return packagePrice;
    }

    public int getCurrentMessageCount() {
        return currentMessageCount;
    }

    public void setCurrentMessageCount(int currentMessageCount) {
        this.currentMessageCount = currentMessageCount;
    }

    public double getIncrementPrice() {
        return incrementPrice;
    }

    public void setIncrementPrice(double incrementPrice) {
        this.incrementPrice = incrementPrice;
    }

    public boolean isFlexible() {
        return isFlexible;
    }

    public void setFlexible(boolean flexible) {
        isFlexible = flexible;
    }

    public Invoice getPackageInvoice() {
        return packageInvoice;
    }

    public void setPackageInvoice(Invoice packageInvoice) {
        this.packageInvoice = packageInvoice;
    }

}
