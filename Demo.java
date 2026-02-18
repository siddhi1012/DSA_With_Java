import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 100;
        // int i = 1;
        // int sum = 0;
        // while (i <= n) {
        // System.out.println(i);
        // sum = sum + i;
        // i++;
        // }
        // System.out.println("Sum: " + sum);
        // for (int i = 1; i <= 5; i++) {
        // // for (int j = i; j <= 5; j++) {
        // // System.out.print("*");
        // // }
        // System.out.print("*");
        // }
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
