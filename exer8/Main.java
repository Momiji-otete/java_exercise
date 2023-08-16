public class Main {
  public static void main(String[] args) {
    //勇者を生成
    Hero h = new Hero();
    
    //フィールドに初期値をセット
    h.name = "otete";
    h.hp = 100;
    System.out.println("勇者" + h.name + "が誕生した！");
    
    //勇者の操作
    // h.sit(5);
    // h.slip();
    // h.sit(20);
    // h.run();
    Matango m1 = new Matango();
    m1.hp = 30;
    m1.suffix = 'A';
    System.out.println("お化けキノコ" + m1.suffix + "が現れた！");
    
    Matango m2 = new Matango();
    m2.hp = 30;
    m2.suffix = 'B';
    System.out.println("お化けキノコ" + m2.suffix + "が現れた！");
    
    //冒険のはじまり
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}