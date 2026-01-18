import java.util.Scanner;

public class cm_to_km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lenth in Centimeter");
        double cm = sc.nextDouble();

        double m = cm / 100;
        double km = cm / 100000;

        System.out.println("Length in meter:" + m);
        System.out.println("Length in Kilometer:" + km);
    }
}
