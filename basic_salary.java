import java.util.Scanner;

public class basic_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        float bs = sc.nextFloat();

        float da = bs * 0.4f;
        float hra = bs * 0.2f;

        float gs = bs + da + hra;
        System.out.println(gs);

    }
}
