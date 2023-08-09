public class Exercise4 {
  public static double calcTriangleArea(double bottom, double height) {
    double ans = bottom * height / 2;
    return ans;
  }
  
  public static double calcCircleArea(double radius) {
    double ans = radius * radius * 3.14;
    return ans;
  }
  
  public static void main(String[] args) {
    System.out.println("三角形の面積は" + calcTriangleArea(10.0, 5.0) + "cm2です");
    System.out.println("円の面積は" + calcCircleArea(5.0) + "cm2です");
  }
}