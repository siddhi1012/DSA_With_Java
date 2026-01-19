import java.util.*;

public class Simple_Interest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle,Time,Rate");
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();

        double SI = (p * t * r) / 100;
        System.out.println("SI:" + SI);
    }
}
