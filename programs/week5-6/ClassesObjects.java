// ClassesObjects.java
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

// Exercise classes
class Rectangle {
    double length;
    double width;
    
    double calculateArea() {
        return length * width;
    }
    
    double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    void displayInfo() {
        System.out.println("=== Rectangle Information ===");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
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
        System.out.println("\n========================================");
        
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 45.99;
        book1.pages = 500;
        
        book1.displayBookInfo();
        book1.applyDiscount(15.0);
        
        // Exercise: Rectangle class
        System.out.println("\n=== Rectangle Exercise ===");
        Rectangle rect1 = new Rectangle();
        rect1.length = 10.0;
        rect1.width = 5.0;
        rect1.displayInfo();
        
        // Exercise: BankAccount class
        System.out.println("\n=== Bank Account Exercise ===");
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "123456789";
        account1.accountHolderName = "John Doe";
        account1.balance = 1000.0;
        
        account1.displayAccountInfo();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayAccountInfo();
        
        // Demonstrate object reference
        System.out.println("\n=== Object Reference Example ===");
        Student originalStudent = student1;  // Both variables point to same object
        originalStudent.name = "Alice Cooper"; // Changes the same object
        
        System.out.println("student1 name: " + student1.name);  // Shows "Alice Cooper"
        System.out.println("originalStudent name: " + originalStudent.name);  // Same name
        System.out.println("Are they the same object? " + (student1 == originalStudent));
    }
}