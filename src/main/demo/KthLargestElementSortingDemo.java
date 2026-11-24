package demo;

import java.util.Arrays;
import practice.KthLargestElementSorting;

/** A demo of KthLargestElementSorting on the example the notes trace. */
public final class KthLargestElementSortingDemo {

  private KthLargestElementSortingDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] numbers = {3, 1, 5, 2, 4};
    int k = 2;
    System.out.println("numbers: " + Arrays.toString(numbers) + ", k = " + k);

    // Sorted, the values are 1 2 3 4 5, so the 2nd largest is 4.
    int answer = KthLargestElementSorting.findKthLargest(numbers, k);
    System.out.println("2nd largest: " + answer);

    // findKthLargest sorts numbers in place.
    System.out.println("numbers after: " + Arrays.toString(numbers));
  }
}
