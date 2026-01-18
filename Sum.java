import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b ;

        System.out.println("sum:" + sum);
        System.out.println("Sub:"+ sub);
        System.out.println("mul:"+ mul);
        System.out.println("div:"+ div);
    }

}
