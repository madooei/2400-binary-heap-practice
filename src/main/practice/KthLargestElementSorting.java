package practice;

import java.util.Arrays;

/** Practice problem: find the kth largest element of an array by sorting it. */
public final class KthLargestElementSorting {

  private KthLargestElementSorting() {
    // This class should not be instantiated!
  }

  // Returns the kth largest element of numbers, where 1 is the largest and
  // equal values count separately. Sorts numbers in place.
  // Pre: numbers is not empty, and 1 <= k <= numbers.length.
  public static int findKthLargest(int[] numbers, int k) {
    Arrays.sort(numbers);  // ascending
    return numbers[numbers.length - k];
  }
}
