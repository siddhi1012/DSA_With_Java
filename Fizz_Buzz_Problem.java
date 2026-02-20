public class Fizz_Buzz_Problem {
    public static void main(String[] args) {

        int n = 15;
        int counter3 = 0;
        int counter5 = 0;

        for (int i = 1; i <= n; i++) {

            counter3++;
            counter5++;

            if (counter3 == 3 && counter5 == 5) {
                System.out.print("FizzBuzz ");
                counter3 = 0;
                counter5 = 0;
            }
            else if (counter3 == 3) {
                System.out.print("Fizz ");
                counter3 = 0;
            }
            else if (counter5 == 5) {
                System.out.print("Buzz ");
                counter5 = 0;
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}