package MessagePackage;

import Language.Language;

public abstract class MessagePackage {
    Language packageLanguage;
    int packageQuota;
    int packagePrice;
    int currentMessageCount;
    double incrementPrice;
    boolean isFlexible;

    MessagePackageInvoice packageMessagePackageInvoice;

    public abstract String getMessageContent(Language language);

    public abstract void incrementMessageCount();

    public abstract int getPackageQuota();

    public int getPackagePrice() {
        return packagePrice;
    }

    public abstract int getCurrentMessageCount();

    public abstract void setCurrentMessageCount(int currentMessageCount);

    public abstract double getIncrementPrice();

    public abstract MessagePackageInvoice getPackageInvoice();

    public abstract boolean isFlexible();
}
