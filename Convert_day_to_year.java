import java.util.*;

public class Convert_day_to_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total days");
        int totl_days = sc.nextInt();
        int year = totl_days / 365;
    
        int remain_days = totl_days % 365;
        int week = remain_days / 7;
        int days = remain_days % 7;
        System.out.println(year + ":" + week + ":" + days);
    }

}
