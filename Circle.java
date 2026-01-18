import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius");
        double r = sc.nextDouble();

        double diameter = 2 * r;
        double Circumference = 2 * Math.PI *r ;
        double Area = Math.PI * r * r;

        System.out.println(diameter +" "+Circumference+" "+Area);
    }
}
