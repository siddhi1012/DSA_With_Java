public class Swapping_without_third_value {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b :" + b);
    }
}
