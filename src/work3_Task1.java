public class work3_Task1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        int left = 0;
        int right = a.length - 1;

        System.out.print("Результат: ");
        while (left <= right) {
            if (left == right) {
                System.out.print(a[left] + " ");
            } else {
                System.out.print(a[left] + " " + a[right] + " ");
            }
            left++;
            right--;
        }
        System.out.println();
    }
}