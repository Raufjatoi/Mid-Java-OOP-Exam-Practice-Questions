# Mid-Java OOP Exam Practice Questions

## Introduction to Java & OOP: 

### 1. Explain the benefits of object-oriented programming (OOP) compared to procedural programming .    
#### Ans : Object-oriented programming (OOP) is better than procedural programming because it makes code reusable, easier to manage, more secure, and flexible. This helps in creating and maintaining larger, more complex programs efficiently.

### 2. Briefly describe the key concepts of OOP: classes, objects, inheritance, polymorphism, and encapsulation.    
#### Ans :
#### **Classes**: Blueprints for creating objects, defining their attributes and behaviors. Classes help organize and structure code efficiently.

#### **Objects**: Instances of classes, representing specific elements with unique data. Objects interact to perform functions in a program.

#### **Inheritance**: Allows a class to inherit traits and behaviors from another class, promoting code reuse and reducing redundancy.

#### **Polymorphism**: Enables methods to perform different tasks based on the object calling them, enhancing flexibility and functionality.

#### **Encapsulation**: Hides internal data of objects, exposing only necessary parts through methods. This improves security and data integrity.    

### 3. What is the difference between a compiled and interpreted language? How does Java fit into this classification?
#### Ans : Compiled languages translate code into machine language before execution, while interpreted languages execute code line-by-line. Java combines both: it compiles to bytecode, which is then interpreted by the Java Virtual Machine (JVM).

## Basics of Java & Programming:

### 4. Define and give examples of primitive data types in Java (int, double, char, etc.).
#### Ans : 
#### **int**: Represents integers (32 bits). Example: `int age = 25;` It is used for storing whole numbers.

#### **double**: Represents double-precision floating-point numbers (64 bits). Example: `double temperature = 98.6;` It is used for precise decimal values.

#### **char**: Represents single characters (16 bits). Example: `char grade = 'A';` It is used to store individual letters or symbols.

#### **boolean**: Represents true or false values (1 bit, but size is JVM-dependent). Example: `boolean isRaining = false;` It is used for binary conditions.

#### **byte**: Represents small integers (8 bits). Example: `byte level = 12;` It is used for memory-efficient storage of small numbers.

#### **short**: Represents short integers (16 bits). Example: `short distance = 1500;` It is used when memory savings are necessary.

#### **long**: Represents long integers (64 bits). Example: `long population = 7830000000L;` It is used for very large integer values.

#### **float**: Represents single-precision floating-point numbers (32 bits). Example: `float price = 19.99f;` It is used for storing fractional numbers with less precision than double.

### 5. Write Java code to declare variables of different data types and initialize them with appropriate values.
#### Ans : 
```java
public class DataTypeExample {
public static void main(String[] args) {
// integer types
int age = 25; // 32-bit integer
byte level = 12; // 8-bit integer
short distance = 1500; // 16-bit integer
long population = 7830000000L; // 64-bit integer

// floating-point types
float price = 19.99f; // 32-bit floating-point
double temperature = 98.6; // 64-bit floating-point
    
// character type
char grade = 'A'; // 16-bit Unicode character
    
// boolean type
boolean isRaining = false; // true or false value

// printin the variables
Sout+tab("Age: " + age);
Sout+tab("Level: " + level);
Sout+tab("Distance: " + distance);
Sout+tab("Population: " + population);
Sout+tab("Price: " + price);
Sout+tab("Temperature: " + temperature);
Sout+tab("Grade: " + grade);
Sout+tab("Is it raining? " + isRaining);
}
}
```

### 6. Explain the difference between the = and == operators in Java. When to use each? 
#### Ans : 
#### **=**: Assignment operator sets a variable's value.  
#### **==**: Comparison operator checks if two values are equal.
#### We use = for assignment, == for comparison.

### 7. Write a Java program to calculate the area and perimeter of a rectangle given its length and width as input.
#### Ans : 
```java
import java.util.Scanner;

public class Rectangle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter length of the rectangle: ");
double length = scanner.nextDouble();
    
System.out.print("Enter width of the rectangle: ");
double width = scanner.nextDouble();
    
double area = length * width;
double perimeter = 2 * (length + width);
    
System.out.println("Area of the rectangle: " + area);
System.out.println("Perimeter of the rectangle: " + perimeter);
    
scanner.close();
}
}
```

### 8. Explain the concept of a loop (for, while, do-while) and its use cases.
#### Ans : In Java, loops repeat blocks of code based on conditions:

#### **for**: Executes a block a fixed number of times.

#### **while**: Repeats until a condition is false.

####  **do-while**: Runs at least once, then repeats while a condition is true.

### 9. Write a Java program to print the first n natural numbers (1 to n) using a for loop
#### Ans : 
```java
public class PrintNaturalNumbers {
public static void main(String[] args) {
int n = 10; // change n to whatever ya like i chose 10

System.out.println("First " + n + " natural numbers:");
for (int i = 1; i <= n; i++) {
    System.out.print(i + " ");
    }
}
}
```

### 10. Write a Java program to check if a given number is even or odd using an if-else statement.
#### Ans : 
```java
import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();
    
if (number % 2 == 0) {
    System.out.println(number + " is even.");
} else {
    System.out.println(number + " is odd.");
}
    
scanner.close();
}
}
```
## Variables, Operators, Loops:

### 11. Explain the difference between pre-increment (++, -- before variable) and post-increment (++, -- after variable) operators.
#### Ans :  Pre-increment (++variable) increases the variable's value before using it in an expression. Post-increment (variable++) uses the variable's current value in an expression before increasing it.
```java
int a = 5;
int b = ++a;  // Increment 'a' first, then assign to 'b'
System.out.println("a: " + a);  // Output: a: 6
System.out.println("b: " + b);  // Output: b: 6

int x = 10;
int y = x++;  // Assign 'x' to 'y' first, then increment 'x'
System.out.println("x: " + x);  // Output: x: 11
System.out.println("y: " + y);  // Output: y: 10
```

### 12. Write a Java program to swap the values of two variables without using a temporary variable.
#### Ans: 
``` java 
public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
```
### 13. Explain the concept of a nested loop and provide a real-world example of its use.
#### Ans : A nested loop is a loop inside another loop. It's used to iterate through elements of arrays, matrices, or perform tasks requiring multiple iterations, like printing a calendar or generating matrices in programming.

### 14. Write a Java program to print a multiplication table for a given number
#### Ans : 
``` java 
public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 7; // Change this number to generate a table for a different number

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
```

## for loop, while loop, foreach loop, do while loop:

### 15. Differentiate between for loop, while loop, and do-while loop with their syntax and use cases. 
#### Ans : 
#### - **For loop**: Iterates through a sequence with a set number of iterations, controlled by initialization, condition, and increment/decrement. Used for iterating over arrays or fixed ranges.
  ```java
  for (int i = 0; i < n; i++) { // Code block }
  ```

#### - **While loop**: Repeats a block of code while a specified condition is true. Used when the number of iterations is not known beforehand.
  ```java
  while (condition) { // Code block }
  ```

#### - **Do-while loop**: Executes a block of code once before checking if the condition is true, then repeats the loop as long as the condition is true. Ensures the code block runs at least once.
  ```java
  do { // Code block } while (condition);
  ```
### 16. Write a Java program to find the factorial of a number using a for loop.
#### Ans : 
``` java 
public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this number to find factorial for a different number
        int factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
```
### 17. Explain the concept of an infinite loop and how to avoid it.
#### Ans : An infinite loop repeats indefinitely without exiting. Avoid it by ensuring loop conditions or exit statements are correctly defined to eventually become false or break. Use counters, conditions, or timeout mechanisms to prevent unintended infinite looping in programming.

### 18. Write a Java program to print the first n prime numbers using a while loop.
#### Ans : 
``` java 
public class FirstNPrimes {

    public static void main(String[] args) {
        int n = 10; // Change this number to print more or fewer prime numbers
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
```

## if else, nested if, nested loops:

### 19. Explain the concept of nested if-else statements with a code example.
#### Ans : Nested if-else statements are control structures where an if-else statement is placed inside another if or else block. This allows for multiple conditions to be checked sequentially.
```` java 
if condition1:
    if condition2:
        # code for condition1 and condition2
    else:
        # code for condition1 but not condition2
else:
    # code for not condition1
````

### 20. Write a Java program to determine if a given year is a leap year
#### Ans : 
``` java 
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
```

### 21. Explain the potential drawbacks of using nested loops excessively.
#### Ans : Excessive use of nested loops can lead to reduced code readability, increased complexity, and significantly slower performance due to higher time complexity. This inefficiency can cause longer execution times and higher resource consumption, particularly with large datasets.

### 22. Write a Java program to print a pattern of stars in the shape of a pyramid.
#### Ans : 
```java
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Functions:

### 23. Explain the purpose and benefits of using functions in Java programs.
#### Ans : Functions in Java, also known as methods, enhance code modularity and reusability by encapsulating specific tasks. They simplify complex programs, improve readability, and ease maintenance. Functions also facilitate debugging and testing, and promote code reusability by allowing the same function to be used multiple times across different parts of a program.

### 24. Write a Java function to calculate the area of a circle given its radius as input.
#### Ans : 
``` java 
public class CircleArea {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
``` 

### 25. Explain the concept of function parameters and return values.
#### Ans : Function parameters are variables passed to a function, allowing it to receive input values when called. Return values are the outputs that a function sends back after execution. Parameters enable functions to operate on different data, while return values provide the results of the function's processing, enhancing modularity, reusability, and flexibility in programming by allowing functions to perform specific tasks with varying inputs and outputs.

### 26. Write a Java function to check if a given string is a palindrome (reads the same backward as forward).
#### Ans :
``` java
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
``` 

## Classes & Objects: 

### 27. Define a class named Student with member variables for name, roll number, and marks in three subjects. Write a constructor to initialize these variables and methods to display student details
#### Ans : 
```java 
public class Student {
    private String name;
    private int rollNumber;
    private int marks1;
    private int marks2;
    private int marks3;

    // Constructor to initialize member variables
    public Student(String name, int rollNumber, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, 85, 90, 88);
        student.display();
    }
}
```

### 28. Explain the concept of inheritance in OOP and its benefits. (Conceptual)
#### Ans : Inheritance in OOP allows a class (child) to inherit properties and methods from another class (parent). It promotes code reusability, simplifies maintenance, and enables the creation of hierarchical class structures, enhancing code organization and reducing redundancy. This also facilitates polymorphism, allowing for dynamic method invocation. 

### 29. Create a class named Shape with a member variable for color. Create a subclass named Rectangle inheriting from Shape with member variables for length and width. Implement a method in Rectangle to calculate its area.
#### Ans : 
```java 
// Define the Shape class
class Shape {
    // Member variable for color
    protected String color;

    // Constructor to initialize color
    public Shape(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}

// Define the Rectangle class inheriting from Shape
class Rectangle extends Shape {
    // Member variables for length and width
    private double length;
    private double width;

    // Constructor to initialize color, length, and width
    public Rectangle(String color, double length, double width) {
        super(color); // Call the constructor of the superclass (Shape)
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle("Blue", 5.0, 3.0);

        // Print the details of the rectangle
        System.out.println("Color: " + rect.getColor());
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.calculateArea());
    }
}
```

## Inheritance:

### 30. Explain the concept of polymorphism and method overriding in inheritance. (Conceptual)
#### Ans : Polymorphism in inheritance allows objects to be treated as instances of their parent class, enabling a single interface to represent different underlying forms. Method overriding occurs when a subclass provides a specific implementation for a method already defined in its parent class. This enables runtime polymorphism, where the overridden method in the subclass is called based on the object's runtime type, enhancing flexibility and reuse in object-oriented programming.

### 31. Create a class named Animal with a method to make a sound. Create subclasses for Dog and Cat that override the makeSound method with specific animal sounds.
#### Ans : 
``` java 
// Define the Animal class
class Animal {
    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Define the Dog class inheriting from Animal
class Dog extends Animal {
    // Override the makeSound method with the specific sound for a dog
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Define the Cat class inheriting from Animal
class Cat extends Animal {
    // Override the makeSound method with the specific sound for a cat
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class to test the Animal, Dog, and Cat classes
public class Main {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method on each instance
        myDog.makeSound(); // Outputs: Woof! Woof!
        myCat.makeSound(); // Outputs: Meow! Meow!
    }
}
```

# the end ( hope so ( it never be tho ))
## By [Rauf jatoi ](https://personal-web-page-lemon.vercel.app/index.html)
















