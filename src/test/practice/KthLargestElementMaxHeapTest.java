package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/** Runs the kth-largest-element scenarios against the max-heap solution. */
public class KthLargestElementMaxHeapTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElementMaxHeap.findKthLargest(numbers, k);
  }

  @Test
  public void leavesNumbersUnchanged() {
    int[] numbers = new int[] {3, 1, 5, 2, 4};
    KthLargestElementMaxHeap.findKthLargest(numbers, 2);
    assertArrayEquals(new int[] {3, 1, 5, 2, 4}, numbers);
  }
}
