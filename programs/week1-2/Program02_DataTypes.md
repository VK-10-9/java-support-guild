# Program 2: Data Types & Variables

## Objective
Understand different data types in Java and how to declare and use variables.

## Theory
Java has two categories of data types:
1. **Primitive Data Types**: byte, short, int, long, float, double, char, boolean
2. **Reference Data Types**: String, Arrays, Objects

## Code

```java
// DataTypes.java
public class DataTypes {
    public static void main(String[] args) {
        // Integer data types
        byte byteVar = 100;           // 8 bits, range: -128 to 127
        short shortVar = 32000;       // 16 bits, range: -32,768 to 32,767
        int intVar = 2147483647;      // 32 bits, range: -2^31 to 2^31-1
        long longVar = 9223372036854775807L; // 64 bits, note the 'L' suffix
        
        // Floating-point data types
        float floatVar = 3.14f;       // 32 bits, note the 'f' suffix
        double doubleVar = 3.141592653589793; // 64 bits, default for decimals
        
        // Character data type
        char charVar = 'A';           // 16 bits, Unicode character
        char charVar2 = 65;           // ASCII value of 'A'
        char charVar3 = '\u0041';     // Unicode representation of 'A'
        
        // Boolean data type
        boolean boolVar = true;       // Can be true or false
        boolean boolVar2 = false;
        
        // String (Reference type)
        String stringVar = "Hello, Java!";
        
        // Display all variables
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("char as number: " + (int)charVar);
        System.out.println("char from ASCII: " + charVar2);
        System.out.println("char from Unicode: " + charVar3);
        System.out.println("boolean value: " + boolVar);
        System.out.println("String value: " + stringVar);
        
        // Variable initialization and assignment
        System.out.println("\n=== Variable Operations ===");
        int num1, num2, sum;
        num1 = 10;
        num2 = 20;
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        
        // Constants (final keyword)
        final double PI = 3.14159;
        final int MAX_SIZE = 100;
        System.out.println("PI value: " + PI);
        System.out.println("Maximum size: " + MAX_SIZE);
        
        // Type conversion examples
        System.out.println("\n=== Type Conversion ===");
        
        // Implicit conversion (widening)
        int intNum = 100;
        double doubleNum = intNum;  // int to double
        System.out.println("int to double: " + intNum + " -> " + doubleNum);
        
        // Explicit conversion (narrowing)
        double pi = 3.14159;
        int piInt = (int) pi;  // double to int (loses decimal part)
        System.out.println("double to int: " + pi + " -> " + piInt);
        
        // Character conversions
        char letter = 'Z';
        int asciiValue = (int) letter;
        System.out.println("char to int: " + letter + " -> " + asciiValue);
        
        // String to number conversions
        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr);
        double parsedDouble = Double.parseDouble("45.67");
        System.out.println("String to int: " + numberStr + " -> " + parsedInt);
        System.out.println("String to double: \"45.67\" -> " + parsedDouble);
        
        // Number to string conversions
        int number = 456;
        String numberToStr = String.valueOf(number);
        String numberToStr2 = Integer.toString(number);
        System.out.println("int to String: " + number + " -> \"" + numberToStr + "\"");
        
        // Demonstrate variable scope
        {
            int localVar = 50;
            System.out.println("\nLocal variable in block: " + localVar);
        }
        // localVar is not accessible here
        
        // Size and range information
        System.out.println("\n=== Data Type Ranges ===");
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}
```

## Sample Output
```
=== Primitive Data Types ===
byte value: 100
short value: 32000
int value: 2147483647
long value: 9223372036854775807
float value: 3.14
double value: 3.141592653589793
char value: A
char as number: 65
char from ASCII: A
char from Unicode: A
boolean value: true
String value: Hello, Java!

=== Variable Operations ===
10 + 20 = 30
PI value: 3.14159
Maximum size: 100

=== Type Conversion ===
int to double: 100 -> 100.0
double to int: 3.14159 -> 3
char to int: Z -> 90
String to int: 123 -> 123
String to double: "45.67" -> 45.67
int to String: 456 -> "456"

Local variable in block: 50

=== Data Type Ranges ===
byte: -128 to 127
short: -32768 to 32767
int: -2147483648 to 2147483647
long: -9223372036854775808 to 9223372036854775807
float: 1.4E-45 to 3.4028235E38
double: 4.9E-324 to 1.7976931348623157E308
```

## Key Concepts
1. **Primitive vs Reference Types**
2. **Variable Declaration and Initialization**
3. **Type Conversion (Implicit and Explicit)**
4. **Constants using final keyword**
5. **Variable Scope**
6. **Wrapper Classes for type conversion**

## Important Notes
- Use 'L' suffix for long literals
- Use 'f' suffix for float literals
- char uses single quotes, String uses double quotes
- final variables cannot be reassigned
- Be careful with type conversion to avoid data loss

## Exercises
1. Create variables for student details (name, age, grade, percentage)
2. Perform temperature conversion (Celsius to Fahrenheit)
3. Calculate area of circle using final PI value
4. Demonstrate all types of type conversions