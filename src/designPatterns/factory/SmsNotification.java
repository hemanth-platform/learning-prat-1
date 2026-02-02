package designPatterns.factory;

class SmsNotification implements Notification {
    public void send() {
        System.out.println("SMS sent");
    }
}
