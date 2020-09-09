import Company.Company;
import Language.Turkish;
import MessagePackage.MessageSender;
import MessagePackage.SmsFixedQuota;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class MessageSenderTest {

    @Test
    public void blackListedTest() {
        Company testCompany = new Company("Trendyol", new Turkish());

        testCompany.setSmsPackage(new SmsFixedQuota(testCompany));
        testCompany.getSmsPackage().getPackageInvoice().setPaidBefore(true);
        testCompany.getSmsPackage().getPackageInvoice().setLastPaymentDate(LocalDate.parse("2018-08-16"));

        boolean resultOfMyFunction = testCompany.sendSms();

        Assert.assertFalse(resultOfMyFunction);
    }

}
