import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
  public static void main(String[] args) {

    ArrayList<Integer> ar = new ArrayList<Integer>();

    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);
    ar.add(5);
    ar.add(6);

    Iterator iter = ar.iterator();

    while(iter.hasNext()) {
      System.out.println(iter.next());
    }

  }
}
