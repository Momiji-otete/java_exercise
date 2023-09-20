public class Lambda {
  public static void main(String[] args) {
    Function f = (name) -> {
      return "hello," + name;
    };
    /*
    1行で記述する際に、中かっこを省略するときはreturnを省略しないといけない。
    returnを記述すると逆にコンパイルエラーとなる。
    ・Function f = (name) -> "hello," + name;
    
    ラムダ式の引数宣言では、引数が1つのときだけ、引数のかっこ()を省略できる。
    ・Function f = name -> {
      return "hello," + name;
    };
    */
    System.out.println(f.test("Lambda"));
  }
  private static interface Function {
    String test(String name);
  }
}