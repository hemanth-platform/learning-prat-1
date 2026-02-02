package designPatterns.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args){
        NotificationFactory notificationFactory = new EmailNotificationFactory();
        ContentGenerator contentGenerator = notificationFactory.createContentGenerator();
        NotificationSender notificationSender = notificationFactory.createNotificationSender();
        String content = contentGenerator.generateContent("Welcome to our service!");
        notificationSender.sendNotification(content);

        // Create SMS Notification
        NotificationFactory smsFactory = new SmsNotificationFactory();
        NotificationSender smsSender = smsFactory.createNotificationSender();
        ContentGenerator smsContentGenerator = smsFactory.createContentGenerator();
        String smsContent = smsContentGenerator.generateContent("Hello via SMS!");
        smsSender.sendNotification(smsContent);
    }
}
