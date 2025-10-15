
### ☕ Java 8 Basics

Welcome to the **Java 8 Basics** repository!  
This project contains beginner-friendly Java programs and examples covering **core Java concepts** and **Java 8 features** such as **Lambda Expressions**, **Stream API**, **Functional Interfaces**, and more.

---

## 🚀 Features

- ✅ Step-by-step Java examples  
- 🧠 Covers Core Java + Java 8 additions  
- 💬 Well-commented source code  
- 🧩 Organized by topic for easy navigation  
- 💻 Works with any Java 8+ setup  

---

## 📁 Repository Structure

```

Java8-Basics/
│
├── 01_CoreConcepts/
│   ├── HelloWorld.java
│   ├── VariablesAndDataTypes.java
│   └── ControlStatements.java
│
├── 02_Collections/
│   ├── ListExample.java
│   ├── MapExample.java
│   └── SetExample.java
│
├── 03_OOP/
│   ├── ClassAndObjects.java
│   ├── InheritanceExample.java
│   └── PolymorphismDemo.java
│
├── 04_Java8Features/
│   ├── LambdaExpressions.java
│   ├── FunctionalInterfaces.java
│   ├── StreamAPIExamples.java
│   ├── OptionalClass.java
│   └── MethodReferences.java
│
├── 05_AdditionalTopics/
│   ├── DateTimeAPI.java
│   ├── DefaultMethods.java
│   └── ForEachExample.java
│
└── README.md

````

---

## 🧠 Topics Covered

### 🏗️ Core Java
- Variables, Data Types, and Operators  
- Conditional Statements and Loops  
- Arrays and Strings  
- Methods and Recursion  
- Exception Handling  
- Object-Oriented Programming (Classes, Inheritance, Polymorphism, Encapsulation)

### ⚡ Java 8 Features
- **Lambda Expressions**
- **Functional Interfaces** (`Predicate`, `Consumer`, `Function`)
- **Stream API** (`filter`, `map`, `reduce`, `collect`)
- **Method References** (`::` operator)
- **Optional Class** (to avoid `NullPointerException`)
- **New Date and Time API** (`java.time`)
- **Default and Static Methods in Interfaces**
- **ForEach and Internal Iteration**

---

## 🛠️ Getting Started

### Prerequisites

- **Java JDK 8** installed  
  👉 [Download Java SE 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- Set the `JAVA_HOME` environment variable  
- Add the JDK `bin` folder to your system `PATH`  
- Use any IDE or editor:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)
  - [VS Code](https://code.visualstudio.com/)

### Running the Programs

```bash
# Compile
javac HelloWorld.java

# Run
java HelloWorld
````

---

## 💡 Quick Java 8 Examples

### 🔹 1. Lambda Expression

```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaExample {
    public static void main(String[] args) {
        Greeting greet = name -> System.out.println("Hello, " + name + "!");
        greet.sayHello("Java 8");
    }
}
```

🧩 **Output:**

```
Hello, Java 8!
```

---

### 🔹 2. Functional Interface with Predicate

```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(5));  // false
    }
}
```

---

### 🔹 3. Stream API (filter + map + collect)

```java
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filtered =
            names.stream()
                 .filter(name -> name.startsWith("C"))
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());

        System.out.println(filtered); // [CHARLIE]
    }
}
```

---

### 🔹 4. Optional Class

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Unknown")); // prints "Unknown"
    }
}
```

---

### 🔹 5. New Date and Time API

```java
import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + today);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }
}
```

---

### 🔹 6. Method References

```java
import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "C++");
        names.forEach(System.out::println);
    }
}
```

---

## 🧪 Example Output
```
Hello, Java 8!
true
false
[CHARLIE]
Unknown
Date: 2025-10-15
Time: 12:30:45.678
DateTime: 2025-10-15T12:30:45.678
Java
Python
C++
```
