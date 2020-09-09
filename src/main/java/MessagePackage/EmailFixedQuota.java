package MessagePackage;

import Language.Language;

public class EmailFixedQuota {
    private Language packageLanguage;
    private final int packageQuota = 1000;
    private final int packagePrice = 10;

    private int currentMessageCount;

    public EmailFixedQuota(Language language){
        this.packageLanguage = language;
        this.currentMessageCount = 0;
    }

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


}
