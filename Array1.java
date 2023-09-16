public class Array1 {
    public static void main(String[] args) throws Exception {
        int arrayA[][] = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
        int[][] arrayB = arrayA.clone();
        /*
          2次元配列に対してcloneメソッドを使うと1次元目のインスタンスは異なるが、
          1次元目のインスタンスがもつ2次元目のインスタンスは共有される
        */
        System.out.println("arrayA == arrayB : " + (arrayA == arrayB));
        System.out.println("arrayA[0] == arrayB[0] : " + (arrayA[0] == arrayB[0]));
        int total = 0;
        for (int[] tmp : arrayB) {
            for (int val : tmp) {
                total += val;
            }
        }
        System.out.println(total);
    }
}