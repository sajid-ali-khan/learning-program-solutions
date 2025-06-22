# Recursion
## Concept
Recursion is a concept where a function calls **itself** in order to solve a problem.

It's kind of like solving a big problem by breaking it down into **smaller versions of the same problem**, until you reach a point where the problem becomes so simple that you can solve it directly. That simple case is called the **base case**.

## Divide and Conquer
It is a programming concept that uses recursion to solve complex problems by breaking it into smaller and solvable problems.

## Use case
Recursion can **simplify problems** that have a **repetitive structure**, especially when the problem itself is defined in terms of smaller subproblems.

Some examples where recursion is really helpful:
- **Factorial** calculation (`n!`)
- **Fibonacci** sequence
- **Tree traversal**
- **Maze solving / Backtracking**
- **Divide and conquer algorithms** (like Merge Sort, Quick Sort)

## Basic Structure of a Recursive Function

Every recursive function has **two main parts**:

1. **Base Case** — when to stop recursion
2. **Recursive Case** — the function calls itself


## Disadvantages with Recursion
Programs that us recursion are always at a risk of the famous **StackOverflowException**, which occurs when the stack space allotted for the program's execution exceeds due to many recursion calls, as each recursion call needs some stack storage.

## Conclusion
The code written using **Recursion** is often clean, easy and closer to how we naturally think about solving problems. But it’s not always the most efficient — so it’s about choosing the right tool for the right job.
