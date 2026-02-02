package designPatterns.abstractfactory;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}
