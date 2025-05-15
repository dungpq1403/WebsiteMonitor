# Website Monitor System Implementation

This repository contains a Java implementation of a website monitoring system based on the class diagram from Exercise 3 task 1. The system allows users to subscribe to website monitoring services, receive notifications about website updates, and manage their notification preferences.

## Project Structure

The implemented system consists of the following classes:

- **User**: Represents a user who can subscribe to website monitoring services
- **Subscription**: Represents a subscription to monitor a specific website
- **NotificationPreferences**: Stores user preferences for notifications
- **Notification**: Represents a notification sent to users
- **WebsiteMonitor**: Monitors websites for changes and sends notifications

## Coupling Metrics

The project includes an analysis of coupling metrics for each class:

| Class                   | Ca  | Ce  | Instability |
|-------------------------|-----|-----|------------|
| User                    | 2   | 2   | 0.50       |
| Subscription            | 1   | 1   | 0.50       |
| NotificationPreferences | 1   | 0   | 0.00       |
| Notification            | 1   | 1   | 0.50       |
| WebsiteMonitor          | 1   | 2   | 0.67       |

Where:
- **Ca** (Afferent Coupling): Number of classes outside a package that depend on classes within the package
- **Ce** (Efferent Coupling): Number of classes inside a package that depend on classes outside the package
- **Instability**: Ce / (Ce + Ca), ranges from 0 (maximally stable) to 1 (maximally unstable)

## Package Structure

Based on the coupling analysis, the following package structure is suggested:

```
com.websitemonitor
├── domain
│   ├── NotificationPreferences.java
│   ├── NotificationChannel.java
│   └── CheckFrequency.java
├── user
│   └── User.java
├── subscription
│   └── Subscription.java
├── notification
│   └── Notification.java
├── monitor
│   └── WebsiteMonitor.java
└── app
    └── Main.java
```

## Options to Reduce Coupling

Several design patterns and techniques can be applied to reduce coupling between packages:

1. **Interface Segregation**: Create interfaces for major components
2. **Dependency Injection**: Inject dependencies rather than creating them directly
3. **Observer Pattern**: Replace direct method calls with an observer mechanism
4. **Mediator Pattern**: Introduce mediators to handle communication between components
5. **DTOs**: Use Data Transfer Objects instead of directly exposing domain objects
6. **Facade Pattern**: Create facades for complex subsystems
7. **Event-Driven Architecture**: Use events instead of direct method calls

## How to Run

1. Clone the repository
2. Open in your favorite Java IDE
3. Run the Main.java file

## Future Improvements

- Implement persistent storage
- Add a user interface (web or desktop)
- Add authentication and authorization
- Implement actual website content fetching and comparison logic
- Add more sophisticated notification mechanisms
