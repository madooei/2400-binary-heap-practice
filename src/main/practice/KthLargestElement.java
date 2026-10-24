package practice;

import java.util.Arrays;
import java.util.Comparator;
import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** Solutions to the problem of finding the kth largest element of an array. */
public final class KthLargestElement {

  private KthLargestElement() {
    // This class should not be instantiated!
  }

  // Returns the kth largest element of numbers, where 1 is the largest and
  // equal values count separately. Sorts numbers in place.
  // Pre: numbers is not empty, and 1 <= k <= numbers.length.
  public static int findKthLargestSorting(int[] numbers, int k) {
    Arrays.sort(numbers);  // ascending
    return numbers[numbers.length - k];
  }

  // Same contract as findKthLargestSorting, but does not change numbers.
  public static int findKthLargestMaxHeap(int[] numbers, int k) {
    Comparator<Integer> largestFirst = Comparator.reverseOrder();
    PriorityQueue<Integer> heap = new ArrayHeap<>(largestFirst);
    for (int number : numbers) {
      heap.add(number);
    }
    for (int i = 1; i < k; i++) {
      heap.remove();  // drop the largest still in the heap
    }
    return heap.peek();
  }

  // Same contract as findKthLargestSorting, but does not change numbers.
  public static int findKthLargest(int[] numbers, int k) {
    PriorityQueue<Integer> heap = new ArrayHeap<>();
    for (int number : numbers) {
      heap.add(number);
      if (heap.size() > k) {
        heap.remove();  // drop the smallest; it is not among the k largest
      }
    }
    return heap.peek();  // the smallest of the k largest
  }
}
