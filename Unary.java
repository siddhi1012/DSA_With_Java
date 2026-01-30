public class Unary {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println("Before:" + a);
        // ++a;
        // System.out.println("After:" + a);
        int a = 5;
        int b = 3;
        int c = a++ + ++b + a;
        System.out.println(c);

    }
}
