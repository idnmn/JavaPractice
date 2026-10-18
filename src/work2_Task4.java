import java.util.Scanner;

public class work2_Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Программа определяет знак числа.");

        System.out.print("Введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: некорректный ввод.");
            return;
        }
        int num = sc.nextInt();

        int result = getSign(num);
        System.out.println("Результат: " + result);
    }

    public static int getSign(int n) {
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}