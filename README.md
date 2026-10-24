# Binary Heap — Practice

Two practice problems that use a binary heap: find the kth largest element of an array, and report the median of a stream of numbers as they arrive. Each problem has a JUnit suite, run once per solution.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      practice/
        KthLargestElement.java              # three solutions to the kth largest element
        MedianFinder.java                   # the median-of-a-stream contract
        SortedListMedianFinder.java         # keeps every value in a sorted list
        TwoHeapsMedianFinder.java           # splits the values between two heaps
      priorityqueue/
        PriorityQueue.java                  # the PriorityQueue ADT
        ArrayHeap.java                      # the array binary heap from the chapter
      list/
        List.java                           # the List ADT
        ArrayList.java                      # an array-backed List
    test/
      practice/
        KthLargestElementTest.java          # the kth-largest scenarios (abstract)
        KthLargestElementSortingTest.java   # runs them against the sorting solution
        KthLargestElementMaxHeapTest.java   # runs them against the max-heap solution
        KthLargestElementKeepKTest.java     # runs them against the keep-only-k solution
        MedianFinderTest.java               # the MedianFinder contract suite (abstract)
        SortedListMedianFinderTest.java     # runs it against SortedListMedianFinder
        TwoHeapsMedianFinderTest.java       # runs it against TwoHeapsMedianFinder
  scripts/
    test.sh                                 # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh practice.TwoHeapsMedianFinderTest` — compiles everything and runs only that test class. Use this while you are working on one solution and the others are still empty.

There is no demo program for these problems; the tests are how you check your work.

## What's here

- `practice.KthLargestElement` — three ways to find the kth largest element of an array: `findKthLargestSorting` sorts the array, `findKthLargestMaxHeap` removes from a max-heap k − 1 times, and `findKthLargest` keeps only the k largest in a min-heap.
- `practice.MedianFinder` — the interface for the median-of-a-stream problem: `add` a value, and read the `median` of every value so far.
- `practice.SortedListMedianFinder` and `practice.TwoHeapsMedianFinder` — the two solutions. The first keeps every value in a sorted list. The second keeps the smaller half in a max-heap and the larger half in a min-heap.
- `priorityqueue.PriorityQueue<T>` and `priorityqueue.ArrayHeap<T>` — the PriorityQueue ADT and the array binary heap from the chapter, copied so this code compiles and runs on its own.
- `list.List<T>` and `list.ArrayList<T>` — the List ADT and its array-backed implementation, copied so this code compiles and runs on its own. `SortedListMedianFinder` keeps its values in a list.
- The test classes — each abstract base holds the scenarios once, and each subclass runs them against one solution.
