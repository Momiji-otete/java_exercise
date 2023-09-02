public class Sample2_5 {
  public static void main(String[] args) {
    char[] c;
    c = new char[3];
    int[] i = new int[3];
    String str[] = {"Welcome ","to ","Java."};
    c[0] = 'A'; c[1] = 'B'; c[2] = 'C';
    i[0] = 100; i[1] = 200; i[2] = 300;
    System.out.println("str[]のサイズ：" + str.length);
    System.out.println("c[0]         ：" + c[0]);
    System.out.println("i[1]         ：" + i[1]);
    System.out.println(c); //char[]の配列名を出力すると配列に格納されている要素が出力される
    System.out.println(i);
    System.out.println(str);
  }
}