//練習4-3
// 5行目の例外 NullPointerException
// 6行目の例外 ArrayIndexOutOfBoundsException

//練習4-4
public class Exercise4 {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int num : numbers) {
      if (num == input) {
        System.out.println("アタリ！");
      }
    }
  }
}