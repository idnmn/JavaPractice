import java.util.Scanner;

import static java.lang.Math.pow;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        //
        double y =3 * pow(x, 6) - 6 * pow(x, 2) - 5;
        System.out.printf("%.2f", y);
    }
}
