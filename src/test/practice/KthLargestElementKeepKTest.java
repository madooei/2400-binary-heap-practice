package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/** Runs the kth-largest-element scenarios against the keep-only-k solution. */
public class KthLargestElementKeepKTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElementKeepK.findKthLargest(numbers, k);
  }

  @Test
  public void leavesNumbersUnchanged() {
    int[] numbers = new int[] {3, 1, 5, 2, 4};
    KthLargestElementKeepK.findKthLargest(numbers, 2);
    assertArrayEquals(new int[] {3, 1, 5, 2, 4}, numbers);
  }
}
