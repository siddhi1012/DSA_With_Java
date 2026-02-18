import java.util.*;

public class Alphabet_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is alphabet");
        } else {
            System.out.println(ch + "is not a alphabet");
        }

    }

}
