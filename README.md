# Learn Java - Comprehensive Java Programming Examples

A comprehensive collection of Java programming examples covering core concepts, advanced topics, and practical implementations. This repository serves as a learning resource for Java developers at all levels.

## 📚 Table of Contents

- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Package Overview](#package-overview)
- [How to Run Examples](#how-to-run-examples)
- [Contributing](#contributing)
- [Prerequisites](#prerequisites)

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+ (for dependency management)
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Clone the Repository

```bash
git clone <repository-url>
cd Learn-Java
```

### Build the Project

```bash
mvn clean compile
```

## 📁 Project Structure

```
Learn-Java/
├── src/
│   ├── [package-directories]/
│   ├── HelloWorld.java
│   └── ReadFromKeyboard.java
├── lib/
│   └── sqlite-jdbc-3.42.0.0.jar
├── mydatabase.db
├── pom.xml
└── README.md
```

## 📦 Package Overview

### 🔤 **abstractClasses**
Abstract classes and inheritance concepts
- `AbstractClassDemo.java` - Basic abstract class implementation
- `ShapeAbstractClass.java` - Shape hierarchy using abstract classes

### 📝 **annotationsAndJavaDoc**
Java annotations and documentation generation
- `BuiltInAnnotationsDemo.java` - Built-in annotations usage
- `UserDefinedAnnotation.java` - Custom annotation creation
- `Book.java` - JavaDoc documentation example

### 🔢 **arrays**
Array manipulation and algorithms
- `Array1DPractice.java` - One-dimensional array operations
- `ArrayRotation.java` - Array rotation algorithms
- `MatricesMultiplication.java` - Matrix operations
- `SecondLargestElement.java` - Finding second largest element

### 🖥️ **awtLearn**
Abstract Window Toolkit (AWT) GUI programming
- `FirstApp.java`, `FirstApp2.java` - Basic AWT applications
- `ButtonAndActionListenerDemo.java` - Event handling
- Layout managers: `BorderLayoutDemo.java`, `FlowLayoutDemo.java`, `GridLayoutDemo.java`, `GridBagLayoutDemo.java`, `CardLayoutDemo.java`
- UI components: `TextFieldDemo.java`, `TextAreaDemo.java`, `ListBoxDemo.java`, `ScrollBarDemo.java`, `MenusDemo.java`
- Event handling: `CheckboxRadioButtonItemListenerDemo.java`, `MouseEventDemo.java`, `KeyEventDemo.java`, `WindowEventDemo.java`, `AdapterDemo.java`, `FiftyShadesOfEventHandling.java`
- Graphics: `PaintingColorsAndFonts.java`, `AnimationDemo.java`

### 📊 **collections**
Java Collections Framework
- `ArrayListDemo.java` - Dynamic arrays
- `LinkedListDemo.java` - Linked list implementation
- `HashMapDemo.java`, `TreeMapDemo.java` - Map implementations
- `HashSetDemo.java`, `TreeSetDemo.java` - Set implementations
- `PriorityQueueDemo.java` - Priority queue usage

### 🔀 **conditionalStatements**
Control flow and decision making
- `ConditionalStatementsPractice.java` - If-else statements
- `SwitchPractice.java` - Switch-case statements
- `CheckIfLeapYear.java` - Leap year calculation
- `FindRadixOfNumber.java` - Number base detection

### 🔤 **dataTypes**
Java data types and variables
- `DataTypes.java` - Primitive data types
- `Variables.java` - Variable declarations and scope
- `UnicodeChars.java` - Unicode character handling

### 📅 **dateAndTimeApi**
Date and time manipulation
- `DateClassDemo.java` - Legacy Date class
- `CalendarDemo.java` - Calendar class usage
- `DateFormatter.java` - Date formatting
- `JodaDateAndTimeAPI.java` - Modern date-time API

### ⚠️ **exceptionsHandling**
Exception handling mechanisms
- `CheckedExceptionsHandling.java` - Checked exceptions
- `UncheckedExceptionsHandling.java` - Runtime exceptions
- `CustomExceptionHandling.java` - Custom exception classes
- `FinallyBlockDemo.java` - Finally block usage

### 🔧 **generics**
Generic programming concepts
- `GenericsIntro.java` - Basic generics
- `GenericMethodsDemo.java` - Generic methods
- `GenericsDemo2.java` - Advanced generics

### 🏗️ **inheritance**
Object-oriented inheritance
- `InheritancePractice.java` - Basic inheritance
- `MethodOverridingDemo.java` - Method overriding

### 🔄 **innerClasses**
Inner class implementations
- `NestedInnerClassDemo.java` - Nested classes
- `LocalInnerClassDemo.java` - Local inner classes
- `AnonymousInnerClassDemo.java` - Anonymous classes
- `StaticInnerClassDemo.java` - Static inner classes

### 🔌 **interfaces**
Interface programming
- `InterfacesPractice1.java` - Basic interfaces
- `MultipleInterfacesDemo.java` - Multiple inheritance
- `InterfaceCallbackExample.java` - Callback patterns

### 📁 **ioStreams**
Input/Output stream operations
- File operations: `FileClassDemo.java`, `CopyAFile.java`
- Stream types: `ByteStreamsDemo.java`, `BufferStreamsDemo.java`
- Serialization: `ObjectInputStreamsDemo.java`, `ObjectOutputStreamsDemo.java`
- Data streams: `DataInputStreamDemo.java`, `RandomAccessFileDemo.java`

### 🗄️ **jdbcLearn**
Database connectivity with JDBC
- `JDBCDemo.java` - Basic JDBC operations
- `PreparedStatementDemo.java` - Prepared statements

### ⚡ **lambdaExpressions**
Functional programming with lambdas
- `LambdaDemo1.java` - Basic lambda expressions
- `LambdaWithParameters.java` - Parameterized lambdas
- `MethodReferenceDemo.java` - Method references
- `CaptureInLambda.java` - Variable capture

### 📚 **langPackage**
Core Java language features
- `WrapperClassesDemo.java` - Wrapper classes
- `StringBuffersAndBuildersDemo.java` - String manipulation
- `MathDemo.java` - Mathematical operations
- `ReflectDemo.java` - Reflection API
- `EnumDemo.java` - Enumeration usage

### 🔄 **loops**
Loop constructs and iterations
- `LoopPractice.java` - For, while, do-while loops

### 🔧 **methods**
Method definitions and usage
- `MaxMethod.java` - Method creation
- `MaxMethodOverloading.java` - Method overloading
- `VariableArgumentsDemo.java` - Varargs
- `CheckIfPrime.java` - Prime number checking

### 🧵 **mutithreading**
Concurrent programming
- `MultiThreadingDemo1.java` - Basic threading
- `SynchronizationDemo.java` - Thread synchronization
- `InterThreadCommunicationDemo.java` - Thread communication
- `ATMCustomerDemo.java` - Real-world threading example

### 🌐 **networkProgramming**
Network communication
- `ReverseEchoServer.java` - TCP server
- `MultiThreadedReverseEchoServer.java` - Multithreaded server
- `DatagramCommunication.java` - UDP communication

### 🏛️ **oops**
Object-Oriented Programming concepts
- `StudentClassDemo.java` - Class and object creation
- `CircleClass.java` - Encapsulation example
- `ProductAndCustomerClassDemo.java` - Class relationships

### ➕ **operatorsAndExpressions**
Operators and mathematical expressions
- `ArithmeticOperators.java` - Basic arithmetic
- `BitwiseDemo.java` - Bitwise operations
- `QuadraticEquation.java` - Mathematical calculations

### 🔒 **staticAndFinal**
Static and final keywords
- `StaticPractice1.java` - Static members
- `FinalPractice1.java` - Final keyword usage
- `SingletonClassDemo.java` - Singleton pattern

### 📝 **strings**
String manipulation and processing
- `StringMethodsPractice.java` - String methods
- `RegularExpressionsPractice.java` - Regex patterns
- `FormattedStringsPrinting.java` - String formatting

## 🏃‍♂️ How to Run Examples

### Method 1: Using IDE
1. Import the project into your IDE
2. Navigate to any package
3. Right-click on a Java file and select "Run"

### Method 2: Command Line
```bash
# Compile a specific file
javac -cp "lib/*:src" src/packageName/FileName.java

# Run the compiled class
java -cp "lib/*:src" packageName.FileName
```

### Method 3: Using Maven
```bash
# Compile all sources
mvn compile

# Run a specific main class
mvn exec:java -Dexec.mainClass="packageName.ClassName"
```

### Special Instructions for JDBC Examples
The SQLite JDBC driver is already included in the `lib/` directory. To run JDBC examples:
```bash
# Compile and run with JDBC driver
javac -cp "lib/sqlite-jdbc-3.42.0.0.jar" src/jdbcLearn/JDBCDemo.java
java -cp "lib/sqlite-jdbc-3.42.0.0.jar:src" jdbcLearn.JDBCDemo
```

**Note**: The project includes a SQLite database file (`mydatabase.db`) that will be created/used by JDBC examples.

## 🤝 Contributing

We welcome contributions! Here's how you can help:

### Adding New Examples
1. **Fork the repository**
2. **Create a new branch** for your feature
   ```bash
   git checkout -b feature/new-example
   ```
3. **Follow the existing structure**:
   - Create appropriate package directories
   - Use descriptive class names ending with "Demo"
   - Include comprehensive comments
   - Add sample input/output in comments

### Code Style Guidelines
- Use meaningful variable and method names
- Include JavaDoc comments for public methods
- Follow Java naming conventions
- Add inline comments explaining complex logic
- Include example usage in main method

### Example Template
```java
package yourPackage;

/**
 * Brief description of what this demo shows
 * @author Your Name
 */
public class YourDemo {
    /**
     * Main method demonstrating the concept
     * Expected Output: [describe expected output]
     */
    public static void main(String[] args) {
        // Your implementation here
        System.out.println("Demo completed successfully!");
    }
}
```

### Submitting Changes
1. **Test your code** thoroughly
2. **Update this README** if adding new packages
3. **Commit your changes**
   ```bash
   git commit -m "Add: Brief description of your addition"
   ```
4. **Push to your fork**
   ```bash
   git push origin feature/new-example
   ```
5. **Create a Pull Request** with:
   - Clear description of changes
   - Examples of how to run new code
   - Any dependencies added

### Reporting Issues
- Use GitHub Issues for bug reports
- Include Java version and OS information
- Provide steps to reproduce the issue
- Include error messages and stack traces

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🙏 Acknowledgments

- Java documentation and tutorials
- Open source Java community
- Contributors and maintainers

---

**Happy Learning! 🚀**

For questions or suggestions, please open an issue or submit a pull request.