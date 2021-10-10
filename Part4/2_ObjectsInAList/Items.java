import java.util.Date;

public class Items {
  private String name;
  private Date date;

  public Items(String name) {
    this.name = name;
    this.date = new Date();
  }

  public String toString() {
    return name + "(created at: " + date + ")";
  }
}