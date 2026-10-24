package practice;

import java.util.NoSuchElementException;
import list.ArrayList;
import list.List;

/** A MedianFinder that keeps every value in a sorted list. */
public class SortedListMedianFinder implements MedianFinder {

  private List<Integer> sorted;  // every value so far, in ascending order

  public SortedListMedianFinder() {
    sorted = new ArrayList<>();
  }

  @Override
  public void add(int value) {
    sorted.add(value);  // at the end, then move it left into place
    int i = sorted.size() - 1;
    while (i > 0 && sorted.get(i - 1) > value) {
      sorted.set(i, sorted.get(i - 1));  // shift the larger value right
      i--;
    }
    sorted.set(i, value);
  }

  @Override
  public double median() {
    int count = sorted.size();
    if (count == 0) {
      throw new NoSuchElementException();
    }
    int mid = count / 2;
    if (count % 2 == 1) {
      return sorted.get(mid);  // odd count: the single middle value
    }
    return ((double) sorted.get(mid - 1) + sorted.get(mid)) / 2;
  }
}
