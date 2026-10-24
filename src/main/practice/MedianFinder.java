package practice;

import java.util.NoSuchElementException;

/**
 * A MedianFinder takes in a stream of integers, one at a time, and reports the
 * median of every value seen so far.
 */
public interface MedianFinder {
  /**
   * Takes in the next value from the stream.
   * @param value the next number in the stream
   */
  void add(int value);

  /**
   * Returns the median of all values added so far. When the count is even,
   * this is the average of the two middle values.
   * @return the current median of the stream
   * @throws NoSuchElementException if no values have been added yet
   */
  double median();
}
