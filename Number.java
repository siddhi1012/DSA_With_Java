public class Number {
    public static void main(String[] args) {
        int num = 1293;
        int unit = ((num % 10) + 1) % 10;
        num = num / 10;
        int tens = ((num % 10) + 1) % 10;
        num = num / 10;
        int huns = ((num % 10) + 1) % 10;
        num = num / 10;
        int thus = ((num % 10) + 1) % 10;
        num = num / 10;
        System.out.println(unit);
        System.out.println(tens);
        System.out.println(huns);
        System.out.println(thus);
    }

}
