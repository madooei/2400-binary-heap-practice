package demo;

import practice.MedianFinder;
import practice.SortedListMedianFinder;

/** A demo of SortedListMedianFinder on the stream from the notes. */
public final class SortedListMedianFinderDemo {

  private SortedListMedianFinderDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    MedianFinder finder = new SortedListMedianFinder();

    // Seen so far: 5. Expect 5.0.
    finder.add(5);
    System.out.println("add 5, median: " + finder.median());

    // Seen so far: 2 5. Expect (2 + 5) / 2 = 3.5.
    finder.add(2);
    System.out.println("add 2, median: " + finder.median());

    // Seen so far: 2 5 8. Expect 5.0.
    finder.add(8);
    System.out.println("add 8, median: " + finder.median());

    // Seen so far: 1 2 5 8. Expect (2 + 5) / 2 = 3.5.
    finder.add(1);
    System.out.println("add 1, median: " + finder.median());

    // Seen so far: 1 2 5 8 9. Expect 5.0.
    finder.add(9);
    System.out.println("add 9, median: " + finder.median());

    // Seen so far: 1 2 3 5 8 9. Expect (3 + 5) / 2 = 4.0.
    finder.add(3);
    System.out.println("add 3, median: " + finder.median());
  }
}
