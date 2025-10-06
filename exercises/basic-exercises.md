# Basic Programming Exercises

## Level 1: Fundamentals (Beginner)

### Exercise 1: Variable Practice
Write a program that demonstrates the use of all primitive data types in Java. Display their default values and perform basic operations.

**Requirements:**
- Declare variables of each primitive type
- Display their default values
- Perform arithmetic operations where applicable
- Show type casting examples

---

### Exercise 2: Simple Calculator
Create a calculator program that takes two numbers and an operator from user and displays result.

**Requirements:**
- Accept two numbers (double type)
- Accept operator (+, -, *, /, %)
- Display result with proper formatting
- Handle division by zero

**Sample Input/Output:**
```
Enter first number: 15.5
Enter operator (+, -, *, /, %): *
Enter second number: 2.5
Result: 15.5 * 2.5 = 38.75
```

---

### Exercise 3: Grade Calculator
Write a program that calculates letter grade based on percentage marks.

**Grading Scale:**
- A: 90-100%
- B: 80-89%
- C: 70-79%
- D: 60-69%
- F: Below 60%

**Requirements:**
- Accept percentage from user
- Validate input (0-100)
- Display letter grade
- Add appropriate messages

---

### Exercise 4: Number Pattern Programs
Write programs to print the following patterns:

**Pattern 1: Right Triangle**
```
*
**
***
****
*****
```

**Pattern 2: Number Triangle**
```
1
12
123
1234
12345
```

**Pattern 3: Pyramid**
```
    *
   ***
  *****
 *******
*********
```

---

### Exercise 5: Temperature Converter
Create a program that converts temperatures between Celsius, Fahrenheit, and Kelvin.

**Formulas:**
- Celsius to Fahrenheit: F = (C × 9/5) + 32
- Celsius to Kelvin: K = C + 273.15
- Fahrenheit to Celsius: C = (F - 32) × 5/9

**Requirements:**
- Menu-driven program
- Accept temperature and source unit
- Convert to all other units
- Display results with 2 decimal places

---

## Level 2: Control Structures (Beginner-Intermediate)

### Exercise 6: Prime Number Checker
Write a program to check if a given number is prime or not.

**Requirements:**
- Accept a positive integer
- Check if it's prime using efficient algorithm
- Display appropriate message
- Handle edge cases (1, 2, negative numbers)

---

### Exercise 7: Fibonacci Series
Generate Fibonacci series up to n terms or up to a maximum value.

**Requirements:**
- Accept number of terms OR maximum value
- Generate and display Fibonacci series
- Calculate sum of all Fibonacci numbers
- Find largest and smallest in the series

---

### Exercise 8: Palindrome Checker
Check if a given string or number is palindrome.

**Requirements:**
- Accept string or number from user
- Check if it reads same forwards and backwards
- Ignore spaces and case for strings
- Display result with explanation

---

### Exercise 9: Number Guessing Game
Create a number guessing game where computer generates random number.

**Requirements:**
- Computer generates random number (1-100)
- User has maximum 7 attempts
- Provide hints (too high/too low)
- Display attempts taken and score
- Option to play again

---

### Exercise 10: Menu-Driven Math Operations
Create a comprehensive menu-driven program for mathematical operations.

**Menu Options:**
1. Basic arithmetic (+, -, *, /, %)
2. Power and square root
3. Factorial calculation
4. Prime number check
5. Fibonacci series
6. GCD and LCM
7. Exit

---

## Level 3: Arrays and Strings (Intermediate)

### Exercise 11: Array Operations
Write a program that performs various operations on an integer array.

**Operations:**
- Accept array size and elements from user
- Find maximum, minimum, sum, average
- Search for an element (linear search)
- Sort array (bubble sort or selection sort)
- Reverse the array
- Remove duplicates

---

### Exercise 12: Matrix Operations
Implement basic matrix operations for 2D arrays.

**Operations:**
- Matrix addition and subtraction
- Matrix multiplication
- Matrix transpose
- Check if matrix is symmetric
- Find diagonal elements sum

---

### Exercise 13: String Manipulation
Create a comprehensive string processing program.

**Operations:**
- Count vowels, consonants, digits, special characters
- Reverse string word by word
- Check if string is palindrome
- Remove duplicate characters
- Find frequency of each character
- Convert case (upper/lower/title case)

---

### Exercise 14: Word Count Program
Analyze a text input for various statistics.

**Requirements:**
- Count total words, sentences, paragraphs
- Find longest and shortest words
- Count frequency of each word
- Display most frequent words
- Calculate average word length

---

### Exercise 15: Array Searching and Sorting
Implement different searching and sorting algorithms.

**Searching:**
- Linear search
- Binary search (on sorted array)

**Sorting:**
- Bubble sort
- Selection sort
- Insertion sort

**Requirements:**
- Compare performance (number of comparisons)
- Display step-by-step process
- Handle duplicate elements

---

## Level 4: Problem Solving (Intermediate-Advanced)

### Exercise 16: Student Record System
Create a simple student record management system using arrays.

**Features:**
- Store student data (name, roll no, marks in 3 subjects)
- Calculate total marks and percentage
- Assign grades based on percentage
- Find topper and class average
- Search student by roll number
- Display all students sorted by percentage

---

### Exercise 17: Banking System Simulation
Simulate basic banking operations.

**Operations:**
- Create account (name, account number, initial balance)
- Deposit money
- Withdraw money (check sufficient balance)
- Check balance
- Calculate interest (simple/compound)
- Display account statement

---

### Exercise 18: Library Management System
Create a simple library book management system.

**Features:**
- Book details (title, author, ISBN, availability)
- Add new books
- Search books by title/author
- Issue books (mark as unavailable)
- Return books (mark as available)
- Display available books

---

### Exercise 19: Tic-Tac-Toe Game
Implement a console-based Tic-Tac-Toe game.

**Features:**
- 3x3 game board
- Two player game (X and O)
- Check for win conditions
- Check for draw condition
- Display game board after each move
- Option to play multiple games

---

### Exercise 20: Inventory Management
Create an inventory management system for a small store.

**Features:**
- Product details (name, code, price, quantity)
- Add new products
- Update product details
- Search products by name/code
- Calculate total inventory value
- Generate low stock report
- Sales recording and profit calculation

---

## Programming Tips

### For Beginners:
1. **Start Simple**: Begin with exercises 1-5 to build confidence
2. **Understand Before Coding**: Read the problem multiple times
3. **Plan Your Solution**: Write pseudocode before actual code
4. **Test Thoroughly**: Try different inputs including edge cases
5. **Practice Regularly**: Solve at least one exercise daily

### For Better Problem Solving:
1. **Break Down Problems**: Divide complex problems into smaller parts
2. **Use Meaningful Names**: Choose descriptive variable and method names
3. **Add Comments**: Explain your logic for future reference
4. **Handle Errors**: Check for invalid inputs and edge cases
5. **Optimize Later**: First make it work, then make it better

### Common Patterns:
1. **Input Validation**: Always validate user input
2. **Menu-Driven Programs**: Use loops for repeated operations
3. **Array Processing**: Learn common patterns for array manipulation
4. **String Processing**: Master string methods and operations
5. **Mathematical Operations**: Practice number theory problems

---

## Sample Solutions Structure

### Basic Template:
```java
import java.util.Scanner;

public class ExerciseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input phase
        System.out.print("Enter input: ");
        // Get input from user
        
        // Processing phase
        // Perform calculations/operations
        
        // Output phase
        // Display results
        
        scanner.close();
    }
}
```

### Method-Based Template:
```java
import java.util.Scanner;

public class ExerciseName {
    
    // Method for input
    public static void getInput() {
        // Input logic
    }
    
    // Method for processing
    public static void processData() {
        // Processing logic
    }
    
    // Method for output
    public static void displayResults() {
        // Output logic
    }
    
    public static void main(String[] args) {
        getInput();
        processData();
        displayResults();
    }
}
```

---

**Remember**: The key to becoming good at programming is practice. Start with simpler exercises and gradually move to complex ones. Don't hesitate to look up syntax or methods, but try to understand the logic yourself!