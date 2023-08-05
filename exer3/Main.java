public class Main {
  public static void main(String[] args) {
    System.out.println("以下break文の出力");
    for (int i = 1; i < 10; i++) {
      if (i % 3 == 0) {
        break;
      }
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("以下continue文の出力");
    for (int i = 1; i < 10; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}