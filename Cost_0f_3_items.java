import java.util.*;

public class Cost_0f_3_items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 items Cost");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totl = (pencil+pen+eraser);
        System.out.println("total bill:"+totl);
        float newTotl = totl + (0.18f * totl) ;
        System.out.println("Bill with 18 % tax:"+newTotl);


    }

}
