# Binary Search

Binary Search is a divide-and-conquer technique that works when your search space is **monotonic**:
- **Index-based:** the array is sorted, so you can eliminate half each step.
- **Answer-based:** a predicate `ok(x)` is monotonic (False…True), so you can search the smallest/biggest feasible value.

## Key idea (invariant)
At every step, maintain a correct range that still contains the answer, then shrink it by comparing at `mid`.

## Complexity
- Time: `O(log n)`
- Space: `O(1)` (iterative)

---

## Solved problems (add as you go)

### Index-based (sorted array)
- [LC 704 — Binary Search](../java/src/main/java/com/dataStructure/binarySearch/solutions/Lc704BinarySearch.java)

### Boundaries (lower/upper bound)
- [Lower Bound (first index >= x)](../java/src/main/java/com/dataStructure/binarySearch/solutions/LowerBound.java)

### Answer space (predicate / first-true)
- _Add next problem here_

---

## How to add a new link
Add a new bullet like this:

- [LC 35 — Search Insert Position](../java/src/main/java/com/dataStructure/binarySearch/solutions/Lc35SearchInsertPosition.java)
