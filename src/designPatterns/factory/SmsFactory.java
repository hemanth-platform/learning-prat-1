package designPatterns.factory;

class SmsFactory implements NotificationFactoryInt {
    public Notification createNotification() {
        return new SmsNotification();
    }
}
