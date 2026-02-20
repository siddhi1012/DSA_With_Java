import java.util.*;

public class Fizz_Buzz_Problem {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 15;
        int counter3 = 0;
        int counter5 = 0;

        for (int i = 1; i <= n; i++) {
            counter3++;
            counter5++;
            if (counter3 == 3 && counter5 == 5) {
                System.out.println("FizzBuzz");
                counter3 = 0;
                counter5 = 0;
            } else if (counter3 == 3) {
                System.out.println("Fizz");
                counter3 = 0;

            } else if (counter5 == 5) {
                System.out.println("Buzz");
                counter5 = 0;
            } else {
                System.out.println(i);
            }

        }

    }
}
