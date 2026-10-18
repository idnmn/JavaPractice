import java.util.Scanner;

public class work2_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Программа вычисляет приближенное значение арктангенса.");

        System.out.print("Введите X (|X| < 1): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: некорректный ввод X.");
            return;
        }
        double X = sc.nextDouble();

        if (Math.abs(X) >= 1) {
            System.out.println("Ошибка: модуль X должен быть строго меньше 1.");
            return;
        }

        System.out.print("Введите N (N > 0): ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: некорректный ввод N.");
            return;
        }
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return;
        }

        double result = 0;
        for (int i = 0; i <= N; i++) {
            double term = Math.pow(-1, i) * Math.pow(X, 2 * i + 1) / (2 * i + 1);
            result += term;
        }

        System.out.println("arctan(" + X + ") ~ " + result);
    }
}