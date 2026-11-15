package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/** Runs the kth-largest-element scenarios against the sorting solution. */
public class KthLargestElementSortingTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElementSorting.findKthLargest(numbers, k);
  }

  @Test
  public void sortsNumbersInPlace() {
    int[] numbers = new int[] {3, 1, 5, 2, 4};
    KthLargestElementSorting.findKthLargest(numbers, 2);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, numbers);
  }
}
