import java.util.Scanner;

public class Practice6 {
    /**
     * объявнение
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        boolean b = scanner.nextBoolean();

        System.out.println(s + ", " + i + ", " + d + ", " + b);
    }
}
