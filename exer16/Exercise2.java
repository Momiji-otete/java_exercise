import java.util.*;

public class Exercise2 {
  public static void main(String[] args) {
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    // Iterator<Hero> it = heroes.iterator();
    // while (it.hasNext()) {
    //   Hero h = it.next();
    //   System.out.println(h.getName());
    // }
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }
  }
}