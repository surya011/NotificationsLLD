package Service;
import NotificationsProject.Notification;
import NotificationsProject.NotificationReceiver;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<NotificationReceiver> receivers;
    public NotificationService(){
        this.receivers = new ArrayList<>();
    }
    public void registerReceiver(NotificationReceiver receiver)
    {
        receivers.add(receiver);
    }
    public void sendNotification(Notification notification) {
        for (NotificationReceiver receiver : receivers) {
            receiver.receiveNotification(notification);
        }
    }

}
