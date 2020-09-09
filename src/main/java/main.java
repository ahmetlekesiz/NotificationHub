import Company.Company;
import Language.English;
import MessagePackage.SmsFixedQuota;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate deneme = LocalDate.now();
        System.out.println(deneme);

        Company Trendyol = new Company("Trendyol", new English());

        Trendyol.setSmsPackage(new SmsFixedQuota(Trendyol));

        Trendyol.sendSms();

        System.out.println("deneme");
    }
}
