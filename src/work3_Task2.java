public class work3_Task2 {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 4, 9, 1, 10};
        int[] indices = new int[a.length];
        int count = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                indices[count++] = i;
            }
        }

        System.out.println("Количество таких элементов: " + count);
        System.out.print("Номера по убыванию: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(indices[i] + " ");
        }
        System.out.println();
    }
}