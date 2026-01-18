import java.util.*;

public class Student_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 5 Subject");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int total = (a + b + c + d + e) / 5;
        int avg = total / 5;
        int percentage = (total / 500) * 100;
        System.out.println("Average:" + avg);
        System.out.println("Percentage" + percentage);

    }

}
