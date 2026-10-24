package practice;

import java.util.Comparator;
import java.util.NoSuchElementException;
import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** A MedianFinder that splits the values between a max-heap and a min-heap. */
public class TwoHeapsMedianFinder implements MedianFinder {

  private PriorityQueue<Integer> low;   // the smaller half, largest on top
  private PriorityQueue<Integer> high;  // the larger half, smallest on top

  public TwoHeapsMedianFinder() {
    Comparator<Integer> largestFirst = Comparator.reverseOrder();
    low = new ArrayHeap<>(largestFirst);
    high = new ArrayHeap<>();
  }

  @Override
  public void add(int value) {
    if (low.size() == 0 || value <= low.peek()) {
      low.add(value);
    } else {
      high.add(value);
    }
    // Keep the sizes within one of each other, with any extra value in low.
    if (low.size() > high.size() + 1) {
      int moved = low.peek();  // the largest of the smaller half
      low.remove();
      high.add(moved);
    } else if (high.size() > low.size()) {
      int moved = high.peek();  // the smallest of the larger half
      high.remove();
      low.add(moved);
    }
  }

  @Override
  public double median() {
    if (low.size() == 0) {
      throw new NoSuchElementException();
    }
    if (low.size() == high.size()) {
      return ((double) low.peek() + high.peek()) / 2;  // even count
    }
    return low.peek();  // odd count: low holds the extra value
  }
}
