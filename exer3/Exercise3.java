/*
 練習3-1
 1: if (weight == 60)
 2: if ((age1 + age2) * 2 > 60)
 3: if (age % 2 == 1)
 4: if (name.equals("湊"))

 練習3-2
 条件式として適切なもの
 C. age != 30
 D. true
 E. b + 5 < 20

 練習3-3
 */
 public class Exercise3 {
   public static void main(String[] args) {
     int isHungry = 1;
     String food = "egg";
     System.out.println("こんにちは");
     if (isHungry == 0) {
       System.out.println("お腹がいっぱいです");
     } else {
       System.out.println("はらぺこです");
       System.out.println(food + "をいただきます");
     }
     System.out.println("ごちそうさまでした");
   }
 }