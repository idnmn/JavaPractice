import java.util.Scanner;

public class work2_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Программа выводит цифры числа справа налево.");

        System.out.print("Введите целое число N (> 0): ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: некорректный ввод.");
            return;
        }
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return;
        }

        while (N > 0) {
            System.out.print(N % 10 + " ");
            N /= 10;
        }
        System.out.println();
    }
}