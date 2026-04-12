3:00 to 4:15 ---> Strings
4:20 to 4:30 ---> Break
4:30 to 5:30 ---> Inheritance
5:30 to 5:55 ---> BreakOut
5:55 to 6:15 ---> implicitwait

Inheritance:
Definition of Inheritance:

Inheritance is a fundamental principle in object-oriented programming that allows a class to inherit attributes and behaviors (methods) from another class.
This uses extends keyword
Advantages of Inheritance:

Reusability: Inheritance promotes the reuse of existing code without having to rewrite it.
Readability: It makes the code more simple by establishing clear relationships between classes.
Hierarchy: Establishes parent-child relationships between Classes and Interfaces, making the structure easier to understand and maintain.
Types of Inheritance:

Single: A class inherits from one parent class.
Multiple: A class inherits behaviors from more than one class, typically achieved through interfaces in Java.
Multilevel: A class inherits from a child class, creating a multilevel chain.
Hierarchical: Multiple classes inherit from a single parent class.
Hybrid: A combination of multilevel and hierarchical inheritance.

Java Examples:
Integer extends Number
RuntimeException extends Exception
List extends Collection
Selenium WebDriver Examples: - ChromeDriver extends ChromiumDriver - EdgeDriver extends ChromiumDriver - ChromiumDriver extends RemoteWebDriver Alt text

Interview Question
Could you explain Inheritance concept in Java? Answer: Definition, Types, Advantages, Examples
Give realtime examples in Java, Selenium
Explain where have you applied Inheritance in your Framework?

Types of Wait:
1)Selenium wait
 a)implcit wait
 2)explicit wait
 3)fluent wait
2)Java wait
 thread.sleep
Implicit wait:
-global wait(applicable to all the lines of code)
-it will not sleep for the entire duration which is specified,once it locates the element it goes to next line of code
-if the time limit is exceeded it throws a no such element exception.
