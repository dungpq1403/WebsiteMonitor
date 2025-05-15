package ex4_SWE_D;

public class NotificationPreferences {
    private String preference;
    private NotificationChannel channel;
    private boolean isEnabled;
    
    public NotificationPreferences(String preference, NotificationChannel channel, boolean isEnabled) {
        this.preference = preference;
        this.channel = channel;
        this.isEnabled = isEnabled;
    }
    
    public void updateChannel(NotificationChannel channel) {
        this.channel = channel;
        System.out.println("Notification channel updated to: " + channel);
    }
    
    public String getPreference() {
        return preference;
    }
    
    public void setPreference(String preference) {
        this.preference = preference;
    }
    
    public NotificationChannel getChannel() {
        return channel;
    }
    
    public boolean isEnabled() {
        return isEnabled;
    }
    
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}

enum NotificationChannel {
    EMAIL,
    SMS,
    PUSH
}
