import java.util.Scanner;

class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int counter_neg = 0;
        int counter_pos = 0;

        if (a < 0){
            counter_neg += 1;
        } else if (a > 0){
            counter_pos += 1;
        }

        if (b < 0){
            counter_neg += 1;
        } else if (b > 0){
            counter_pos += 1;
        }

        if (c < 0){
            counter_neg += 1;
        } else if (c > 0){
            counter_pos += 1;
        }

        System.out.printf("positive: %d; negative: %d", counter_pos, counter_neg);
    }
}
