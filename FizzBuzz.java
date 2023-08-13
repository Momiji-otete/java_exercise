public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            fizzBuzz(i);
        }
    }
    
    public static void fizzBuzz(int number) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        int fizzNum = 3;
        int buzzNum = 5;
        if (number % (fizzNum * buzzNum) == 0) {
            System.out.println(fizz + buzz);
        } else if (number % fizzNum == 0) {
            System.out.println(fizz);
        } else if (number % buzzNum == 0) {
            System.out.println(buzz);
        } else {
            System.out.println(number);
        }
    }
}