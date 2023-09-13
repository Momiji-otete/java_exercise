public class ReplaceAll {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]","X"); //正規表現でマッチするものを変更する
    String rf = s.replaceFirst("[beh]","X"); //最初の1つだけを置換する
    String rp = s.replace("b", "X"); //第一引数が正規表現ではない
    System.out.println(w);
    System.out.println(rf);
    System.out.println(rp);
  }
}