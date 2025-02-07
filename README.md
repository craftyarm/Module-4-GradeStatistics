# Grade Statistics Using For-Loop

This Java-based application captures ten floating-point grades from user input and computes key statistical measures: the average, maximum, and minimum grades. The program ensures robust input validation and uses a for-loop to process exactly ten entries.

## Features

- **Fixed-Count Iteration:** Uses a for-loop to ensure exactly ten grades are processed.
- **Input Validation:** Implements a while-loop to verify that the input is a valid floating-point number, preventing endless loops.
- **Single-Pass Calculation:** Computes the average, maximum, and minimum in one loop.
- **Formatted Output:** Displays the results with clear formatting for easy readability.

## How to Compile and Run

   javac GradeStatistics.java

## Example Usage

When you run the program, you will be prompted to enter ten grades. After all valid grades are entered, the program will output the computed average, maximum, and minimum, for example:
```
This program will ask for 10 grades and compute the average, maximum, and minimum.
Enter grade 1: 85.5
Enter grade 2: 92
...
Enter grade 10: 91.3

----- Grade Statistics -----
Average: 85.63
Maximum: 100.00
Minimum: 69.50
----------------------------