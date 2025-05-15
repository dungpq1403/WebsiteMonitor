package ex4_SWE_D;
import java.time.LocalDateTime;

public class Notification {
    private String notification;
    private String message;
    private LocalDateTime timeStamp;
    
    public Notification(String notification, String message) {
        this.notification = notification;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }
    
    public void sendNotification(User user) {
        user.receiveNotification(this);
        System.out.println("Notification sent to user: " + user.getName());
    }
    
    public String getNotification() {
        return notification;
    }
    
    public String getMessage() {
        return message;
    }
    
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
