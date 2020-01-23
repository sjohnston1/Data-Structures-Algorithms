import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist {
  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<Integer>();

    ll.add(3);
    ll.add(2);
    ll.add(1);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.add(6);

    Iterator iter = ll.iterator();

    while(iter.hasNext()){
      System.out.println(iter.next());
    }

  }
}
