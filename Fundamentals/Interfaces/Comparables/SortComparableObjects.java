import java.util.Arrays;

public class SortComparableObjects {
  public static void main(String[] args) {
    /*
      
      - Since all Comparable objects have the "compareTo" method, the java.util.Arrays.sort(Object[])
        method uses the "compareTo" method to compare and sort the objects in the Array.
      - Provided the objects are instances of the Compareable interface.

    */

      String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
      System.out.println("Before sort: " + Arrays.toString(cities));
      Arrays.sort(cities);
      System.out.println("After sort: " + Arrays.toString(cities));
  }
}