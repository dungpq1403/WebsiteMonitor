package ex4_SWE_D;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private String phoneNum;
    private List<Subscription> subscriptions;
    
    public User(int userId, String name, String email, String phoneNum) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.subscriptions = new ArrayList<>();
    }
    
    public void updateProfile() {
        // Implementation for updating user profile
        System.out.println("Profile updated for user: " + name);
    }
    
    public void register() {
        // Implementation for user registration
        System.out.println("User registered: " + name);
    }
    
    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }
    
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }
    
    public void receiveNotification(Notification notification) {
        System.out.println("User " + name + " received notification: " + notification.getMessage());
    }
}
