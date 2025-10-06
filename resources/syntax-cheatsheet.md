# Java Syntax Cheat Sheet

## Basic Structure
```java
public class ClassName {
    public static void main(String[] args) {
        // Your code here
    }
}
```

## Data Types

### Primitive Types
| Type | Size | Range | Example |
|------|------|-------|---------|
| `byte` | 8 bits | -128 to 127 | `byte b = 100;` |
| `short` | 16 bits | -32,768 to 32,767 | `short s = 1000;` |
| `int` | 32 bits | -2³¹ to 2³¹-1 | `int i = 123456;` |
| `long` | 64 bits | -2⁶³ to 2⁶³-1 | `long l = 123456L;` |
| `float` | 32 bits | ~±3.4E-38 to ±3.4E+38 | `float f = 3.14f;` |
| `double` | 64 bits | ~±1.7E-308 to ±1.7E+308 | `double d = 3.14159;` |
| `char` | 16 bits | 0 to 65,535 | `char c = 'A';` |
| `boolean` | 1 bit | true or false | `boolean flag = true;` |

### Reference Types
```java
String text = "Hello World";
int[] array = {1, 2, 3, 4, 5};
Object obj = new Object();
```

## Operators

### Arithmetic Operators
```java
int a = 10, b = 3;
int sum = a + b;        // Addition: 13
int diff = a - b;       // Subtraction: 7
int product = a * b;    // Multiplication: 30
int quotient = a / b;   // Division: 3
int remainder = a % b;  // Modulus: 1
```

### Assignment Operators
```java
int x = 5;
x += 3;  // x = x + 3 (8)
x -= 2;  // x = x - 2 (6)
x *= 4;  // x = x * 4 (24)
x /= 3;  // x = x / 3 (8)
x %= 5;  // x = x % 5 (3)
```

### Comparison Operators
```java
int a = 10, b = 5;
boolean result;

result = (a == b);  // Equal to: false
result = (a != b);  // Not equal: true
result = (a > b);   // Greater than: true
result = (a < b);   // Less than: false
result = (a >= b);  // Greater than or equal: true
result = (a <= b);  // Less than or equal: false
```

### Logical Operators
```java
boolean x = true, y = false;

boolean and = x && y;   // Logical AND: false
boolean or = x || y;    // Logical OR: true
boolean not = !x;       // Logical NOT: false
```

### Increment/Decrement
```java
int i = 5;
i++;      // Post-increment: i becomes 6
++i;      // Pre-increment: i becomes 7
i--;      // Post-decrement: i becomes 6
--i;      // Pre-decrement: i becomes 5
```

## Control Structures

### If-Else
```java
if (condition) {
    // code if true
} else if (anotherCondition) {
    // code if another condition is true
} else {
    // code if all conditions are false
}
```

### Switch-Case
```java
switch (variable) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // default code
        break;
}
```

### Ternary Operator
```java
result = (condition) ? valueIfTrue : valueIfFalse;
```

## Loops

### For Loop
```java
for (int i = 0; i < 10; i++) {
    // code to repeat
}

// Enhanced for loop (for arrays/collections)
int[] array = {1, 2, 3, 4, 5};
for (int element : array) {
    System.out.println(element);
}
```

### While Loop
```java
while (condition) {
    // code to repeat
    // make sure condition eventually becomes false
}
```

### Do-While Loop
```java
do {
    // code to execute at least once
} while (condition);
```

## Arrays

### Declaration and Initialization
```java
// Declaration
int[] numbers;
String[] names;

// Initialization
numbers = new int[5];           // Array of 5 integers
names = new String[3];          // Array of 3 strings

// Declaration + Initialization
int[] values = {1, 2, 3, 4, 5};
String[] colors = {"red", "green", "blue"};

// Using new keyword with values
int[] scores = new int[]{85, 90, 78, 92};
```

### Array Operations
```java
int[] arr = new int[5];

// Set values
arr[0] = 10;
arr[1] = 20;

// Get values
int firstElement = arr[0];

// Array length
int length = arr.length;

// Loop through array
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Multidimensional Arrays
```java
// 2D Array
int[][] matrix = new int[3][4];  // 3 rows, 4 columns
int[][] table = {{1,2,3}, {4,5,6}, {7,8,9}};

// Access elements
matrix[0][0] = 1;
int value = table[1][2];  // Gets 6
```

## Methods

### Method Definition
```java
accessModifier returnType methodName(parameters) {
    // method body
    return value; // if returnType is not void
}
```

### Examples
```java
// Method with no parameters and no return value
public void printHello() {
    System.out.println("Hello!");
}

// Method with parameters and return value
public int add(int a, int b) {
    return a + b;
}

// Method with different access modifiers
private void privateMethod() { }
public void publicMethod() { }
protected void protectedMethod() { }
static void staticMethod() { }
```

### Method Overloading
```java
public int calculate(int a, int b) {
    return a + b;
}

public double calculate(double a, double b) {
    return a + b;
}

public int calculate(int a, int b, int c) {
    return a + b + c;
}
```

## Classes and Objects

### Class Definition
```java
public class ClassName {
    // Instance variables
    private int instanceVar;
    private String name;
    
    // Constructor
    public ClassName(int var, String n) {
        instanceVar = var;
        name = n;
    }
    
    // Methods
    public void setInstanceVar(int var) {
        instanceVar = var;
    }
    
    public int getInstanceVar() {
        return instanceVar;
    }
}
```

### Object Creation and Usage
```java
// Create object
ClassName obj = new ClassName(10, "Example");

// Call methods
obj.setInstanceVar(20);
int value = obj.getInstanceVar();
```

## String Operations

### String Creation
```java
String str1 = "Hello";
String str2 = new String("World");
String str3 = str1 + " " + str2;  // Concatenation
```

### Common String Methods
```java
String text = "Hello World";

int length = text.length();                    // 11
char ch = text.charAt(0);                      // 'H'
String upper = text.toUpperCase();             // "HELLO WORLD"
String lower = text.toLowerCase();             // "hello world"
String sub = text.substring(0, 5);             // "Hello"
boolean contains = text.contains("World");     // true
boolean starts = text.startsWith("Hello");     // true
boolean ends = text.endsWith("World");         // true
String replaced = text.replace("World", "Java"); // "Hello Java"
String[] parts = text.split(" ");             // ["Hello", "World"]
```

## Input/Output

### Output
```java
System.out.println("Text with newline");
System.out.print("Text without newline");
System.out.printf("Formatted: %d, %.2f, %s", 10, 3.14, "text");
```

### Input
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

String line = scanner.nextLine();      // Read entire line
String word = scanner.next();          // Read single word
int number = scanner.nextInt();        // Read integer
double decimal = scanner.nextDouble(); // Read double
char character = scanner.next().charAt(0); // Read character

scanner.close(); // Close scanner when done
```

## Exception Handling

### Try-Catch
```java
try {
    // Code that might throw exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Division by zero: " + e.getMessage());
} catch (Exception e) {
    System.out.println("General exception: " + e.getMessage());
} finally {
    // Code that always executes
    System.out.println("Cleanup code");
}
```

### Throw Exception
```java
public void checkAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}
```

## Common Java Conventions

### Naming Conventions
- **Classes**: PascalCase (`StudentRecord`, `BankAccount`)
- **Methods/Variables**: camelCase (`firstName`, `calculateTotal()`)
- **Constants**: UPPER_SNAKE_CASE (`MAX_SIZE`, `PI_VALUE`)
- **Packages**: lowercase (`com.example.project`)

### Code Style
```java
// Good spacing and indentation
public class Example {
    private int count = 0;
    
    public void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}
```

## Useful Built-in Classes

### Math Class
```java
double result;
result = Math.abs(-5);        // Absolute value: 5
result = Math.max(10, 20);    // Maximum: 20
result = Math.min(10, 20);    // Minimum: 10
result = Math.pow(2, 3);      // Power: 8
result = Math.sqrt(16);       // Square root: 4
result = Math.random();       // Random 0.0 to 1.0
```

### Wrapper Classes
```java
// Converting between primitives and objects
Integer intObj = Integer.valueOf(123);
int primitive = intObj.intValue();

// Parsing strings
int parsed = Integer.parseInt("123");
double parsedDouble = Double.parseDouble("3.14");

// Converting to strings
String str = Integer.toString(123);
String str2 = String.valueOf(456);
```

## Quick Reference Patterns

### Reading user input and processing
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.println("Hello, " + name + "!");
sc.close();
```

### Simple calculator
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers: ");
double a = sc.nextDouble();
double b = sc.nextDouble();
System.out.print("Enter operator (+, -, *, /): ");
char op = sc.next().charAt(0);

double result = 0;
switch (op) {
    case '+': result = a + b; break;
    case '-': result = a - b; break;
    case '*': result = a * b; break;
    case '/': result = a / b; break;
}
System.out.println("Result: " + result);
sc.close();
```

### Finding maximum in array
```java
int[] numbers = {3, 7, 1, 9, 4};
int max = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
System.out.println("Maximum: " + max);
```

---

**Remember**: Practice these concepts regularly and refer to this cheat sheet when coding!