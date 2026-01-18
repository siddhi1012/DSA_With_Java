import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the length");
        int a = sc.nextInt();

        System.out.println("Enter the Breadth");
        int b = sc.nextInt();

        int Area = a * b ;
        int Perimeter = 2*( a * b);

        System.out.println("Area:" + Area);
        System.out.println("Perimeter:"+ Perimeter);

    }
    
}
