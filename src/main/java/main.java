import Company.Company;
import Language.English;
import Language.Turkish;
import MessagePackage.SmsFixedQuota;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate deneme = LocalDate.now();
        System.out.println(deneme);

        Company Trendyol = new Company("Trendyol", new Turkish());

        Trendyol.setSmsPackage(new SmsFixedQuota(Trendyol));

        for (int i = 0; i < 10002; i++){
            Trendyol.sendSms();
        }


    }
}
