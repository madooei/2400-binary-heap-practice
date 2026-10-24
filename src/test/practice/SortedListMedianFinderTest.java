package practice;

/** Runs the MedianFinder contract suite against SortedListMedianFinder. */
public class SortedListMedianFinderTest extends MedianFinderTest {

  @Override
  protected MedianFinder createFinder() {
    return new SortedListMedianFinder();
  }
}
