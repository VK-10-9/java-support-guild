// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        // This is a single-line comment
        
        /* This is a 
           multi-line comment */
           
        // Print messages to console
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java Programming!");
        
        // Print without newline
        System.out.print("Java is ");
        System.out.print("awesome!");
        System.out.println(); // Just a newline
        
        // Using escape sequences
        System.out.println("Quote: \"Programming is fun!\"");
        System.out.println("Tab example:\tHello\tWorld");
        System.out.println("Newline example:\nSecond Line");
        
        // Basic arithmetic in print
        System.out.println("5 + 3 = " + (5 + 3));
        
        // Exercise: Display student information
        System.out.println("\n=== Student Information ===");
        System.out.println("Name: Your Name Here");
        System.out.println("Roll No: Your Roll Number");
        System.out.println("Branch: Computer Science");
        
        // Simple pattern
        System.out.println("\n=== Pattern ===");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}