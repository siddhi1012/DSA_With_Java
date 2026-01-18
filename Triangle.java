import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle One");
        int a = sc.nextInt();
        System.out.println("Enter angle Second");
        int b = sc.nextInt();
        System.out.println("Enter base");
        double base = sc.nextDouble();
        System.out.println("Enter the Height");
        double height = sc.nextDouble();

        int c = 180 - (a + b);
        System.out.println("Third Angle:" + c);

        double Area = (base * height) / 2;
        System.out.println("Area:" + Area);
    }

}
