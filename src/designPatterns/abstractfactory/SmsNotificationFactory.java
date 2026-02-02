package designPatterns.abstractfactory;

public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public NotificationSender createNotificationSender() {
        return new SmsSender();
    }

    @Override
    public ContentGenerator createContentGenerator() {
        return new SmsGeneration();
    }
}
