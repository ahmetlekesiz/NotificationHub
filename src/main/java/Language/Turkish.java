package Language;

public class Turkish implements Language{
    @Override
    public String getNotificationMessage() {
        return "Türkçe bildirim içeriğidir.";
    }

    @Override
    public String getErrorMessage() {
        return "Türkçe error içeriği.";
    }


}
