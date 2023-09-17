public class Initializer {
  public static void main(String[] args) {
    Initializer() {
      System.out.println("A");
    }
    /*
      "{}"を初期化子といい、コンストラクタが実行される前に実行される。
      コンストラクタをオーバーロードする際に、共通する前処理があれば初期化子に記述することで
      コードが冗長にならなくて済む。
      今回のコードではインスタンスを作成した際に、初期化子から実行されるので、
      「B」と出力された後、「A」と出力される
    */
    {
      System.out.println("B");
    }
  }
}