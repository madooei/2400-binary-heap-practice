package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the kth-largest-element problem. Each test is one scenario. The
 * scenarios are written once here; each solution gets its own subclass that
 * says which method to call, so you can run the suite for one solution at a
 * time.
 */
public abstract class KthLargestElementTest {

  // Calls the solution under test.
  protected abstract int findKthLargest(int[] numbers, int k);

  @Test
  public void singleElementIsTheLargest() {
    assertEquals(7, findKthLargest(new int[] {7}, 1));
  }

  @Test
  public void firstLargestIsTheMaximum() {
    assertEquals(5, findKthLargest(new int[] {3, 1, 5, 2, 4}, 1));
  }

  @Test
  public void secondLargestOfDistinctValues() {
    assertEquals(4, findKthLargest(new int[] {3, 1, 5, 2, 4}, 2));
  }

  @Test
  public void lastLargestIsTheMinimum() {
    assertEquals(1, findKthLargest(new int[] {3, 1, 5, 2, 4}, 5));
  }

  @Test
  public void duplicatesCountSeparately() {
    assertEquals(4, findKthLargest(new int[] {4, 4, 5, 2}, 3));
  }

  @Test
  public void allEqualValuesGiveThatValue() {
    assertEquals(6, findKthLargest(new int[] {6, 6, 6}, 2));
  }

  @Test
  public void secondLargestOfNegativeValues() {
    assertEquals(-2, findKthLargest(new int[] {-5, -1, -2, -8}, 2));
  }

  @Test
  public void kthLargestOfManyValues() {
    int[] numbers = new int[101];
    for (int i = 0; i < 101; i++) {
      numbers[i] = (i * 37) % 101;  // each of 0 to 100 once, scrambled
    }
    assertEquals(90, findKthLargest(numbers, 11));
  }
}
