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

## Solved problems

### Index-based (sorted array)
- [LC 704 — Binary Search](../java/src/main/java/com/dataStructure/binarySearch/solutions/Lc704BinarySearch.java)
- [LC 35 — Binary Search](../java/src/main/java/com/dataStructure/binarySearch/solutions/L35SearchInsertPosition.java)
- [LC 35 — Binary Search Single element in Sorted Array](../java/src/main/java/com/dataStructure/binarySearch/solutions/L540SingleElementInASortedArray.java)

### Boundaries (lower/upper bound)
- [Lower Bound (first index >= x)](../java/src/main/java/com/dataStructure/binarySearch/solutions/LowerBound.java)
- [Upper Bound (last index >= x)](../java/src/main/java/com/dataStructure/binarySearch/solutions/UpperBound.java)

### Index-based (Rotated sorted array)
- [LC 33 — Binary Search in rotated sorted](../java/src/main/java/com/dataStructure/binarySearch/solutions/L33SearchInRotated.java)
- [LC 81 — Binary Search in rotated sorted II](../java/src/main/java/com/dataStructure/binarySearch/solutions/L81SearchInRotatedSortedArrayII.java)
- [LC 153 — Binary Search Minimum in rotated sorted II](../java/src/main/java/com/dataStructure/binarySearch/solutions/L153FindMinimumInRotated.java)
- [Binary Search Number of times a array is rotated](../java/src/main/java/com/dataStructure/binarySearch/solutions/TimesAArrayIsRotated.java)


### Answer space (predicate / first-true)
- [Binary Search Peak element of a array](../java/src/main/java/com/dataStructure/binarySearch/solutions/L162FindPeakElement.java)

### Binary Search on Answer
- [Find square root of a element](../java/src/main/java/com/dataStructure/binarySearch/solutions/SquareRoot.java)
- [Find nth root of a element](../java/src/main/java/com/dataStructure/binarySearch/solutions/NthRoot.java)
- [Kooko finish the banana](../java/src/main/java/com/dataStructure/binarySearch/solutions/L875KokoEatingBananas.java)


---

## How to add a new link
Add a new bullet like this:

- [LC 35 — Search Insert Position](../java/src/main/java/com/dataStructure/binarySearch/solutions/Lc35SearchInsertPosition.java)
