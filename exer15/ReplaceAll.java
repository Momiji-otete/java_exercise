public class ReplaceAll {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]","X");
    String rf = s.replaceFirst("[beh]","X"); //最初の1つだけを置換する
    System.out.println(w);
    System.out.println(rf);
  }
}