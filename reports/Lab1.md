### Creational Design Patterns  
**Author:** Cusnir Grigorii, FAF - 221  

---

### **Introduction:**

- Study and understand the Creational Design Patterns.
- Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
- Use some creational design patterns for object instantiation in a sample project.

---

### **Project Structure:**

![Alt text](/Images/structure.png)

--- 

### **Design Patterns Used:**
**Singleton**
The Singleton pattern ensures that only one instance of OrderProcessor exists. This instance is responsible for processing all orders, maintaining consistency, and controlling access.

![Alt text](/Images/singleton.png)

**Factory Method**
The Factory Method pattern is used to create various Product subclasses (like Electronics, Clothing, etc.) without specifying the exact class of each product in the client code. This makes it easy to add new product types in the future.

![Alt text](/Images/factory.png)

**Builder Method**
The Builder pattern is used for constructing an Order object. This pattern is ideal for complex objects with multiple fields, allowing the Order to be created step-by-step while managing optional fields or different configurations.

![Alt text](/Images/builder.png)



---

**Classes and Code Explanation**

- Product: Abstract base class for all product types. Each subclass (e.g., Electronics, Clothing) specifies unique properties and behavior.
- ProductFactory: Implements the Factory Method pattern, allowing for the creation of different Product instances based on type.
- Order: Represents a customer order containing multiple products. Uses the Builder pattern for flexible and modular order creation.
- OrderProcessor: Singleton class that processes orders and ensures consistency in handling order processing.



### **Conclusion**

This project demonstrates the effective use of the Singleton, Factory Method, and Builder patterns within an e-commerce domain. By managing object creation in a controlled way, it reduces complexity and improves code organization. Each pattern plays a specific role, making the system flexible and easier to extend.

