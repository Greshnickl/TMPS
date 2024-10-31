### SOLID Principles Report  
**Author:** Cusnir Grigorii, FAF - 221  

---

### **Project Overview**

This project demonstrates the application of two SOLID principles: Single Responsibility Principle (SRP) and Open/Closed Principle (OCP), using a book management system. The system allows users to manage a collection of books and generate reports in different formats.

---

### **Code Structure**
The project consists of the following classes:

- Book
- ReportGenerator (Interface)
- PlainTextReportGenerator
- JsonReportGenerator
- Main

---

**Book**

Responsibility: Represents a book with a title and an author.

![Alt text](/images/book0.png)


**ReportGenerator Interface**

Responsibility: Defines a contract for generating reports. Classes implementing this interface can produce different report formats.

![Alt text](/images/report0.png)

**PlainTextReportGenerator Class**

Responsibility: Generates a plain text report of the books.

![Alt text](/images/plain0.png)

**JsonReportGenerator Class**

Responsibility: Generates a JSON-style report of the books.

![Alt text](/images/json0.png)

**Main Class**

Responsibility: Contains the main method to demonstrate the functionality of the book management system and report generation.

![Alt text](/images/main0.png)


---

### **SOLID Principles Implementation**


- Single Responsibility Principle (SRP):

- - Each class has a single responsibility:
- - The Book class manages book attributes.
- - The PlainTextReportGenerator and JsonReportGenerator classes focus solely on report generation.

- Open/Closed Principle (OCP):

- - The ReportGenerator interface allows for the addition of new report formats without modifying existing classes. For example, to add an XML report generator, one would create a new class implementing the ReportGenerator interface.

---
### **Conclusion**

This project effectively demonstrates the application of the SRP and OCP principles, leading to a clean, maintainable, and extensible codebase. By adhering to these principles, future modifications and additions can be implemented with minimal disruption to existing functionality.
