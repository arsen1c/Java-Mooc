public class Rectangle {
  
  private double width, height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public static void main(String[] args) {
    Rectangle r = new Rectangle(5, 10);
    System.out.println("Aread of rectangle " + r.getArea()); // 50.0
  }
}