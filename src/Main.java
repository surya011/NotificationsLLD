import NotificationsProject.NotificationReceiver;
import NotificationsProject.Notification;
import  NotificationsProject.User;
import  Service.NotificationService;

public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Create notification service
        NotificationService notificationService = new NotificationService();

        // Register users with the notification service
        notificationService.registerReceiver(user1);
        notificationService.registerReceiver(user2);

        // Send a notification
        Notification notification = new Notification("Hello, world!");
        notificationService.sendNotification(notification);
    }
}