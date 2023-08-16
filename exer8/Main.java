public class Main {
  public static void main(String[] args) {
    //勇者を生成
    Hero h = new Hero();
    
    //フィールドに初期値をセット
    h.name = "otete";
    h.hp = 100;
    System.out.println("勇者" + h.name + "が誕生した！");
    
    //勇者の操作
    h.sit(5);
    h.slip();
    h.sit(20);
    h.run();
  }
}