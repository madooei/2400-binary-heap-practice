package practice;

/** Runs the MedianFinder contract suite against TwoHeapsMedianFinder. */
public class TwoHeapsMedianFinderTest extends MedianFinderTest {

  @Override
  protected MedianFinder createFinder() {
    return new TwoHeapsMedianFinder();
  }
}
