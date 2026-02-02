package designPatterns.factory;

class EmailFactory implements NotificationFactoryInt {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
