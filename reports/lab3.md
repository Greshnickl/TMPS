### Behavioral Design Patterns
**Author:** Cusnir Grigorii, FAF - 221  

---

## Introduction

In this laboratory work, we focus on understanding and implementing a **Behavioral Design Pattern**. These patterns manage object communication, increasing flexibility and reuse.  

The **Command Pattern** was chosen for implementation, as it encapsulates requests as objects, enabling:
- Flexible execution of commands.
- Undo/redo functionality.
- Separation of concerns between the invoker, receiver, and client.

Additionally, utilities like logging and command history tracking were added to enhance system robustness and usability.2. Implementation & Explanation

The project implements a **Remote Control System** using the Command Pattern.  
The system is enhanced with:
- **Logger Utility:** Logs system actions and events.
- **CommandHistory Utility:** Tracks executed commands to support undo operations.
---

###  Implementation & Explanation

The project implements a **Remote Control System** using the Command Pattern.  
The system is enhanced with:
- **Logger Utility:** Logs system actions and events.
- **CommandHistory Utility:** Tracks executed commands to support undo operations.



### Code Snippets

#### Command Interface
Located in `domain/Command.java`. Defines the contract for commands.
```java
public interface Command {
    void execute();
    void undo();
}
```
#### Receiver (Light)
Located in domain/Light.java. Handles actual light operations.

```java
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
```


### Utilities
#### Logger Utility
Located in utilities/Logger.java. Logs system actions.
```java
public static void log(String message) {
    System.out.println("[" + LocalDateTime.now() + "] " + message);
}
```


#### CommandHistory Utility
Located in utilities/CommandHistory.java. Tracks command history.
```java
public Command pop() {
    return history.isEmpty() ? null : history.pop();
}
```
---

### Client
Located in client/Main.java. Demonstrates system functionality.
```java
Logger.log("Starting the system...");
remote.setCommand(lightOn);
remote.pressButton();
remote.pressUndo();
Logger.log("System terminated.");
```





### **Results**


#### Output
```java
[2024-11-28T14:30:12.123] Starting the system...
[2024-11-28T14:30:12.124] Command set: LightOnCommand
Light is ON
[2024-11-28T14:30:12.125] Executed command: LightOnCommand
Light is OFF
[2024-11-28T14:30:12.126] Undone command: LightOnCommand
[2024-11-28T14:30:12.127] System terminated.

```

### **Conclusion**

The Command Pattern was successfully implemented, along with logging and command history tracking utilities. These additions improve flexibility, maintainability, and user experience.

This approach can be extended to more complex systems requiring dynamic command execution and undoable operations.

