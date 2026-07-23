 Day 10 – Java Strings

This repository contains my Day 10 Java learning notes and practice programs focused on **Strings**. The session covers string creation, comparison, commonly used methods, and basic string-based programming problems.

---

##  Topics Covered

- Introduction to Strings
- String Creation
- String Methods
- String Comparison (`==`, `equals()`, `compareTo()`)
- Counting Vowels and Consonants
- Palindrome String
- StringBuilder
- StringBuffer

---

##  What is a String?

A **String** is a sequence of characters used to represent text in Java. Strings are **immutable**, meaning once a string object is created, its value cannot be modified. Any modification creates a new string object.

---

##  String Creation

Java provides two ways to create strings:

###  String Literal
```java
String str = "Hello";
```
- Stored in the **String Constant Pool**.
- Reuses existing objects with the same value.
- Memory efficient.
- Preferred approach.

###  Using the `new` Keyword
```java
String str = new String("Hello");
```
- Creates a new object in heap memory.
- Does not reuse objects from the String Pool.
- Consumes additional memory.

---

##  String Comparison

### `==`
Compares whether two string references point to the same memory location.

### `equals()`
Compares the actual contents of two strings.

### `compareTo()`
Performs lexicographical (dictionary-order) comparison.

**Return Values**
- `0` → Both strings are equal.
- Positive value → First string is greater.
- Negative value → Second string is greater.

---

## Common String Methods

| Method | Description |
|---------|-------------|
| `length()` | Returns the length of the string |
| `charAt()` | Returns the character at a specified index |
| `toUpperCase()` | Converts the string to uppercase |
| `toLowerCase()` | Converts the string to lowercase |
| `equals()` | Compares string contents |
| `equalsIgnoreCase()` | Compares strings ignoring case |
| `compareTo()` | Lexicographical comparison |
| `contains()` | Checks whether a substring exists |
| `substring()` | Extracts part of a string |
| `replace()` | Replaces characters or substrings |
| `indexOf()` | Returns the first occurrence index |
| `lastIndexOf()` | Returns the last occurrence index |
| `startsWith()` | Checks starting characters |
| `endsWith()` | Checks ending characters |
| `trim()` | Removes leading and trailing spaces |
| `split()` | Splits a string into an array |
| `isEmpty()` | Checks if the string is empty |
| `concat()` | Concatenates two strings |
| `toCharArray()` | Converts the string into a character array |

---

##  Count Vowels and Consonants

### Algorithm
1. Convert the string to lowercase.
2. Traverse each character.
3. Check whether the character is a vowel.
4. Increment the vowel count if true.
5. If it is an alphabet but not a vowel, increment the consonant count.
6. Display the total number of vowels and consonants.

---

##  Palindrome String

A **Palindrome** is a string that reads the same from both directions.

### Algorithm
1. Reverse the given string.
2. Compare the reversed string with the original.
3. If both are equal, the string is a palindrome.
4. Otherwise, it is not a palindrome.

---

##  StringBuilder

`StringBuilder` is a mutable class designed for efficient string manipulation.

### Features
- Mutable
- High performance
- Not thread-safe
- Best suited for single-threaded applications

---

##  StringBuffer

`StringBuffer` is another mutable class similar to `StringBuilder` but with synchronization support.

### Features
- Mutable
- Thread-safe
- Slightly slower due to synchronization
- Suitable for multi-threaded applications

---

##  Comparison

| Feature | String | StringBuilder | StringBuffer |
|---------|--------|---------------|--------------|
| Mutable | ❌ No | ✅ Yes | ✅ Yes |
| Thread Safe | ❌ No | ❌ No | ✅ Yes |
| Performance | Slower for frequent modifications | Fast | Moderate |
| Best Use Case | Fixed text | Single-threaded applications | Multi-threaded applications |

---

##  Programs Practiced

- ✅ String Creation
- ✅ String Comparison
- ✅ Common String Methods
- ✅ Reverse a String
- ✅ Count Vowels and Consonants
- ✅ Palindrome String
- ✅ StringBuilder Operations
- ✅ StringBuffer Operations

---

##  Key Learnings

- Strings in Java are immutable.
- Use `equals()` to compare string contents.
- Use `compareTo()` for lexicographical comparison.
- `StringBuilder` offers better performance for frequent modifications.
- `StringBuffer` provides thread safety through synchronization.
- Java's built-in string methods simplify text processing and problem-solving.

---

## Summary

Day 10 focused on understanding Java Strings, their creation, comparison techniques, built-in methods, and practical programming exercises such as reversing strings, checking palindromes, and counting vowels and consonants. I also explored the differences between **String**, **StringBuilder**, and **StringBuffer**, helping me understand when each should be used in real-world Java applications.

This repository contains my Day 10 Java learning notes and practice programs focused on **Strings**. The session covers string creation, comparison, commonly used methods, and basic string-based programming problems.

---

## Topics Covered

- Introduction to Strings
- String Creation
- String Methods
- String Comparison (`==`, `equals()`, `compareTo()`)
- Counting Vowels and Consonants
- Palindrome String
- StringBuilder
- StringBuffer

---

## What is a String?

A **String** is a sequence of characters used to represent text in Java. Strings are **immutable**, meaning once a string object is created, its value cannot be modified. Any modification creates a new string object.

---

## String Creation

Java provides two ways to create strings:

### String Literal
```java
String str = "Hello";
```
- Stored in the **String Constant Pool**.
- Reuses existing objects with the same value.
- Memory efficient.
- Preferred approach.

### Using the `new` Keyword
```java
String str = new String("Hello");
```
- Creates a new object in heap memory.
- Does not reuse objects from the String Pool.
- Consumes additional memory.

---

## String Comparison

### `==`
Compares whether two string references point to the same memory location.

### `equals()`
Compares the actual contents of two strings.

### `compareTo()`
Performs lexicographical (dictionary-order) comparison.

**Return Values**
- `0` → Both strings are equal.
- Positive value → First string is greater.
- Negative value → Second string is greater.

---

##  Common String Methods

| Method | Description |
|---------|-------------|
| `length()` | Returns the length of the string |
| `charAt()` | Returns the character at a specified index |
| `toUpperCase()` | Converts the string to uppercase |
| `toLowerCase()` | Converts the string to lowercase |
| `equals()` | Compares string contents |
| `equalsIgnoreCase()` | Compares strings ignoring case |
| `compareTo()` | Lexicographical comparison |
| `contains()` | Checks whether a substring exists |
| `substring()` | Extracts part of a string |
| `replace()` | Replaces characters or substrings |
| `indexOf()` | Returns the first occurrence index |
| `lastIndexOf()` | Returns the last occurrence index |
| `startsWith()` | Checks starting characters |
| `endsWith()` | Checks ending characters |
| `trim()` | Removes leading and trailing spaces |
| `split()` | Splits a string into an array |
| `isEmpty()` | Checks if the string is empty |
| `concat()` | Concatenates two strings |
| `toCharArray()` | Converts the string into a character array |

---

##  Count Vowels and Consonants

### Algorithm
1. Convert the string to lowercase.
2. Traverse each character.
3. Check whether the character is a vowel.
4. Increment the vowel count if true.
5. If it is an alphabet but not a vowel, increment the consonant count.
6. Display the total number of vowels and consonants.

---

##  Palindrome String

A **Palindrome** is a string that reads the same from both directions.

### Algorithm
1. Reverse the given string.
2. Compare the reversed string with the original.
3. If both are equal, the string is a palindrome.
4. Otherwise, it is not a palindrome.

---

##  StringBuilder

`StringBuilder` is a mutable class designed for efficient string manipulation.

### Features
- Mutable
- High performance
- Not thread-safe
- Best suited for single-threaded applications

---

##  StringBuffer

`StringBuffer` is another mutable class similar to `StringBuilder` but with synchronization support.

### Features
- Mutable
- Thread-safe
- Slightly slower due to synchronization
- Suitable for multi-threaded applications

---

##  Comparison

| Feature | String | StringBuilder | StringBuffer |
|---------|--------|---------------|--------------|
| Mutable | ❌ No | ✅ Yes | ✅ Yes |
| Thread Safe | ❌ No | ❌ No | ✅ Yes |
| Performance | Slower for frequent modifications | Fast | Moderate |
| Best Use Case | Fixed text | Single-threaded applications | Multi-threaded applications |

---

##  Programs Practiced

- ✅ String Creation
- ✅ String Comparison
- ✅ Common String Methods
- ✅ Reverse a String
- ✅ Count Vowels and Consonants
- ✅ Palindrome String
- ✅ StringBuilder Operations
- ✅ StringBuffer Operations

---

##  Key Learnings

- Strings in Java are immutable.
- Use `equals()` to compare string contents.
- Use `compareTo()` for lexicographical comparison.
- `StringBuilder` offers better performance for frequent modifications.
- `StringBuffer` provides thread safety through synchronization.
- Java's built-in string methods simplify text processing and problem-solving.

---

##  Summary

Day 10 focused on understanding Java Strings, their creation, comparison techniques, built-in methods, and practical programming exercises such as reversing strings, checking palindromes, and counting vowels and consonants. I also explored the differences between **String**, **StringBuilder**, and **StringBuffer**, helping me understand when each should be used in real-world Java applications.
Leetcode problems relating the topic were discussed .
