public class Exercise2 {
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void main(String[] args) {
    //email("メール", "a@a", "見えていますか？");
    String title = "メール";
    String address = "a@a";
    String text = "見えていますか？";
    email(title, address, text);
  }
}