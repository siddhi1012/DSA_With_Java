public class isPrime {
    public static void main(String[] args) {
        int n = 12;
        int div = 2;
        boolean isPrime = true;
        while (div < n) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        if (isPrime) {
            System.out.println(n + " prime number");
        } else {
            System.out.println(n + " not a prime number");
        }
    }
}
