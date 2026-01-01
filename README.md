# Java-Language-Basics

_Exercise 1_: Calculator Program Write a program that takes two numbers and an operator 
(+, -, *, /) as command-line arguments , performs the operation, and prints the result. 
Use proper naming conventions, variables, data types (including primitives), and comments.
Handle division by zero with a custom message.

_Exercise 2_: Pass-by-Value Experiment Create a method that attempts to swap two integers and two objects
(e.g., a custom Point class). 
Demonstrate how Java handles pass-by-value for primitives and references by printing values before and after
the swap attempt.

_Exercise 3_: Number Guessing Game Build a game where the computer generates a random number between 1 and 100, and the user guesses it.
Use if-else for hints ("too high" or "too low"), a while loop for repeated guesses, and break when the user wins.
Add a switch to let the user choose difficulty (e.g., number of allowed guesses).

_Exercise 4_:Prime Number Checker Write a program to check if a number is prime using a for loop and the ternary operator to print "Prime" or "Not Prime".
Use continue to skip unnecessary iterations and a labeled break to exit early if needed.

_Exercise 5_: Library System Create a Book class with attributes (title, author, ISBN) and a Library class that manages a collection of books.
Implement methods to add, remove, and search for books by ISBN.
Use encapsulation, inheritance (e.g., a Textbook subclass), and polymorphism.

_Exercise 6_:tic tac toe

_Exercise 7: Text Analyzer
Write a program that takes a sentence as input, splits it into words, counts occurrences of each word (case-insensitive), and joins the results into a formatted string (e.g., "word:count"). Explore the String Constant Pool by comparing string literals vs. new String objects with == and .equals().

_Exercise 8: Palindrome Checker
Create a method that checks if a string is a palindrome, ignoring spaces and case. Use String immutability to your advantage and handle edge cases like null or empty strings.

_Exercise 9: File Parser with Error Handling
Simulate reading a "file" (use a hardcoded string array) where each line is a number. Parse it into integers using try-catch-finally, handle NumberFormatException, and use try-with-resources to manage a mock resource (e.g., a Scanner). Throw a custom InvalidDataException if a number is negative.

_Exercise 10: Exception Chain
Write a program that calls a chain of methods, where the deepest method throws a NullPointerException. Catch it higher up, wrap it in a custom ProcessingException, and use suppressed exceptions to add context about where it failed.

_Exercise 11: Array Manipulator
Create a program that takes two integer arrays, finds their intersection and union, and prints them. Implement methods to clone an array and copy a range (e.g., elements 2 to 5). Use a loop to print the arrays cleanly.

_Exercise 12: Matrix Rotator
Write a method to rotate a 2D square array (matrix) 90 degrees clockwise. Test it with a sample matrix and handle edge cases like non-square or empty arrays.


_Exercise 13: Student Grade Manager
Build a system using a Map to store student names and their grades (a List of integers). Sort students by name (Comparable) and grades by value (Comparator). Use an Iterator to print all entries and Generics to ensure type safety.

_Exercise 14: Unique Word Counter
Take a paragraph as input, store words in a Set to remove duplicates, and use a List to maintain insertion order. Sort the list and print the total unique word count.


_Exercise 15: Simple File Editor
Simulate a file editor: "create" a file (a string buffer), write lines to it, read it back, and append new content. Use basic string operations to mimic I/O since real file I/O might not be available in all environments.

_Exercise 16: Log Writer
Create a Log class that appends timestamped messages to a "file" (string). Read the log and print entries containing a specific keyword.


_Exercise 17: Number Filter
Generate a list of 100 random integers, then use the Stream API with lambda expressions to filter out even numbers, square the rest, and collect them into a new list. Use a functional interface to define a custom filter.

_Exercise 18: Word Frequency
Take a sentence, split it into words, and use streams to count word frequencies. Sort by frequency descending and print the top 3 using default methods in an interface.


_Exercise 19: Environment Inspector
Write a program that prints the Java version, classpath, and system properties (e.g., OS name) using System.getProperty(). Accept command-line arguments to filter properties by a prefix (e.g., "java").

_Exercise 20: Bytecode Simulator
Create a simple method that adds two numbers and prints their binary representation (little-endian). Simulate how bytecode might break it into steps (e.g., load, add, store).

_Exercise 21: Record Builder
Define a Person record with a builder pattern (manual implementation) for optional fields like phone number. Add annotations (e.g., @NotNull) and implement shallow cloning.

_Exercise 22: Version Feature Demo
Pick a Java version (e.g., 17) and showcase one feature (like text blocks or sealed classes) in a small program.


_Exercise 23: Formatted Output
Write a program that calculates the area of a circle (π * r²) and prints it with printf to 2 decimal places. Test with multiple radii.

_Exercise 24: Rounding Utility
Create a method that rounds a double to 2 decimal places using different approaches (e.g., Math.round, DecimalFormat) and compares results.