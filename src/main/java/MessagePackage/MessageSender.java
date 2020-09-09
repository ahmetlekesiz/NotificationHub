package MessagePackage;

import Company.Company;
import MessagePackage.MessagePackage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MessageSender {

    public boolean checkBlackListed(Company company, MessagePackage messagePackage){
        LocalDate currentDate = LocalDate.now();

        long noOfDaysBetween;
        if(messagePackage.getPackageInvoice().isPaidBefore()){
            noOfDaysBetween = ChronoUnit.DAYS.between(messagePackage.getPackageInvoice().getLastPaymentDate(), messagePackage.getPackageInvoice().getRecordDate());
        }else{
            noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, messagePackage.getPackageInvoice().getRecordDate());
        }

        if (noOfDaysBetween > 30) company.setBlackListed(true);

        if (company.isBlackListed()){
            System.out.println(company.getCompanyLanguage().getErrorMessage());
            return true;
        }else{
            return false;
        }
    }

    public boolean sendMessage(Company company, MessagePackage messagePackage) {
        if (checkBlackListed(company, messagePackage)) return false;
        if (messagePackage.getCurrentMessageCount() < messagePackage.getPackageQuota()) {
            System.out.println(messagePackage.getMessageContent(company.getCompanyLanguage()));
            messagePackage.incrementMessageCount();
            return true;
        } else {
            System.out.println(messagePackage.getMessageContent(company.getCompanyLanguage()));
            messagePackage.getPackageInvoice().setAmount(messagePackage.getPackageInvoice().getAmount() + messagePackage.getIncrementPrice());
            if (!messagePackage.isFlexible()) messagePackage.setCurrentMessageCount(0);
            messagePackage.incrementMessageCount();
            return true;
        }
    }
}
