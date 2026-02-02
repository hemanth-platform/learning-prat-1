package designPatterns.factory;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternsMain {
    public static void main(String[] args) {
        Notification notification =
                NotificationFactory.getNotification("SMS");

        notification.send();

        //--Another way to use Factory Pattern--//

        NotificationFactoryInt factory = new EmailFactory();
        Notification notificationInt = factory.createNotification();
        notification.send();

        List<String> list = new ArrayList<>();
    }
}
