package practice;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * The contract test suite for the MedianFinder interface. A concrete subclass
 * supplies createFinder() to pick the solution. Medians are doubles, so each
 * comparison allows a small tolerance.
 */
public abstract class MedianFinderTest {

  private static final double TOLERANCE = 1e-9;

  private MedianFinder finder;

  protected abstract MedianFinder createFinder();

  @BeforeEach
  public void setup() {
    finder = createFinder();
  }

  @Test
  public void medianOfEmptyStreamThrows() {
    try {
      finder.median();
      fail("expected NoSuchElementException when asking for the median of an empty stream");
    } catch (NoSuchElementException e) {
      return;
    }
  }

  @Test
  public void medianOfOneValueIsThatValue() {
    finder.add(7);
    assertEquals(7.0, finder.median(), TOLERANCE);
  }

  @Test
  public void medianOfTwoValuesIsTheirAverage() {
    finder.add(5);
    finder.add(2);
    assertEquals(3.5, finder.median(), TOLERANCE);
  }

  @Test
  public void medianOfThreeValuesIsTheMiddleOne() {
    finder.add(5);
    finder.add(2);
    finder.add(8);
    assertEquals(5.0, finder.median(), TOLERANCE);
  }

  @Test
  public void smallValueAddedLastMovesTheMedian() {
    finder.add(5);
    finder.add(2);
    finder.add(8);
    finder.add(1);
    assertEquals(3.5, finder.median(), TOLERANCE);
  }

  @Test
  public void medianOfSixValuesAveragesTheTwoMiddles() {
    finder.add(5);
    finder.add(2);
    finder.add(8);
    finder.add(1);
    finder.add(9);
    finder.add(3);
    assertEquals(4.0, finder.median(), TOLERANCE);
  }

  @Test
  public void ascendingStreamAveragesTheTwoMiddles() {
    finder.add(1);
    finder.add(2);
    finder.add(3);
    finder.add(4);
    assertEquals(2.5, finder.median(), TOLERANCE);
  }

  @Test
  public void descendingStreamGivesTheMiddleValue() {
    finder.add(4);
    finder.add(3);
    finder.add(2);
    finder.add(1);
    finder.add(0);
    assertEquals(2.0, finder.median(), TOLERANCE);
  }

  @Test
  public void duplicateValuesCountSeparately() {
    finder.add(3);
    finder.add(3);
    finder.add(1);
    assertEquals(3.0, finder.median(), TOLERANCE);
  }

  @Test
  public void medianOfNegativeValuesIsNegative() {
    finder.add(-4);
    finder.add(-1);
    assertEquals(-2.5, finder.median(), TOLERANCE);
  }

  @Test
  public void medianOfManyValuesIsTheMiddleOne() {
    for (int i = 0; i < 101; i++) {
      finder.add((i * 37) % 101);  // each of 0 to 100 once, scrambled
    }
    assertEquals(50.0, finder.median(), TOLERANCE);
  }
}
