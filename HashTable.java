import java.util.Hashtable;

public class HashTable {
  public static void main(String[] args) {

    Hashtable<Character, Integer> test = new Hashtable<Character, Integer>();

    String in = "Hello";

    char[] ch = new char[in.length()];

    for (int i = 0; i < in.length(); i++) {
      ch[i] = in.charAt(i);
    }

    for (int i = 0; i < ch.length; i++) {
        if (test.containsKey(ch[i])) {
          test.put(ch[i], test.get(ch[i] + 1));
        } else {
          test.put(ch[i], 1);
        }
    }

    System.out.println(test.toString());
  }
}
