package O;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.notifyUser(new EmailNotification(), "Welcome to OCP!");
        service.notifyUser(new SmsNotification(), "OCP makes code flexible!");
    }
}
