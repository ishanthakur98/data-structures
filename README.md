# BSA — DSA Patterns & Solutions

A curated **Data Structures & Algorithms (DSA)** repository focused on **problem-solving patterns** (not random problem dumps).  
Each pattern includes **intuition, templates, pitfalls, and solutions** with **time/space complexity** so you can learn once and reuse everywhere.

---

## What you’ll find here

- **Pattern-first learning**: Binary Search, Two Pointers, Sliding Window, DFS/BFS, DP, Greedy, Backtracking, etc.
- **Clean solutions**: readable, consistent style, and interview-friendly.
- **Explanations that teach**: why the approach works, not just what to type.
- **Complexity notes**: time and space called out for each solution.
- **Reusable templates**: minimal “starter” code to apply patterns quickly.

---

## How to navigate this repo (fast)

1. Start in the **Patterns** section below.
2. Open the folder path for the pattern you want.
3. Read that folder’s `README.md` for:
   - when to use the pattern
   - core idea / invariants
   - template
   - common mistakes
   - curated problems + solutions in that folder

> Tip: If you’re preparing for interviews, pick 1–2 patterns per week, then solve 10–20 problems per pattern.

---

## Patterns (directory index)

Below are the main pattern “packages” (folder paths). Each folder should contain a `README.md` explanation page plus solutions.

### Searching & Ordering
- `patterns/binary-search/`
- `patterns/two-pointers/`
- `patterns/sliding-window/`
- `patterns/merge-intervals/`

### Graphs & Trees
- `patterns/bfs/`
- `patterns/dfs/`
- `patterns/topological-sort/`
- `patterns/union-find/`
- `patterns/shortest-path/`

### Dynamic Programming (DP)
- `patterns/dp-1d/`
- `patterns/dp-2d/`
- `patterns/dp-knapsack/`
- `patterns/dp-subsequence/`

### Backtracking & Recursion
- `patterns/backtracking/`
- `patterns/recursion/`

### Greedy & Heaps
- `patterns/greedy/`
- `patterns/heap-priority-queue/`

### Data Structures
- `patterns/stack/`
- `patterns/queue/`
- `patterns/hashmap/`
- `patterns/trie/`

### Math & Bit
- `patterns/math/`
- `patterns/bit-manipulation/`

> You can rename/reorder these based on your preferred curriculum.

---

## Repo structure (suggested)

This is a clean structure that scales as the repo grows:

- `patterns/`
  - `binary-search/`
    - `README.md` (pattern explanation + templates + pitfalls + problem list)
    - `solutions/` (or keep solutions in the folder root)
  - `sliding-window/`
  - `dp-1d/`
- `templates/` (optional: cross-pattern templates)
- `notes/` (optional: general notes, cheat sheets)
- `README.md` (this file)

---

## Conventions used

To keep solutions consistent and easy to review, this repo follows these conventions:

- **File naming**
  - Use descriptive names: `lower_bound`, `first_true`, `rotated_sorted_array`, etc.
  - If using numbered platforms, add a suffix: `two_sum_leetcode`, `aggressive_cows_gfg`, etc.

- **Solution format (recommended)**
  - Problem summary (1–3 lines)
  - Key idea / invariant
  - Complexity
  - Implementation

- **Complexity notation**
  - **Time**: `O(...)`
  - **Space**: `O(...)` (state if auxiliary space vs total space matters)

---

## Quality bar (what “done” means)

A solution is considered “complete” when it has:

- A correct approach (handles edge cases)
- Clear variable names
- Complexity stated
- At least one of:
  - brief proof/intuition, or
  - invariants explained, or
  - “why this pattern applies” note

---

## Pattern templates (what I optimize for)

This repo emphasizes **templates you can memorize and adapt**, such as:

- Binary Search on answer (first true / last true)
- Sliding Window (fixed vs variable window)
- BFS level-order
- DFS recursion with visited/parent
- DP state + transition + base cases
- Backtracking (choose → explore → unchoose)

Templates may live inside each pattern folder and/or in `templates/`.

---

## Suggested learning path (if you’re starting)

A practical progression that builds confidence quickly:

1. Arrays / Strings basics + Hashing  
2. Two Pointers + Sliding Window  
3. Binary Search (index) → Binary Search (answer space)  
4. Stack / Monotonic Stack  
5. Trees (DFS/BFS)  
6. Graphs (BFS/DFS → Topo Sort → Union-Find)  
7. Heaps + Greedy  
8. Dynamic Programming (1D → 2D → classic patterns)  
9. Backtracking (subsets/permutations/combinations)  

---

## Progress tracker (optional)

If you want a simple accountability system, track it here:

- [ ] Binary Search — core templates completed
- [ ] Sliding Window — fixed + variable window completed
- [ ] Two Pointers — classic patterns completed
- [ ] BFS/DFS — templates + 10 problems each
- [ ] DP — 1D + 2D + knapsack basics

(If you don’t want checkboxes, remove this section.)

---

## Contributing

If you’re using this repo personally, treat this as your rulebook:

- Add problems only if they reinforce a pattern.
- Prefer **fewer, higher-quality solutions** over many rushed ones.
- If you revisit a problem and find a cleaner solution, replace it and add a short note on what improved.

If you plan to accept external contributions later, you can add:
- style rules
- required format
- PR checklist
- code review expectations

---

## License

Add a license if you plan to share widely (MIT is a common choice).  
If you’re unsure, you can leave this out until you decide.

---

## Contact / Notes

This repo is built as a living notebook. If something is unclear:
- check the pattern `README.md`
- compare multiple solutions in the same pattern
- add a short note to improve future-you’s understanding
