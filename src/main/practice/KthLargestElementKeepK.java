package practice;

import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** Practice problem: find the kth largest element by keeping only the k largest in a min-heap. */
public final class KthLargestElementKeepK {

  private KthLargestElementKeepK() {
    // This class should not be instantiated!
  }

  // Returns the kth largest element of numbers, where 1 is the largest and
  // equal values count separately. Does not change numbers.
  // Pre: numbers is not empty, and 1 <= k <= numbers.length.
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
