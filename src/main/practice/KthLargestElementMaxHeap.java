package practice;

import java.util.Comparator;
import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** Practice problem: find the kth largest element of an array by removing from a max-heap. */
public final class KthLargestElementMaxHeap {

  private KthLargestElementMaxHeap() {
    // This class should not be instantiated!
  }

  // Returns the kth largest element of numbers, where 1 is the largest and
  // equal values count separately. Does not change numbers.
  // Pre: numbers is not empty, and 1 <= k <= numbers.length.
  public static int findKthLargest(int[] numbers, int k) {
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
}
