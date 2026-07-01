# TDD using JUnit 5 and Mockito

This repository contains basic exercises on **Test Driven Development (TDD)** using **JUnit 5** and **Mockito**.

The project covers:
- JUnit 5 basic testing
- Assertions
- Arrange-Act-Assert (AAA) pattern
- Test Fixtures
- Setup and Teardown methods
- Mockito Mocking and Stubbing
- Mockito Interaction Verification


## Project Structure


TDD-JUnit5-Mockito
│
└── src
└── junit
├── Calculator.java
├── CalculatorTest.java
└── AssertionEx.java



# Technologies Used

- Java
- JUnit 5
- Mockito
- Eclipse IDE


# Exercise 3: Assertions in JUnit

## Description

This exercise demonstrates different JUnit 5 assertions.

Assertions used:

- `assertEquals()`
- `assertTrue()`
- `assertFalse()`
- `assertNull()`
- `assertNotNull()`


## Implementation

The `AssertionEx` test class validates different conditions using JUnit 5 assertion methods.

Example:

java
assertEquals(8, c.add(3,5));

assertTrue(c.val1(2)<c.val1(3));

assertFalse(c.val1(3)<c.val1(2));
Exercise 4: Arrange-Act-Assert (AAA) Pattern
Description

The AAA pattern separates test cases into three parts:

Arrange

Creating objects and preparing required data.

Example:

static Calculator c;

@BeforeAll
static void setup()
{
    c = new Calculator();
}
Act

Calling the method that needs testing.

Example:

c.add(2,5);
Assert

Checking whether the actual output matches the expected output.

Example:

assertEquals(8,c.add(2,5));
Test Fixtures

Test fixtures are used to prepare and clean up resources before and after tests.

Used annotations:

BeforeAll

Runs once before all test cases.

@BeforeAll
static void setupt()
{
    c = new Calculator();
}
AfterAll

Runs once after all test cases.

@AfterAll
static void cleanup()
{
    System.out.println("Testing done");
}
Calculator Class

The Calculator class contains basic arithmetic operations.

public class Calculator {

    public int val1(int a){
        return a;
    }

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
}
Running Tests
Open the project in Eclipse/IDE.
Add JUnit 5 Library.
Right click the test class.
Select:
Run As → JUnit Test
Test Results

All JUnit test cases executed successfully.

Output Screenshot

<img width="240" height="435" alt="image" src="https://github.com/user-attachments/assets/f8a37ccf-fdfa-4bb0-8ac6-f566c44a0584" />
<img width="770" height="464" alt="image" src="https://github.com/user-attachments/assets/4a1c1746-a565-4bc6-8fde-d79f06d71efe" />


Example:

Tests Passed ✔
Failures: 0
Errors: 0
Mockito Exercises
Exercise 1: Mocking and Stubbing

Mockito is used to create mock objects and define expected behavior.

Concepts:

Creating mock objects
Stubbing method responses
Testing dependent classes without real objects
Exercise 2: Verifying Interactions

Mockito verification checks whether a method was called correctly.

Example:

verify(mockObject).methodName();
Conclusion

This project demonstrates the fundamentals of TDD using JUnit 5 and introduces Mockito concepts for testing Java applications with dependencies.
