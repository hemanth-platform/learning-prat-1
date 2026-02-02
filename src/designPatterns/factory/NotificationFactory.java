package designPatterns.factory;

public class NotificationFactory {

    public static Notification getNotification(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}