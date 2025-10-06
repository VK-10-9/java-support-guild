# Program 10: Classes & Objects

## Objective
Learn to create classes, objects, and understand the basic structure of object-oriented programming in Java.

## Theory
A **class** is a blueprint or template that defines the properties (attributes) and behaviors (methods) of objects. An **object** is an instance of a class that contains actual data and can perform actions.

### Key Concepts:
- **Class**: Blueprint for creating objects
- **Object**: Instance of a class
- **Attributes**: Variables that store data (fields)
- **Methods**: Functions that define behavior
- **Instance**: A specific occurrence of a class

## Code

```java
// Student.java
class Student {
    // Instance variables (attributes/fields)
    String name;
    int rollNumber;
    String branch;
    double marks;
    
    // Method to display student information
    void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Marks: " + marks);
    }
    
    // Method to calculate grade based on marks
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    // Method to check if student passed
    boolean hasPassed() {
        return marks >= 40;
    }
    
    // Method to update marks
    void updateMarks(double newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            marks = newMarks;
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
        }
    }
}

// Book class example
class Book {
    String title;
    String author;
    double price;
    int pages;
    
    void displayBookInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
    }
    
    void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discount = price * (percentage / 100);
            price = price - discount;
            System.out.println("Discount of " + percentage + "% applied.");
            System.out.println("New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
}

// Main class to test the above classes
public class ClassesObjects {
    public static void main(String[] args) {
        // Creating objects (instances) of Student class
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Setting values for student1
        student1.name = "Alice Johnson";
        student1.rollNumber = 101;
        student1.branch = "Computer Science";
        student1.marks = 85.5;
        
        // Setting values for student2
        student2.name = "Bob Smith";
        student2.rollNumber = 102;
        student2.branch = "Information Technology";
        student2.marks = 92.0;
        
        // Calling methods on objects
        student1.displayInfo();
        System.out.println("Grade: " + student1.calculateGrade());
        System.out.println("Passed: " + student1.hasPassed());
        
        System.out.println(); // Empty line for separation
        
        student2.displayInfo();
        System.out.println("Grade: " + student2.calculateGrade());
        System.out.println("Passed: " + student2.hasPassed());
        
        // Update marks for student1
        System.out.println("\n=== Updating Marks for " + student1.name + " ===");
        student1.updateMarks(78.0);
        System.out.println("New Grade: " + student1.calculateGrade());
        
        // Creating and using Book objects
        System.out.println("\n" + "=".repeat(40));
        
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 45.99;
        book1.pages = 500;
        
        Book book2 = new Book();
        book2.title = "Data Structures";
        book2.author = "Robert Sedgewick";
        book2.price = 55.00;
        book2.pages = 720;
        
        book1.displayBookInfo();
        book1.applyDiscount(15.0);
        
        System.out.println();
        
        book2.displayBookInfo();
        book2.applyDiscount(20.0);
        
        // Demonstrating multiple objects
        System.out.println("\n=== Creating Multiple Student Objects ===");
        
        Student[] students = new Student[3];
        
        // Creating array of students
        students[0] = new Student();
        students[0].name = "Charlie Brown";
        students[0].rollNumber = 103;
        students[0].branch = "Electronics";
        students[0].marks = 76.5;
        
        students[1] = new Student();
        students[1].name = "Diana Prince";
        students[1].rollNumber = 104;
        students[1].branch = "Mechanical";
        students[1].marks = 88.0;
        
        students[2] = new Student();
        students[2].name = "Edward Norton";
        students[2].rollNumber = 105;
        students[2].branch = "Civil";
        students[2].marks = 91.5;
        
        // Display all students
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
            System.out.println("Grade: " + students[i].calculateGrade());
            System.out.println();
        }
        
        // Demonstrate object reference
        System.out.println("=== Object Reference Example ===");
        Student originalStudent = student1;  // Both variables point to same object
        originalStudent.name = "Alice Cooper"; // Changes the same object
        
        System.out.println("student1 name: " + student1.name);  // Shows "Alice Cooper"
        System.out.println("originalStudent name: " + originalStudent.name);  // Same name
        System.out.println("Are they the same object? " + (student1 == originalStudent));
    }
}
```

## Sample Output
```
=== Student Information ===
Name: Alice Johnson
Roll Number: 101
Branch: Computer Science
Marks: 85.5
Grade: B
Passed: true

=== Student Information ===
Name: Bob Smith
Roll Number: 102
Branch: Information Technology
Marks: 92.0
Grade: A
Passed: true

=== Updating Marks for Alice Johnson ===
Marks updated successfully!
New Grade: C

========================================
=== Book Information ===
Title: Java Programming
Author: James Gosling
Price: $45.99
Pages: 500
Discount of 15.0% applied.
New price: $39.0915

=== Book Information ===
Title: Data Structures
Author: Robert Sedgewick
Price: $55.0
Pages: 720
Discount of 20.0% applied.
New price: $44.0

=== Creating Multiple Student Objects ===
=== Student Information ===
Name: Charlie Brown
Roll Number: 103
Branch: Electronics
Marks: 76.5
Grade: C

=== Student Information ===
Name: Diana Prince
Roll Number: 104
Branch: Mechanical
Marks: 88.0
Grade: B

=== Student Information ===
Name: Edward Norton
Roll Number: 105
Branch: Civil
Marks: 91.5
Grade: A

=== Object Reference Example ===
student1 name: Alice Cooper
originalStudent name: Alice Cooper
Are they the same object? true
```

## Key Concepts Explained

### 1. Class Definition
```java
class ClassName {
    // Instance variables (attributes)
    dataType variableName;
    
    // Methods (behavior)
    returnType methodName(parameters) {
        // method body
    }
}
```

### 2. Object Creation
```java
ClassName objectName = new ClassName();
```

### 3. Accessing Members
```java
objectName.variableName = value;    // Set attribute
objectName.methodName();            // Call method
```

### 4. Instance vs Class
- Each object has its own copy of instance variables
- Methods operate on the specific object's data
- Multiple objects can exist independently

## Important Notes
1. **Class names** should start with uppercase letter (PascalCase)
2. **Variable and method names** should start with lowercase (camelCase)
3. **Objects** are created using the `new` keyword
4. **Instance variables** have default values (0 for numbers, null for objects, false for boolean)
5. **Methods** can access and modify instance variables of the same object

## Exercises
1. Create a `Rectangle` class with length, width, and methods to calculate area and perimeter
2. Create a `BankAccount` class with account number, balance, deposit, and withdraw methods
3. Create a `Car` class with make, model, year, and methods to start, stop, and display info
4. Create multiple objects of each class and test all methods

## Common Mistakes
1. Forgetting to use `new` keyword when creating objects
2. Trying to access private members from outside the class
3. Not initializing object variables before using them
4. Confusing class names with object names