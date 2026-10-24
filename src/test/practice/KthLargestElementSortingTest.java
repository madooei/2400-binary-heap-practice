package practice;

/** Runs the kth-largest-element scenarios against the sorting solution. */
public class KthLargestElementSortingTest extends KthLargestElementTest {

  @Override
  protected int findKthLargest(int[] numbers, int k) {
    return KthLargestElement.findKthLargestSorting(numbers, k);
  }
}
