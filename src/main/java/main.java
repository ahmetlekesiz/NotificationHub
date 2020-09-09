import Company.Company;
import Language.English;
import Language.Turkish;
import MessagePackage.EmailFlexibleQuota;
import MessagePackage.SmsFixedQuota;
import MessagePackage.SmsFlexibleQuota;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate deneme = LocalDate.now();
        System.out.println(deneme);

        Company Trendyol = new Company("Trendyol", new Turkish());

        Trendyol.setSmsPackage(new SmsFlexibleQuota(Trendyol));
        Trendyol.setEmailPackage(new EmailFlexibleQuota(Trendyol));

//        for (int i = 0; i < 2005; i++){
//            Trendyol.sendSms();
//            System.out.println(Trendyol.getSmsPackage().getPackageInvoice().getAmount());
//        }

        for (int i = 0; i < 2005; i++){
            Trendyol.sendEmail();
            System.out.println(Trendyol.getEmailPackage().getPackageInvoice().getAmount());
        }

    }
}
