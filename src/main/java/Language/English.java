package Language;

public class English implements Language{
    @Override
    public String getNotificationMessage() {return "Notification content in English."; }

    @Override
    public String getErrorMessage() {
        return "Error content in English.";
    }
}
