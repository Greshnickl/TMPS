### Structural Design Patterns
**Author:** Cusnir Grigorii, FAF - 221  

---

## Introduction

In this laboratory work, we implemented structural design patterns in a Java-based system for user authentication. The primary goal was to demonstrate the usage of the Adapter, Facade, and Decorator design patterns to improve the flexibility, scalability, and maintainability of the system. These patterns were selected to illustrate how they can simplify client interactions, adapt existing functionality to new interfaces, and add new responsibilities dynamically to the objects involved.

---

## Theory

### Structural Design Patterns

Structural design patterns are concerned with how classes and objects are composed to form larger structures. They simplify the design by identifying a simple way to realize relationships between entities. The patterns used in this project are:

1. **Adapter Pattern**: The Adapter pattern allows objects with incompatible interfaces to work together. In this case, it is used to adapt an OAuth authentication mechanism to the system's existing authentication interface.

2. **Facade Pattern**: The Facade pattern provides a simplified interface to a complex system of classes. We used this pattern to provide a clean API for user authentication and management, hiding the complexity behind it.

3. **Decorator Pattern**: The Decorator pattern allows us to add new behavior to objects dynamically. This pattern was used to extend the user authentication flow with additional responsibilities, like logging or monitoring.

---

## Implementation & Explanation

### 1. **Adapter Pattern**

We implemented an `OAuthAuthenticator` class for authenticating users via OAuth. However, the rest of the system expected a different interface for user authentication. The **Adapter pattern** was used to convert the `OAuthAuthenticator` class into a format that could be used with the existing authentication system.

The `Authenticator` interface represents the expected format for authenticating users, while the `OAuthAuthenticatorAdapter` class adapts the `OAuthAuthenticator` to this format.

#### Code Snippet:

```java
public interface Authenticator {
    boolean authenticate(String username, String password);
}

public class OAuthAuthenticatorAdapter implements Authenticator {
    private OAuthAuthenticator oauthAuthenticator;

    public OAuthAuthenticatorAdapter(OAuthAuthenticator oauthAuthenticator) {
        this.oauthAuthenticator = oauthAuthenticator;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return oauthAuthenticator.authenticateWithOAuth(username, password);
    }
}
```

### **Facade Pattern**

The `UserFacade` class simplifies the user authentication process by providing a high-level interface for logging in users and printing their information.
#### Code Snippet:

```java
public class UserFacade {
    private UserAuthenticator userAuthenticator;

    public UserFacade(UserAuthenticator userAuthenticator) {
        this.userAuthenticator = userAuthenticator;
    }

    public boolean loginUser(String username, String password) {
        return userAuthenticator.authenticateUser(username, password);
    }

    public void printUserInfo(User user) {
        System.out.println("Username: " + user.getUsername());
    }
}
```


### **Decorator Pattern**
The UserDecorator class extends the UserFacade class, allowing us to add additional responsibilities like logging or monitoring without changing the core functionality of the facade.

#### Code Snippet:

```java
public class UserDecorator {
    protected UserFacade userFacade;

    public UserDecorator(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    public boolean loginUser(String username, String password) {
        return userFacade.loginUser(username, password);
    }

    public void printUserInfo(User user) {
        userFacade.printUserInfo(user);
    }
}
```






### **Results**
The implementation successfully demonstrates the use of three design patterns. The system is now flexible, maintainable, and scalable, with easy integration of new features and changing requirements. The Adapter pattern allows for the integration of OAuth authentication, while the Facade pattern simplifies the authentication process. The Decorator pattern enables the addition of new functionalities without modifying existing code.

### **Example Output:**
When running the program, the following output is produced when the OAuthAuthenticator successfully authenticates a user:
```java
Authenticating john_doe with OAuth token...
Authentication successful for john_doe
Authentication Result (Valid Token): true
Authenticating john_doe with OAuth token...
Authentication failed for john_doe
Authentication Result (Invalid Token): false
```

### **Conclusion**

This laboratory work helped in understanding and applying the three structural design patterns. The integration of these patterns led to the following benefits:

- Flexibility: The system can now integrate with different authentication mechanisms (OAuth, database, etc.) through the Adapter pattern.
- Simplicity: The Facade pattern simplifies the client’s interaction with the authentication system.
- Extensibility: The Decorator pattern allows for easy addition of new functionalities dynamically without modifying the core classes.

These design patterns collectively improve the system’s scalability and maintainability, making it easier to extend and modify in the future.

