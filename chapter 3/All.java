//Chapter 3 Answers

//Exercise 1
public class All {
	public static void main(String[] args) {
}
// 3.10
// Similarity: Both `if` and `while` statements evaluate a condition before executing their code block.
// Difference:
// - `if` is a single-selection statement used for decision-making (executes once if the condition is true).
// - `while` is a repetition statement that continues executing the block as long as the condition remains true.

// 3.11
// When an integer is divided by another integer in Java, the result is also an integer, discarding any fractional part (truncation).
// To avoid this, at least one of the operands should be a floating-point number.
double result = (double) num1 / num2;

// 3.12
// Control statements can be combined in two ways:
// 1. Sequential execution - Statements are executed in order.
// 2. Nesting - One control statement is placed inside another.

// 3.13
// For the sum of the first 100 positive integers
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}

// For an arbitrary number of positive integers
int sum = 0, num;
Scanner input = new Scanner(System.in);
while ((num = input.nextInt()) > 0) {
    sum += num;
}

// 3.14
// Preincrement (`++x`) increments `x` before using it in an expression.
// Postincrement (`x++`) uses the current value of `x` first, then increments it.
int x = 5;
System.out.println(++x); // Output: 6
System.out.println(x++); // Output: 6 (then x becomes 7)

// 3.15
// a) Error: Semicolon after `if` and mismatched quotes.
if (age >= 65)
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65");

// b) Error: `total` is uninitialized.
int x = 1, total = 0;
while (x <= 10) {
    total += x;
    ++x;
}

// c) Error: Needs braces `{}` for multiple statements inside `while`.
while (x <= 100) {
    total += x;
    ++x;
}

// d) Error: Infinite loop due to `++y` increasing `y` instead of decreasing it.
while (y > 0) {
    System.out.println(y);
    --y;
}

// 3.17 (Gas Mileage)
// A Java program using `Scanner` and `while` loop to calculate miles per gallon.

// 3.18 (Credit Limit Calculator)
// A program that inputs account details, calculates the new balance, and checks if the credit limit is exceeded.

// 3.19 (Sales Commission Calculator)
// A program that calculates a salesperson's earnings based on a fixed salary and commission.

// 3.20 (Salary Calculator)
// A program that computes gross pay, including overtime for hours worked beyond 40.

// 3.21 (Find the Largest Number)
// A program that takes 10 integers and finds the largest using a loop and `if` statement.

// 3.22 (Tabular Output)
// A program using loops to print a table with values.

// 3.23 (Find the Two Largest Numbers)
// A program similar to 3.21 but tracks the two largest numbers.

// 3.24 (Validating User Input)
// Modifies a given program to ensure only `1` or `2` is accepted.

// 3.25 (Checkerboard Pattern of Asterisks)
// A nested loop prints a checkerboard pattern using `System.out.print("* ");`.

// 3.38 (Enforcing Privacy with Cryptography)
// A Java program encrypting a 4-digit integer by modifying its digits and swapping them.

// 3.39 (World Population Growth)
// A program to calculate world population growth over 75 years and determine when the population doubles.
}