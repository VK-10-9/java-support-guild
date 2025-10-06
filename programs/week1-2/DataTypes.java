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
        
        // Exercise: Student details
        System.out.println("\n=== Exercise: Student Details ===");
        String studentName = "Alice Johnson";
        int age = 20;
        char grade = 'A';
        double percentage = 87.5;
        boolean isScholarship = true;
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Scholarship Eligible: " + isScholarship);
        
        // Temperature conversion exercise
        System.out.println("\n=== Temperature Conversion ===");
        double celsius = 25.0;
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        
        // Area calculation exercise
        System.out.println("\n=== Circle Area Calculation ===");
        final double PI_VALUE = 3.14159;
        double radius = 5.0;
        double area = PI_VALUE * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}