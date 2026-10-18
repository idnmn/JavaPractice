import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Программа вычисляет резонансную частоту LC-контура.");

        System.out.print("Введите индуктивность L (в Генри): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: некорректный ввод индуктивности.");
            return;
        }
        double L = sc.nextDouble();

        System.out.print("Введите емкость C (в Фарадах): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: некорректный ввод емкости.");
            return;
        }
        double C = sc.nextDouble();

        if (L <= 0 || C <= 0) {
            System.out.println("Ошибка: индуктивность и емкость должны быть строго больше нуля.");
            return;
        }

        double f = 1.0 / (2 * Math.PI * Math.sqrt(L * C));
        System.out.printf("Резонансная частота: %.4f Гц\n", f);
    }
}