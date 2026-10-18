import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Главное меню ---");
            System.out.println("1. Выполнить расчёт");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("4. Выход");
            System.out.print("Выберите пункт: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    runCalculation(sc);
                    break;
                case "2":
                    showProgramInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "4":
                    System.out.println("Выход из программы. Пока!");
                    return;
                default:
                    System.out.println("Неверный пункт.");
            }
        }
    }

    public static void runCalculation(Scanner sc) {
        double[] params = inputParams(sc);
        if (params == null) return;

        if (!checkParams(params)) {
            System.out.println("Ошибка: параметры должны быть строго больше 0.");
            return;
        }

        double result = calculate(params);
        output(params, result);
    }

    public static double[] inputParams(Scanner sc) {
        double[] params = new double[2];
        System.out.println("Расчет LC-контура. Введите 'exit' для отмены.");

        System.out.print("Индуктивность L (Гн): ");
        String in1 = sc.nextLine().trim();
        if (in1.equalsIgnoreCase("exit")) return null;

        System.out.print("Емкость C (Ф): ");
        String in2 = sc.nextLine().trim();
        if (in2.equalsIgnoreCase("exit")) return null;

        try {
            params[0] = Double.parseDouble(in1);
            params[1] = Double.parseDouble(in2);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод.");
            return null;
        }
        return params;
    }

    public static boolean checkParams(double[] params) {
        return params[0] > 0 && params[1] > 0;
    }

    public static double calculate(double[] params) {
        return 1.0 / (2 * Math.PI * Math.sqrt(params[0] * params[1]));
    }

    public static void output(double[] params, double result) {
        System.out.printf("Для L=%.4f и C=%.4f резонансная частота: %.4f Гц\n", params[0], params[1], result);
    }

    public static void showProgramInfo() {
        System.out.println("Программа вычисляет резонансную частоту LC-контура.");
    }

    public static void showDeveloperInfo() {
        System.out.println("Разработчик: Иван Корнеев");
    }
}