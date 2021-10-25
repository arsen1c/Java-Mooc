import java.util.ArrayList;
import java.util.Collection;

public class Test {
  public static void main(String[] args) {
    Collection<Integer> values = new ArrayList<>();
    values.add(3);
    values.add(2);

    for (Integer val: values) {
      System.out.println(val);
    }    
  }
}
