package ex4_SWE_D;

import java.util.ArrayList;
import java.util.List;

public class WebsiteMonitor {
    private String monitor;
    private int checkInterval;
    private String lastContent;
    private List<User> subscribers;
    
    public WebsiteMonitor(String monitor, int checkInterval) {
        this.monitor = monitor;
        this.checkInterval = checkInterval;
        this.lastContent = "";
        this.subscribers = new ArrayList<>();
    }
    
    public boolean checkForUpdates(String url) {
        // In a real implementation, this would fetch content from the URL
        // For this example, we're simulating a content change
        String newContent = fetchContent(url);
        boolean hasChanged = compareContent(newContent);
        
        if (hasChanged) {
            updateLastContent(newContent);
            notifySubscribers(url);
            return true;
        }
        return false;
    }
    
    private String fetchContent(String url) {
        // Simulate fetching content from a website
        return "New content from " + url + " at " + System.currentTimeMillis();
    }
    
    public boolean compareContent(String newContent) {
        // Compare new content with last known content
        return !lastContent.equals(newContent);
    }
    
    public void updateLastContent(String content) {
        this.lastContent = content;
    }
    
    public void addSubscriber(User user) {
        subscribers.add(user);
    }
    
    private void notifySubscribers(String url) {
        for (User user : subscribers) {
            for (Subscription subscription : user.getSubscriptions()) {
                if (subscription.getWebsiteUrl().equals(url) && subscription.isActive()) {
                    Notification notification = generateNotification(url);
                    notification.sendNotification(user);
                    subscription.setLastCheckedTime(java.time.LocalDateTime.now());
                }
            }
        }
    }
    
    private Notification generateNotification(String url) {
        return new Notification("Website Update", "The website " + url + " has been updated!");
    }
    
    public String getMonitor() {
        return monitor;
    }
    
    public int getCheckInterval() {
        return checkInterval;
    }
    
    public String getLastContent() {
        return lastContent;
    }
}
