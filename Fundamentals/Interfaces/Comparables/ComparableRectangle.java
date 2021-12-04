public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

  // Construct a ComparableRectangle with specified properties
	ComparableRectangle(double i, double l) {
		super(i, l);
	}

  // Implement the compareTo method defined in Comparable interface
  @Override
  public int compareTo(ComparableRectangle o) {
    // if getArea() of the Object that we are calling "compareTo" upon is more than
    // comparable Rectangle
    if (getArea() > o.getArea()) return 1;
    else if (getArea() < o.getArea()) return -1;
    else return 0;
  }

  @Override
  public String toString() {
    return "Width: " + getWidth() + " Height: " + getHeight() + "Area: " + getArea();
  }

  public static void main(String[] args) {
    ComparableRectangle x = new ComparableRectangle(4, 2); // getArea of x is more than y. Returns 1
    ComparableRectangle y = new ComparableRectangle(2, 2);
  
    System.out.println(x.compareTo(y));
  }

}