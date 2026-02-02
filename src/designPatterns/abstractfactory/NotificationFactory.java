package designPatterns.abstractfactory;

public interface NotificationFactory {
    NotificationSender createNotificationSender();
    ContentGenerator createContentGenerator();
}
