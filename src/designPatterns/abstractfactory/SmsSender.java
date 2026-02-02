package designPatterns.abstractfactory;

public class SmsSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
