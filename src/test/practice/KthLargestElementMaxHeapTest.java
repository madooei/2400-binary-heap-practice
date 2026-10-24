package practice;

/** Runs the kth-largest-element scenarios against the max-heap solution. */
public class KthLargestElementMaxHeapTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElement.findKthLargestMaxHeap(numbers, k);
  }
}
