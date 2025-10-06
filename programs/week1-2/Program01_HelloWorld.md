# Program 1: Hello World & Basic Syntax

## Objective
Learn the basic structure of a Java program and display output on the console.

## Theory
Java is a high-level, object-oriented programming language. Every Java program must have:
1. A class definition
2. A main method (entry point of the program)
3. Proper syntax with semicolons and braces

## Code

```java
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
    }
}
```

## Sample Output
```
Hello, World!
Welcome to Java Programming!
Java is awesome!
Quote: "Programming is fun!"
Tab example:	Hello	World
Newline example:
Second Line
5 + 3 = 8
```

## Key Concepts
1. **Class Declaration**: `public class HelloWorld`
2. **Main Method**: Entry point of Java application
3. **System.out.println()**: Prints text and moves to next line
4. **System.out.print()**: Prints text without moving to next line
5. **Comments**: Single-line (//) and multi-line (/* */)
6. **Escape Sequences**: \", \t, \n, \\

## Exercises
1. Create a program that prints your name, roll number, and branch
2. Display a pattern using stars (*)
3. Create a simple ASCII art using print statements

## Common Errors
1. **Case sensitivity**: Java is case-sensitive (System vs system)
2. **Missing semicolon**: All statements must end with semicolon
3. **Missing braces**: Proper opening and closing of braces
4. **File name**: Must match class name exactly

## Compilation & Execution
```bash
javac HelloWorld.java
java HelloWorld
```