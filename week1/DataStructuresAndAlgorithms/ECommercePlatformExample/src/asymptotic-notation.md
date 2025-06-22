# Asymptotic Notation & Search Case Scenarios

## 1. Asymptotic Notation

Asymptotic notation is used to describe how the performance of an algorithm changes as the size of the input grows. It’s especially helpful when we want to compare algorithms without getting into machine-specific details or exact timings.

The most common one is **Big O Notation (O)**.

### Big O Notation

Big O gives us an **upper bound** on the time (or space) complexity of an algorithm. Basically, it tells us the **worst-case** growth rate — how fast the algorithm's runtime will increase relative to the input size `n`.

Some common Big O notations:

- `O(1)` – Constant time (doesn't grow with input)
- `O(log n)` – Logarithmic (like Binary Search)
- `O(n)` – Linear (like Linear Search)
- `O(n log n)` – Log-linear (like Merge Sort)
- `O(n^2)` – Quadratic (like Bubble Sort)
- `O(2^n)` – Exponential (brutal for large `n`)

We usually ignore constants and lower-order terms because Big O is about **scaling** behavior.

---

## 2. Best, Average, and Worst-Case Scenarios in Search

When we analyze search algorithms, it's not just about the worst-case. We also consider:

### Best Case

This is the **most optimistic** scenario — the least work the algorithm might have to do.

- For **Linear Search**: Best case is `O(1)` — if the element is at the start.
- For **Binary Search**: Best case is also `O(1)` — if the target is at the middle index on the first try.

### Average Case

This is a **realistic** scenario based on probability (average position of the item being searched).

- Linear Search average case is `O(n/2)` which simplifies to `O(n)`
- Binary Search average case is `O(log n)`

### Worst Case

This is the **maximum amount of work** the algorithm will do — the one Big O usually focuses on.

- **Linear Search**: `O(n)` (if the element is at the end or not found)
- **Binary Search**: `O(log n)` (keeps halving until it finds or confirms it's not there)

---

## Summary 

### Linear Search
1. **Best Case**: O(1)
2. **Average Case**: O(n/2)
3. **Worst Case**: O(n)
### Binary Search
1. **Best Case**: O(1)
2. **Average Case**: O(log n)
3. **Worst Case**: O(log n)

---

## Conclusion

Big O helps us compare how algorithms **scale**, and knowing best/average/worst cases helps us **set expectations** for performance depending on the data. For example, binary search is amazing for large datasets but only works on **sorted data**, while linear search works everywhere but can get slow on large inputs.

