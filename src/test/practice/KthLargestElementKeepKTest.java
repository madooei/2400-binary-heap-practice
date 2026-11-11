package practice;

/** Runs the kth-largest-element scenarios against the keep-only-k solution. */
public class KthLargestElementKeepKTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElementKeepK.findKthLargest(numbers, k);
  }
}
