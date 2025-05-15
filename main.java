package ex4_SWE_D;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User(1, "John Doe", "john@example.com", "123-456-7890");
        User user2 = new User(2, "Jane Smith", "jane@example.com", "987-654-3210");
        
        // Create website monitor
        WebsiteMonitor monitor = new WebsiteMonitor("WebMonitor", 60);
        
        // Add users as subscribers to the monitor
        monitor.addSubscriber(user1);
        monitor.addSubscriber(user2);
        
        // Create subscriptions
        Subscription sub1 = new Subscription(101, "https://example.com", CheckFrequency.HOURLY);
        Subscription sub2 = new Subscription(102, "https://blog.example.com", CheckFrequency.DAILY);
        
        // Create notification preferences
        NotificationPreferences pref1 = new NotificationPreferences("All Updates", NotificationChannel.EMAIL, true);
        NotificationPreferences pref2 = new NotificationPreferences("Important Updates", NotificationChannel.SMS, true);
        
        // Associate notification preferences with subscriptions
        sub1.setNotificationPreferences(pref1);
        sub2.setNotificationPreferences(pref2);
        
        // Add subscriptions to users
        user1.addSubscription(sub1);
        user2.addSubscription(sub2);
        
        // Simulate website updates
        System.out.println("Checking for updates...");
        boolean hasUpdates = monitor.checkForUpdates("https://example.com");
        System.out.println("Updates found: " + hasUpdates);
        
        // Calculate and display coupling metrics
        System.out.println("\n--- Coupling Metrics ---");
        displayCouplingMetrics();
    }
    
    // Helper method to calculate and display coupling metrics
    private static void displayCouplingMetrics() {
        List<String> classes = Arrays.asList("User", "Subscription", "NotificationPreferences", "Notification", "WebsiteMonitor");
        
        // Afferent coupling (Ca) - incoming dependencies
        int[] caValues = {2, 1, 1, 1, 1};
        
        // Efferent coupling (Ce) - outgoing dependencies
        int[] ceValues = {2, 1, 0, 1, 2};
        
        // Calculate instability for each class
        double[] instability = new double[classes.size()];
        for (int i = 0; i < classes.size(); i++) {
            instability[i] = (double) ceValues[i] / (ceValues[i] + caValues[i]);
        }
        
        // Display metrics
        System.out.println("Class\t\t\tCa\tCe\tInstability");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < classes.size(); i++) {
            System.out.printf("%-20s\t%d\t%d\t%.2f%n", classes.get(i), caValues[i], ceValues[i], instability[i]);
        }
    }
}

enum CheckFrequency {
    HOURLY,
    DAILY,
    WEEKLY,
    MONTHLY
}
