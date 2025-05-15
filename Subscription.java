package ex4_SWE_D;
import java.time.LocalDateTime;

public class Subscription {
    private int subscriptionId;
    private String websiteUrl;
    private Enum checkFreq;
    private boolean isActive;
    private LocalDateTime lastCheckedTime;
    private NotificationPreferences notificationPreferences;
    
    public Subscription(int subscriptionId, String websiteUrl, Enum checkFreq) {
        this.subscriptionId = subscriptionId;
        this.websiteUrl = websiteUrl;
        this.checkFreq = checkFreq;
        this.isActive = true;
        this.lastCheckedTime = LocalDateTime.now();
    }
    
    public void updateSubscription(String param) {
        // Implementation for updating subscription details
        System.out.println("Subscription updated: " + param);
    }
    
    public void setNotificationPreferences(NotificationPreferences notificationPreferences) {
        this.notificationPreferences = notificationPreferences;
    }
    
    public NotificationPreferences getNotificationPreferences() {
        return notificationPreferences;
    }
    
    public int getSubscriptionId() {
        return subscriptionId;
    }
    
    public String getWebsiteUrl() {
        return websiteUrl;
    }
    
    public Enum getCheckFreq() {
        return checkFreq;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean active) {
        isActive = active;
    }
    
    public LocalDateTime getLastCheckedTime() {
        return lastCheckedTime;
    }
    
    public void setLastCheckedTime(LocalDateTime lastCheckedTime) {
        this.lastCheckedTime = lastCheckedTime;
    }
}
