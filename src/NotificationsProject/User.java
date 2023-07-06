package NotificationsProject;

import java.util.ArrayList;
import java.util.List;

public class User implements NotificationReceiver {
    private String username;
    private List<Notification> notifications;

    public User(String username){
        this.username = username;
        this.notifications = new ArrayList<>();
    }
    public String getUsername(){
        return username;
    }
    public List<Notification> getNotifications(){
        return notifications;
    }

    @Override
    public void receiveNotification(Notification notification){
        notifications.add(notification);
        System.out.println("Notifications recieved by user: "+username);
        System.out.println("Message "+notification.getMessage());
    }

}
