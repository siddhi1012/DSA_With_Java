import java.util.*;

public class Convert_sec_to_hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Second");
        int totl_sec = sc.nextInt();

        int hour = totl_sec / 3600 ;
        int remainSecond = totl_sec  % 3600;
        int min = remainSecond / 60;
        int sec = remainSecond % 60 ; 
        System.out.println(hour+":"+min+":"+sec);



    }

}
