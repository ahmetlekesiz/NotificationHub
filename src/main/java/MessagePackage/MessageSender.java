package MessagePackage;

import Company.Company;
import MessagePackage.MessagePackage;

public class MessageSender {

    public boolean checkBlackListed(Company company){
        if (company.isBlackListed()){
            System.out.println(company.getCompanyLanguage().getErrorMessage());
            return true;
        }else{
            return false;
        }
    }

    public void sendMessage(Company company, MessagePackage messagePackage) {
        if (checkBlackListed(company)) return;
        if (messagePackage.getCurrentMessageCount() < messagePackage.getPackageQuota()) {
            System.out.println(messagePackage.getMessageContent(company.getCompanyLanguage()));
            messagePackage.incrementMessageCount();
        } else {
            System.out.println(messagePackage.getMessageContent(company.getCompanyLanguage()));
            company.getCompanyInvoice().setAmount(company.getCompanyInvoice().getAmount() + messagePackage.getIncrementPrice());
            if (messagePackage.isFlexible()) messagePackage.setCurrentMessageCount(0);
            messagePackage.incrementMessageCount();
        }
    }
}
