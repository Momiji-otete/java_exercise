public class Hero {
  String name = "otete";
  int hp = 100;

  public void attack() {
    System.out.println(this.name + "の攻撃！");
    System.out.println("5ポイントのダメージを与えた！");
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}