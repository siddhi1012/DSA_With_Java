import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number");
        int n = sc.nextInt();
        System.out.println("Enter the Number:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            if (ele % 2 == 0) {
                sumEven = sumEven + ele;
            } else {
                sumOdd = sumOdd + ele;
            }
        }
        System.out.println("Sum of Even :" + sumEven);
        System.out.println("Sum of Odd :" + sumOdd);

    }
}
