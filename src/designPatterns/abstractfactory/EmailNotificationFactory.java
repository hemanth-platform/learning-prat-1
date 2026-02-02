package designPatterns.abstractfactory;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public NotificationSender createNotificationSender() {
        return new EmailSender();
    }

    @Override
    public ContentGenerator createContentGenerator() {
        return new EmailGeneration();
    }
}
