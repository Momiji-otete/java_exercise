import java.util.*;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  
  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
  }
  
  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
    
    // int rand = new java.util.Random().nextInt(3);
    // int restoredMp = sec + rand;
    // if (this.mp + restoredMp > this.MAX_MP) {
    //   restoredMp = this.MAX_MP - this.mp;
    // }
    int restore = new Random().nextInt(3) + sec;
    
    int restoredMp = Math.min(this.MAX_MP - this.mp, restore);

    
    this.mp += restoredMp;
    System.out.println("MPが" + restoredMp + "回復した");
    return restoredMp;
  }
}