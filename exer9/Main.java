public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 8;
    Hero h1 = new Hero("otete");
    h1.sword = s;
    System.out.println("現在の武器は" + h1.sword.name);
    h1.attack();
    Hero h2 = new Hero("おてて");
    Wizard w = new Wizard();
    w.name = "おteて";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
  }
}